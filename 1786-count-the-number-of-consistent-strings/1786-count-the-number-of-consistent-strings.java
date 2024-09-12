class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> hs = new HashSet<>();
        for(char c: allowed.toCharArray()){
            hs.add(c);
        }
        int count = words.length;
        for(String str: words){
            for(char c: str.toCharArray()){
                if(!hs.contains(c)){
                    count--;
                    break;
                } 
            }
        } 
        return count;
    }
}