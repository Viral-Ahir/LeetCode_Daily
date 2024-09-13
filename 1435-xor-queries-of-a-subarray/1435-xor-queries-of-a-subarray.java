class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
    int n=arr.length;
        int[] pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++) {
            pre[i]=pre[i-1]^arr[i];
        }
        int[] answer=new int[queries.length];
        for(int k=0;k<queries.length;k++) {
            int i=queries[k][0];
            int j=queries[k][1];
            if(i==0) {
                answer[k]=pre[j];
            } else {
                answer[k]=pre[j]^pre[i-1];
            }
        }
        return answer;
    
    // BRUTE FORCE O(n^2)
    //     int[] answer = new int[queries.length];
    //     for (int i = 0; i < queries.length; i++) {
    //         int[] query = queries[i];
    //         int finalxor = arr[query[0]];
    //         for (int j = query[0] + 1; j<= query[1]; j++){
    //             finalxor = finalxor ^ arr[j];
    //         }
    //         answer[i] = finalxor;
    //     }
    //     return answer;
    }
}