class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> uncommonList = new ArrayList<>();
        List<String> viewed = new ArrayList<>();

        String[] str = s1.split(" ");
        System.out.println(Arrays.toString(str));
        for(String word: str){
            if (viewed.contains(word)){
                continue;
            }
            if(uncommonList.contains(word)){
                uncommonList.remove(word);
                viewed.add(word);
            } else {
                uncommonList.add(word);
            }
        }
        
        String[] str1 = s2.split(" ");
        for (String word: str1){
            if (viewed.contains(word)){
                continue;
            }
            if(uncommonList.contains(word)){
                uncommonList.remove(word);
                viewed.add(word);
            } else {
                uncommonList.add(word);
            }
        }
        return uncommonList.toArray(new String[0]);
    }
}