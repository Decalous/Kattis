// practice example of dynamic programming
public class stepsSOLVED {

    public static void main(String[] args){
        int stair = 4;
        System.out.println(dynamicProgramming(stair));
    }

    public static int dynamicProgramming(int stair){
        int[] methods = new int[stair + 1];
        methods[0] = 1;
        methods[1] = 1;
        methods[2] = 2;

        for (int i = 3; i < methods.length; i++){
            methods[i] = methods[i - 1] + methods[i - 2] + methods[i - 3];
        }

        return methods[stair];
    }
}
