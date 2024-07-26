import java.util.*;

public class _02Arrays {
    public static void revArr(int number[]) {
        int start = 0, end = number.length - 1;

        while (start < end) {
            // swap
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    public static void maxSubSum1(int number[]) {
        
        int maxSum = 0;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += number[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }


            }
        }
        System.out.println(maxSum);
    }

    public static void maxSubSum2(int number[]){

        int prefix[] = new int[number.length];
        prefix[0]= number[0];
        int currentSum = 0;

        // calculate the prefix array 
        for (int i = 1 ; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }
        // find the max sum
        int maxSum = 0;

        for( int i =0 ; i < prefix.length; i++){
            
            for (int j = i; j < prefix.length; j++){
                currentSum = i == 0 ?  prefix[j] : prefix[j] - prefix[i-1];

                if (maxSum < currentSum){
                    maxSum = currentSum;
                }
        }
        
    }System.out.println(maxSum);
}

    public static void maxSubSum3(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for(int i = 0 ; i < number.length; i++){
            currentSum += number[i];

            if (currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {

        int number[] = { -2, -6, -6, -8, -10 };
        // revArr(number);
        // maxSubSum1(number);
        // maxSubSum2(number);
        maxSubSum3(number);
        
        
    


    }
}