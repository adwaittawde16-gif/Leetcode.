class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        long n = num & 0xFFFFFFFFL; // 32-bit two's complement
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int remainder = (int)(n % 16);
            result.append(hexChars[remainder]);
            n /= 16;
        }

        return result.reverse().toString();
    }
}
