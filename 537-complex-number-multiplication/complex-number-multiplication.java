class Solution {

    public String complexNumberMultiply(String num1, String num2) {

        int plus1 = num1.indexOf('+');
        int real1 = Integer.parseInt(num1.substring(0, plus1));
        int imag1 = Integer.parseInt(
                num1.substring(plus1 + 1, num1.length() - 1)
        );

        int plus2 = num2.indexOf('+');
        int real2 = Integer.parseInt(num2.substring(0, plus2));
        int imag2 = Integer.parseInt(
                num2.substring(plus2 + 1, num2.length() - 1)
        );

        int real = real1 * real2 - imag1 * imag2;
        int imag = real1 * imag2 + imag1 * real2;

        return real + "+" + imag + "i";
    }
}