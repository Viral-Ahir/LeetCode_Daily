class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hs = new HashMap<>();
        for(char c : s.toCharArray()){
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()){
            hs.put(c, hs.getOrDefault(c, 0) - 1);
        }
        for (int val: hs.values()){
            if(val != 0 ){
                return false;
            }
        }
        return true;
    }
}