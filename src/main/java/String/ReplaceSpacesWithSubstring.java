package String;

/*
	Time Complexity : O(N)
	Space Complexity : O(1)

	Where 'N' is size of string of words.
*/

public class ReplaceSpacesWithSubstring {
    public static StringBuilder replaceSpaces(StringBuilder str) {
        int spaceCount = 0;

        // Count Number of Spaces.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount = spaceCount + 1;
            }
        }

        // Store thr current length of the string in a variable.
        int len = str.length();

        // Find the new length.
        int newLength;
        newLength = len + (spaceCount * 2);

        // Resize the current string.
        int oldLength = str.length();
        for (int i = 0; i < newLength - oldLength; i++) {
            str.append(' ');
        }

        // Index to end of string.
        int index = newLength - 1;

        // Fill string from end.
        for (int k = len - 1; k >= 0; k--) {
            if (str.charAt(k) == ' ') {
                str.setCharAt(index, '0');
                str.setCharAt(index - 1, '4');
                str.setCharAt(index - 2, '@');
                index = index - 3;
            }
            else {
                str.setCharAt(index, str.charAt(k));
                index = index - 1;
            }
        }
        // Return string.
        return str;
    }
}