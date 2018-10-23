import java.lang.Math;

public class effortTasksSOLVED {

    public static void main(String[] args){
        // int days = 5; not used
        int[] low = {1, 5, 4, 5, 3};
        int[] high = {3, 6, 8, 7, 6};
        System.out.println(findMax(low, high));

        int[] newLow = {4, 7, 2, 5, 1};
        int[] newHigh = {8, 2, 9 , 5, 6};
        System.out.println(findMax(newLow, newHigh));
    }

    public static int findMax(int[] low, int[] high){
        int[] max = new int[low.length + 1];
        max[0] = 0;
        max[1] = Math.max(low[0], high[0]);
        for (int i = 2; i < low.length + 1; i++){
            max[i] = Math.max(max[i - 2] + high[i - 1], max[i - 1] + low[i - 1]);
        }

        return max[low.length];
    }
}
