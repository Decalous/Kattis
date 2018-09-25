
import java.util.Scanner;

public class newCD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int[] jack = new int[scanner.nextInt()];
        int jillCD = scanner.nextInt();
        for (int i = 0; i < jack.length; i++){
            jack[i] = scanner.nextInt();
        }
        int start = 0;
        for (int i = 0; i < jillCD; i++){
            int searched = scanner.nextInt();
            if (sortedSearch(jack, start, searched)){
                count++;
                start = searched;
            }
        }

        int trash = scanner.nextInt();
        trash = scanner.nextInt();

        System.out.println(count);

    }

    //public static boolean sortedSearch(int[] array, int increment, int searched){
    //    boolean unfinished = true;
    //    boolean result = false;
    //    while (unfinished){
    //        if (array[increment] == searched){
    //            result = true;
    //            unfinished = false;
    //        }else if (array[increment] > searched){
    //           unfinished = false;
    //        }else if (increment == array.length){
    //            unfinished = false;
    //        }
    //        increment++;
    //    }
    //    return result;
    //}

    public static boolean sortedSearch(int[] array, int increment, int searched){
        boolean unfinished = true;
        boolean result = false;
        while (unfinished){
            if (increment == array.length){
                unfinished = false;
            }else if (array[increment] == searched){
                unfinished = false;
                result = true;
            }else if (array[increment] > searched){
                unfinished = false;
            }
            increment++;
        }
        return result;
    }

}
