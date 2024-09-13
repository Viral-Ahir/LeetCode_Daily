class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int finalxor = arr[query[0]];
            for (int j = query[0] + 1; j<= query[1]; j++){
                finalxor = finalxor ^ arr[j];
            }
            answer[i] = finalxor;
        }
        return answer;
    }
}