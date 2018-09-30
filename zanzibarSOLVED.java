
import java.util.Scanner;

public class zanzibarSOLVED {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // read input
        int cases = scanner.nextInt();
        int[] solutions = new int[cases];
        for (int i = 0; i < cases; i++){
            solutions[i] = findImport(scanner);
        }
        for (int i = 0; i < cases; i++){
            System.out.println(solutions[i]);
        }
    }

    public static int findImport(Scanner scanner){

        int entry = scanner.nextInt();
        int previous = -1;
        int countImport = 0;
        int diff;
        while (entry != 0){
            if (previous != -1) {
                diff = entry - previous * 2;
                if (diff > 0){
                    countImport += diff;
                }
            }
            previous = entry;
            entry = scanner.nextInt();
        }
        return countImport;
    }
}
