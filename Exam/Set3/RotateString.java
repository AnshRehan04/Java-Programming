public class RotateString {
    public static String rotateStringRight(String str, int n) {
        // Handle cases where n is greater than the string length
        int length = str.length();
        n = n % length;

        // Get the last n characters and the rest of the string
        String rotatedPart = str.substring(length - n);
        String remainingPart = str.substring(0, length - n);

        // Concatenate the rotated part with the remaining part
        return rotatedPart + remainingPart;
    }

    public static void main(String[] args) {
        String str = "abcdef";
        int n = 2;
        System.out.println(rotateStringRight(str, n)); // Output: "efabcd"
    }
}
