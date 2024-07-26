public class _03TrappingRainwater {
    public static int trapping(int arr[]) {

        int n = arr.length;
        int trappedWater = 0;

        // calculate left max boundary - array

        int leftbound[] = new int[n];
        leftbound[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftbound[i] = Math.max(arr[i], leftbound[i - 1]);
        }

        // calculate right max boundary - array
        int rightbound[] = new int[n];
        rightbound[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightbound[i] = Math.max(arr[i], rightbound[i + 1]);
        }

        // loop
        for (int i = 0; i < n; i++) {

            // water level = min(leftmax bound,rightmax bound)
            int waterlevel = Math.min(leftbound[i], rightbound[i]);

            // trapped water = waterlevel - height[i];

            trappedWater += waterlevel - arr[i];

        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(trapping(arr));

    }
}

// time compexity O(n);