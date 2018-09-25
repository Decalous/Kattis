
import java.util.Scanner;

public class bubbletea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] tea = new int[scanner.nextInt()];

        for (int i = 0; i < tea.length; i++){
            tea[i] = scanner.nextInt();
        }

        int[] topping = new int[scanner.nextInt()];

        for (int i = 0; i < topping.length; i++){
            topping[i] = scanner.nextInt();
        }

        int lowestSum = 3000; // sufficiently high number to start at
        for (int i = 0; i < tea.length; i++){
            int kmax = scanner.nextInt();
            for (int j = 0; j < kmax; j++){
                int sum = tea[i] + topping[scanner.nextInt() - 1];
                if (sum < lowestSum){
                    lowestSum = sum;
                }
            }
        }

        int money = scanner.nextInt();
        int studentTea = money / lowestSum - 1;
        if (studentTea < 0){
            studentTea = 0;
        }
        if (lowestSum == 3000){ // if no valid matches
            studentTea = 0;
        }
        System.out.println(studentTea);

    }
}
