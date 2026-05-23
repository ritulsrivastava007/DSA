class Solution {
    public boolean validMountainArray(int[] arr) {
        int idx = IntStream.range(0, arr.length).reduce((i, j) -> arr[i] > arr[j] ? i : j).getAsInt();
        if (idx == 0 || idx == arr.length - 1) return false;
        int start = 0, end = arr.length - 1;
        for (int i = 0; i < idx; i++)
            if (arr[i] >= arr[i + 1]) return false;
            
        for (int i = idx; i < arr.length - 1; i++)
            if (arr[i] <= arr[i + 1]) return false;

        return true;
    }
}