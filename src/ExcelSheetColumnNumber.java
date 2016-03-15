/**
 * LeetCode 171
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            result += (chars[i] - 'A' + 1) * Math.pow(26, chars.length-1 - i);
        }
        return result;
    }
}
