// Last updated: 9/3/2025, 10:50:41 AM
class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i / 2] + (i % 2);
        }
        return arr;
    }
}
