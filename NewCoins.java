public class NewCoins {

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

        // build win[] until you fill array through coins
        for (int i = 2; i < win.length; i++) {
            if (win[i - 1] == false) {
                win[i] = true;
            } else if ((i - x) >= 0 && win[i - x] == false) {
                win[i] = true;
            } else if ((i - y) >= 0 && win[i - y] == false) {
                win[i] = true;
            } else {
                win[i] = false;
            }
        }

        return win[coins];
    }
}
