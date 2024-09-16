class Solution {
    public int findMinDifference(List<String> timePoints) {
        int minimumTime = Integer.MAX_VALUE;

        List<Integer> minutes = new ArrayList<>();

        for(String time: timePoints){
            int hr = 10 * (time.charAt(0) - '0') + (time.charAt(1) - '0'); 
            int min = 10 * (time.charAt(3) - '0') + (time.charAt(4) - '0'); 
            minutes.add(hr*60+min);
        }

        Collections.sort(minutes);
        
        for (int i = 1; i< minutes.size(); i++){
            minimumTime  = Math.min(minimumTime, minutes.get(i) - minutes.get(i-1));
        }

        int n = minutes.size();
        minimumTime = Math.min(minimumTime, 1440 - (minutes.get(n-1)- minutes.get(0)));
        return minimumTime;
    }
}