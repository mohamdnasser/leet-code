class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 equals str2 + str1, if not there's no common divisor string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Helper logic to compute the GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the prefix of either string up to the gcd length
        return str1.substring(0, gcdLength);
    }

    // Inline the GCD function inside the same class
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}