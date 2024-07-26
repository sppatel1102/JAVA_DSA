public class _04BuyAndSellStokesArray {

    public static int calMaxPro(int arr[]) {
        int BuyPrice = Integer.MAX_VALUE;
        int maxPro = 0;

        for (int i = 0; i < arr.length; i++) {
            if (BuyPrice < arr[i]) {
                int profit = arr[i] - BuyPrice;
                maxPro = Math.max(profit, maxPro);
            } else {
                BuyPrice = arr[i];
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 2, 3, 9, 4 };

        System.out.println(calMaxPro(prices));

    }

}
