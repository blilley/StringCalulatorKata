import StringCalculator from '../../main/app/stringCalculator';
describe('String Calculator', () => {
    describe('when add', () => {
        describe('with null string', () => {
            it('should return 0', () => {
                expect(StringCalculator.add(null)).toBe(0);
            });
        });
        describe('with empty string', () => {
            it('should return 0', () => {
                expect(StringCalculator.add("")).toBe(0);
            });
        });
        describe('with single number', () => {
            it('should return number', () => {
                expect(StringCalculator.add("1")).toBe(1);
            });
        });
        describe('with two numbers', () => {
            it('should return sum', () => {
                expect(StringCalculator.add("1,2")).toBe(3);
            });
        });
        describe('with many numbers', () => {
            it('should return sum', () => {
                expect(StringCalculator.add("1,2,3,4")).toBe(10);
            });
        });
        describe('with two numbers with a new line', () => {
            it('should return sum', () => {
                expect(StringCalculator.add("1\n2,3")).toBe(6);
            });
        });
        describe('with custom delimiter', () => {
            it('should return sum', () => {
                expect(StringCalculator.add("//;\n1;2")).toBe(3);
            });
        });
    });
});
