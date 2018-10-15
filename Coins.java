public class Coins {

    public static void main(String[] args){
        // x and y are amounts of coins you can take away, you can also take 1
        // y must be greater than x in this algorithm
        int x = 3;
        int y = 4;
        // how many coins A starts off with at the beginning of the game
        int coins = 5;
        if (Win(coins, x, y)){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }

    public static boolean Win(int coins, int x, int y){
            boolean win[] = new boolean[coins + 1];
            // these statements are always correct
            win[0] = false;
            win[1] = true;
            win[x] = true;
            win[y] = true;

            // initialize coin states between 1 and x
            for (int i = 2; i < x; i++){
                if (i % 2 == 0){ // if even
                    win[i] = false;
                }else{ // if odd
                    win[i] = true;
                }
            }

            // initialize coin states between x and y
            for (int i = x + 1; i < y; i++){
                if ((i - x) % 2 == 0){ // if difference is even
                    win[i] = true;
                }else{ // if difference is odd
                    win[i] = false;
                }
            }

            // can build win[] until you fill array through coins
            for (int i = y + 1; i < win.length; i++){
                if (win[i - 1] == win[i - x] == win[i - y] == true){ // if you can only force your opponent on a winning number you lose
                    win[i] = false;
                }else{ // if at least one of your moves can force opponent on a losing number then you win
                    win[i] = true;
                }
            }

            return win[coins];
    }
}
