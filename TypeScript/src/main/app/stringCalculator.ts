///<reference path="../../../node_modules/typescript/lib/lib.core.d.ts" />
export default class StringCalculator{
    public static add(numbers : string) : number {
        if(!numbers)
            return 0;

        var delimiters = this.parseDelimiters(numbers);

        var values : number[] = this.numbersToInt(numbers, delimiters);

        return values.reduce((a, b) => {
           return a + b;
        }, 0);
    }

    private static numbersToInt(numbers : string, delimiters: string[]) : number[] {
        var regex = new RegExp(delimiters.join("|"));

        return numbers.split(regex)
            .map((value:string)=> {
                value = value.replace("\n", "");
                var number = parseInt(value);
                return number ? number : 0;
            });
    }

    private static parseDelimiters(numbers) {
        var delimiters = [",", "\n"];
        if (numbers.indexOf("//") > -1) {
            var match:string = numbers.match(/(\/\/.*?\n)/g)[0];
            delimiters = [
                match.replace("//", "")
                    .replace("\n", "")
            ];
        }
        return delimiters;
    };
}
