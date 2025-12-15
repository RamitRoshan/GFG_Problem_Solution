class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        
        return solve(arr, arr.length - 1);
    }
    
    // helper recursive function
    private ArrayList<Integer> solve(int[] arr, int index) {

        // base case: single element
        if (index == 0) {
            ArrayList<Integer> base = new ArrayList<>();
            base.add(arr[0]); // min
            base.add(arr[0]); // max
            return base;
        }
        
        /*
        We want min & max of the array from index 0 to index
        To do that, we first find min & max of the smaller problem:
        That smaller problem is solved by the recursive call:
           solve(arr, index - 1)
        */
        // recursive call
        ArrayList<Integer> res = solve(arr, index - 1);

        // update min
        if (arr[index] < res.get(0)) {
            res.set(0, arr[index]);
        }

        // update max
        if (arr[index] > res.get(1)) {
            res.set(1, arr[index]);
        }

        return res;
    }

}
