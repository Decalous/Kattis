import java.lang.Math;

public class RobberSOLVED {

    public static void main(String[] args){
        int[] houseVal = {6, 7, 1, 3, 8 , 2, 4};
        System.out.println(robMax(houseVal));

        int[] newHouseVal = {5, 3, 4, 11, 2};
        System.out.println(robMax(newHouseVal));

    }

    public static int robMax(int[] houseVal){
        int[] max = new int[houseVal.length + 1];
        max[0] = 0;
        max[1] = houseVal[0];

        for (int i = 2; i < max.length; i++){
            max[i] = Math.max(max[i -1], max[i - 2] + houseVal[i - 1]);
        }

        return max[houseVal.length];
    }

}
