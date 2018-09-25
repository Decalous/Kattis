
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class commercials {

    public static void main(String[] args) {

        // record start time
        // REMEMBER TO COMMENT OUT
//        long startTime = System.currentTimeMillis();

        // take input
        Scanner scanner = new Scanner(System.in);
        int numCommercials = scanner.nextInt();
        List<Integer> commercialProfit = new ArrayList<>(numCommercials);
        int cost = scanner.nextInt();
        for (int i = 0; i < numCommercials; i++) {
            commercialProfit.add(scanner.nextInt() - cost); // number of listeners - cost is profit
        }

        // checking
//        for (int i = 0; i < commercialProfit.size(); i++){
//            System.out.println(commercialProfit.get(i));
//        }

        // Simplify the list
        commercialProfit = combineLikeSigns(commercialProfit);
        if (commercialProfit.size() > 2){
            trimFront(commercialProfit);
            // trimBack(commercialProfit);
        }

        // checking
//        for (int i = 0; i < commercialProfit.size(); i++){
//            System.out.println(commercialProfit.get(i));
//        }


        // Create new list using a growing total
        int total = 0;
        List<Integer> profitTotals = new ArrayList<>();
        for (int i = 0; i < commercialProfit.size(); i++){
            total += commercialProfit.get(i);
            profitTotals.add(total);
        }

        // checking
//        for (int i = 0; i < profitTotals.size(); i++){
//            System.out.println(profitTotals.get(i));
//        }

        int resultTotal = 0;
        for (int i = findLowestIndex(profitTotals) - 1; i <= findHighestIndex(profitTotals); i++){
            resultTotal += commercialProfit.get(i);
        }

        System.out.println(resultTotal);

        // record endtime and calculate execution time
        // REMEMBER TO COMMENT OUT
//        long endTime = System.currentTimeMillis();
//        System.out.println("Total time: " + (endTime - startTime));

    }

    public static List<Integer> combineLikeSigns(List<Integer> inList){
        List<Integer> outList = new ArrayList<>();
        for (int i = 0; i < inList.size() - 1; i++) {
            if ((inList.get(i) > 0) != (inList.get(i + 1) > 0)) {       // if signs are not equal
                outList.add(inList.get(i));                             // append first int to new list
            } else {                                                    // if signs are equal
                inList.set(i + 1, inList.get(i) + inList.get(i + 1));   // change second number to total of two
            }
        }
        outList.add(inList.get(inList.size() - 1));
        return outList;
    }

    public static void trimFront(List<Integer> inList){
        if (inList.get(0) < 0){ // if first num is negative
            inList.remove(0); // remove it
            trimFront(inList);
        }else{
            if (inList.get(0) + inList.get(1) < 0){
                inList.remove(0);
                inList.remove(1);
                trimFront(inList);
            }
        }
    }

    public static void trimBack(List<Integer> inList){
        if (inList.get(inList.size() - 1) < 0){
            inList.remove(inList.size() - 1);
            trimBack(inList);
        }else{
            if ((inList.get(inList.size() - 1) + inList.get(inList.size() - 2)) < 0){
                inList.remove(inList.get(inList.size() - 1));
                inList.remove(inList.get(inList.size() - 2));
                trimBack(inList);
            }
        }
    }

    public static int findLowestIndex(List<Integer> inList){
        int indexLowest = -1;
        int lowestVal = 2000;
        for (int i = 0; i < inList.size(); i++){
            if (inList.get(i) < lowestVal){
                indexLowest = i;
                lowestVal = inList.get(i);
            }
        }
        return indexLowest;
    }

    public static int findHighestIndex(List<Integer> inList){
        int indexHighest = -1;
        int highestVal = -1000;
        for (int i = 0; i < inList.size(); i++){
            if (inList.get(i) > highestVal){
                indexHighest = i;
                highestVal = inList.get(i);
            }
        }
        return indexHighest;
    }
}
