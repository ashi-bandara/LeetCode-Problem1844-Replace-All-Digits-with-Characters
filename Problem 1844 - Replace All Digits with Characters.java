class Solution {
    public String replaceDigits(String s) {
        char[] arrayS = s.toCharArray();
        for (int i = 1; i < arrayS.length; i++) {
            int index = arrayS[i] - '0';
            arrayS[i] = shift(arrayS[i-1], index);
            i++;
        }
        return String.copyValueOf(arrayS);
    }

    private char shift(char character, int i) {
        int index = character - 'a';
        return (char) (index + i + 'a');
    }
}