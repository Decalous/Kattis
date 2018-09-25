
import java.util.Scanner;

public class newCommercials {

    public static void main(String[] args) {

        // record start time
        // REMEMBER TO COMMENT OUT
//        long startTime = System.currentTimeMillis();

        // take input
        Scanner scanner = new Scanner(System.in);
        int numCommercials = scanner.nextInt();
        int[] commercialProfit = new int[numCommercials];
        int cost = scanner.nextInt();
        for (int i = 0; i < numCommercials; i++) {
            commercialProfit[i] = scanner.nextInt() - cost; // number of listeners - cost is profit
        }

        // Create new list using a growing total
        int total = 0;
        int[] profitTotals = new int[numCommercials];
        for (int i = 0; i < numCommercials; i++){
            total += commercialProfit[i];
            profitTotals[i] = total;
        }

        int resultTotal = 0;
        for (int i = findLowestIndex(profitTotals) + 1; i <= findHighestIndex(profitTotals); i++){
            resultTotal += commercialProfit[i];
        }

        System.out.println(resultTotal);

        // record endtime and calculate execution time
        // REMEMBER TO COMMENT OUT
//        long endTime = System.currentTimeMillis();
//        System.out.println("Total time: " + (endTime - startTime));

    }

    public static int findLowestIndex(int[] inList){
        int indexLowest = -1;
        int lowestVal = 2000;
        for (int i = 0; i < inList.length; i++){
            if (inList[i] < lowestVal){
                indexLowest = i;
                lowestVal = inList[i];
            }
        }
        return indexLowest;
    }

    public static int findHighestIndex(int[] inList){
        int indexHighest = -1;
        int highestVal = -1000;
        for (int i = 0; i < inList.length; i++){
            if (inList[i] > highestVal){
                indexHighest = i;
                highestVal = inList[i];
            }
        }
        return indexHighest;
    }
}
