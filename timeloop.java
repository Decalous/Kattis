import java.util.Scanner;

public class timeloop {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();
        for (int i = 1; i <= loop; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}
