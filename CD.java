
import java.util.Scanner;

public class CD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean[] jack = new boolean[1000000000];
        int jackCD = scanner.nextInt();
        int jillCD = scanner.nextInt();
        for (int i = 0; i < jackCD; i++){
            jack[scanner.nextInt()] = true;
        }
        for (int i = 0; i < jillCD; i++){
            if (jack[scanner.nextInt()]){
                count++;
            }
        }

        int trash = scanner.nextInt();
        trash = scanner.nextInt();

        System.out.println(count);

    }

}
