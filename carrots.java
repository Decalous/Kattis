import java.util.Scanner;

public class carrots {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contestants = scanner.nextInt();
        int carrots = scanner.nextInt();
        scanner.nextLine(); // java dumb

        for (int i = 0; i < contestants; i++){
            scanner.nextLine();
        }
        System.out.print(carrots);
    }
}
