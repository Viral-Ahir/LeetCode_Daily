class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       String s = s1 + " " + s2;

       Map<String, Integer> wordCount = new HashMap<>();

       String[] words = s.split(" ");

       for (String word: words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) +1);
       }

       List<String> result = new ArrayList<>();

       for(Map.Entry<String, Integer> entry: wordCount.entrySet()){
        if(entry.getValue() == 1){
            result.add(entry.getKey());
        }
       } 
       return result.toArray(new String[0]); 
   
    // MORE SPACE    
    //     List<String> uncommonList = new ArrayList<>();
    //     List<String> viewed = new ArrayList<>();

    //     String[] str = s1.split(" ");
    //     System.out.println(Arrays.toString(str));
    //     for(String word: str){
    //         if (viewed.contains(word)){
    //             continue;
    //         }
    //         if(uncommonList.contains(word)){
    //             uncommonList.remove(word);
    //             viewed.add(word);
    //         } else {
    //             uncommonList.add(word);
    //         }
    //     }
        
    //     String[] str1 = s2.split(" ");
    //     for (String word: str1){
    //         if (viewed.contains(word)){
    //             continue;
    //         }
    //         if(uncommonList.contains(word)){
    //             uncommonList.remove(word);
    //             viewed.add(word);
    //         } else {
    //             uncommonList.add(word);
    //         }
    //     }
    //     return uncommonList.toArray(new String[0]);
    }
}