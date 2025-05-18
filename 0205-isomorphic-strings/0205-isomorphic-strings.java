import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Set<Character> mappedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT) return false;
            } else {
                // Ensure no two characters from s map to the same character in t
                if (mappedChars.contains(chT)) return false;

                mapST.put(chS, chT);
                mappedChars.add(chT);
            }
        }

        return true;
    }
}
