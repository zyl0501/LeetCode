import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * LeetCode 242
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 *
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] table = new int[26];
        // 记录字母在第一个单词中出现的次数
        for(int i = 0; i < s.length(); i++){
            table[s.charAt(i)-'a']++;
        }
        // 减去字母在第二个单词中出现的次数
        for(int i = 0; i < t.length(); i++){
            table[t.charAt(i)-'a']--;
        }
        // 如果某个计数器不为0，则返回假
        for(int i = 0; i < 26; i++){
            if(table[i]!=0) return false;
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        int len = s.length();
        if(len != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            char c2 = t.charAt(i);
            if (map2.containsKey(c2)) {
                map2.put(c2, map2.get(c2) + 1);
            } else {
                map2.put(c2, 1);
            }
        }

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.get(c) == null || map2.get(c) == null || !Objects.equals(map.get(c), map2.get(c))) {
                return false;
            }
        }

        return true;
    }
}
