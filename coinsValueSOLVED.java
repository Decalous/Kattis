import java.lang.Math;

public class coinsValueSOLVED {

    public static void main(String[] args){
        int[] coinVal = {25, 10, 5};
        int total = 30;
        System.out.println(minCoins(coinVal, total));

        int[] newCoinVal = {9, 6, 5, 1};
        int newTotal = 11;
        System.out.println(minCoins(newCoinVal, newTotal));

        int[] newerCoinVal = {5, 1, 6, 3, 16};
        int newerTotal = 55;
        System.out.println(minCoins(newerCoinVal, newerTotal));
    }

    public static int minCoins(int[] coinVal, int total){
        int[] dp = new int[total + 1];
        // initialize all values to a large number
        for (int i = 1; i < total + 1; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        // to get 0 cents, you need 0 coins
        dp[0] = 0;

        // build up the array
        for (int i = 1; i < total + 1; i++){
            // initialize the min as a large number
            int min = Integer.MAX_VALUE;
            // check each case of adding one coin of a value
            for (int j = 0; j < coinVal.length; j++){
                if (i - coinVal[j] >= 0){ // if valid
                    min = Math.min(min, dp[i - coinVal[j]] + 1);
                }
            }
            dp[i] = min;
        }
        return dp[total];
    }
}
