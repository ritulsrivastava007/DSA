import java.util.*;

class Solution {

    public int[] longestRepeating(
            String s,
            String queryCharacters,
            int[] queryIndices) {

        char[] arr = s.toCharArray();
        int n = arr.length;

        // start index of each consecutive segment
        TreeMap<Integer, Integer> segments = new TreeMap<>();

        // length -> frequency
        TreeMap<Integer, Integer> freq = new TreeMap<>();

        // Build initial segments
        int start = 0;

        for (int i = 1; i <= n; i++) {
            if (i == n || arr[i] != arr[i - 1]) {
                addSegment(segments, freq, start, i - 1);
                start = i;
            }
        }

        int[] ans = new int[queryIndices.length];

        for (int q = 0; q < queryIndices.length; q++) {

            int index = queryIndices[q];
            char ch = queryCharacters.charAt(q);

            // No actual change
            if (arr[index] == ch) {
                ans[q] = freq.lastKey();
                continue;
            }

            // Find the segment containing index
            int startSeg = segments.floorKey(index);
            int endSeg = segments.get(startSeg);

            // Remove original segment
            removeSegment(segments, freq, startSeg, endSeg);

            // Left part
            if (startSeg < index) {
                addSegment(segments, freq, startSeg, index - 1);
            }

            // Updated character
            arr[index] = ch;
            addSegment(segments, freq, index, index);

            // Right part
            if (index < endSeg) {
                addSegment(segments, freq, index + 1, endSeg);
            }

            // Find the new segment containing index
            int curStart = segments.floorKey(index);
            int curEnd = segments.get(curStart);

            // Merge with left
            Integer leftStart = segments.lowerKey(curStart);

            if (leftStart != null && arr[leftStart] == arr[curStart]) {

                int leftEnd = segments.get(leftStart);

                removeSegment(segments, freq, leftStart, leftEnd);
                removeSegment(segments, freq, curStart, curEnd);

                addSegment(segments, freq, leftStart, curEnd);

                curStart = leftStart;
                curEnd = segments.get(curStart);
            }

            // Merge with right
            Integer rightStart = segments.higherKey(curStart);

            if (rightStart != null && arr[rightStart] == arr[curStart]) {

                int rightEnd = segments.get(rightStart);

                removeSegment(segments, freq, curStart, curEnd);
                removeSegment(segments, freq, rightStart, rightEnd);

                addSegment(segments, freq, curStart, rightEnd);
            }

            ans[q] = freq.lastKey();
        }

        return ans;
    }

    private void addSegment(
            TreeMap<Integer, Integer> segments,
            TreeMap<Integer, Integer> freq,
            int start,
            int end) {

        segments.put(start, end);

        int length = end - start + 1;

        freq.put(length, freq.getOrDefault(length, 0) + 1);
    }

    private void removeSegment(
            TreeMap<Integer, Integer> segments,
            TreeMap<Integer, Integer> freq,
            int start,
            int end) {

        segments.remove(start);

        int length = end - start + 1;

        if (freq.get(length) == 1) {
            freq.remove(length);
        } else {
            freq.put(length, freq.get(length) - 1);
        }
    }
}