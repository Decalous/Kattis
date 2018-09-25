
import java.util.Scanner;


public class spavanacSOLVED {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        if (minutes >= 45){
            minutes -= 45;
            System.out.print(hours + " ");
            System.out.print(minutes);
        }else if(hours != 0){
            minutes = minutes + 15;
            hours -= 1;
            System.out.print(hours + " ");
            System.out.print(minutes);
        }else{
            hours = 23;
            minutes = minutes + 15;
            System.out.print(hours + " ");
            System.out.print(minutes);
        }
    }
}
