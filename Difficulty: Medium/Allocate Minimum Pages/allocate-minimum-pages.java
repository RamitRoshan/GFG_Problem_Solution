class Solution {
    
    public int countStudents(int[] arr, int pages) {
        int n = arr.length;
        int students = 1;
        long pagesStudent = 0;

        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }
    
    public int findPages(int[] arr, int k) {
        // If students more than books, allocation impossible
        if (k > arr.length) return -1;

        int n = arr.length;

        // Set low = max book pages, high = sum of all pages
        int low = arr[0];
        int high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int students = countStudents(arr, mid);

            if (students > k) {
                // Too many students needed → increase allowed pages
                low = mid + 1;
            } else {
                // Possible solution → try to minimize
                result = mid;
                high = mid - 1;
            }
        }
        

        return result;
    }    
}
