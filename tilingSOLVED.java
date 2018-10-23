public class tilingSOLVED {

    public static void main(String[] args){
        System.out.println(tile(3));
        System.out.println(tile(4));

    }

    public static int tile(int width){
        int[] dp = new int[width + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < width + 1; i++){
            // the number of ways is split in two categories: one that ends with 1 vertical tile and one that
            // ends with 2 horizontal tiles
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[width];
    }
}
