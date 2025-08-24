class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false; // found bigger on right
                    break;
                }
            }
            
            if (isLeader) {
                result.add(arr[i]);
            }
        }
        
        return result;
    }
}
