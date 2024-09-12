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

// class Solution {
//     public int countConsistentStrings(String allowed, String[] words) {
//         // Create a bitmask for allowed characters
//         int allowedMask = 0;
//         for (char c : allowed.toCharArray()) {
//             allowedMask |= (1 << (c - 'a'));
//         }

//         int count = 0;
//         for (String word : words) {
//             int wordMask = 0;
//             for (char c : word.toCharArray()) {
//                 wordMask |= (1 << (c - 'a'));
//             }
//             // Check if all bits of wordMask are in allowedMask
//             if ((wordMask & allowedMask) == wordMask) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }
