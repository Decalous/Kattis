import java.util.Scanner;

public class hissingmicrophone {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int length = word.length();
        boolean hiss = false;
        for (int i = 0; i < length - 1; i++){
            Character a = word.charAt(i);
            Character b = word.charAt(i + 1);
            if ((a.equals('s') || a.equals('S')) && (b.equals('s') || b.equals('S'))){
                hiss = true;
            }
        }
        if (hiss){
            System.out.println("hiss");
        }else{
            System.out.println("no hiss");
        }
    }
}
