import java.util.Scanner;

public class cetvrtaSOLVED {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstX = scanner.nextInt();
        int firstY = scanner.nextInt();
        int secondX = scanner.nextInt();
        int secondY = scanner.nextInt();
        int thirdX = scanner.nextInt();
        int thirdY = scanner.nextInt();

        if (firstX == secondX){
            System.out.print(thirdX + " ");
        }else if (firstX == thirdX){
            System.out.print(secondX + " ");
        }else{
            System.out.print(firstX + " ");
        }

        if (firstY == secondY){
            System.out.print(thirdY + " ");
        }else if (firstY == thirdY){
            System.out.print(secondY + " ");
        }else{
            System.out.print(firstY + " ");
        }
    }
}
