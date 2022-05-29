package binarysearch;

public class GuessNumberHigherOrLower {

    /**
     * https://leetcode.com/problems/guess-number-higher-or-lower/
     * We are playing the Guess Game. The game is as follows:
     *
     * I pick a number from 1 to n. You have to guess which number I picked.
     *
     * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
     *
     * You call a pre-defined API int guess(int num), which returns three possible results:
     *
     * -1: Your guess is higher than the number I picked (i.e. num > pick).
     * 1: Your guess is lower than the number I picked (i.e. num < pick).
     * 0: your guess is equal to the number I picked (i.e. num == pick).
     * Return the number that I picked.
     *
     *
     *
     * Example 1:
     *
     * Input: n = 10, pick = 6
     * Output: 6
     * Example 2:
     *
     * Input: n = 1, pick = 1
     * Output: 1
     * Example 3:
     *
     * Input: n = 2, pick = 1
     * Output: 1
     *
     *
     * Constraints:
     *
     * 1 <= n <= 231 - 1
     * 1 <= pick <= n
     */

    final private static int NUMBER = 1702766719;

    public int guessNumber(int start, int end) {

        int mid = (int)(((long)start + (long)end) /2);
        //System.out.println(start+", "+mid+", "+ end);
        int guessedFlag = guess(mid);
        if (guessedFlag == 0){
            return mid;
        } else  if (guessedFlag == -1){
            return guessNumber(start, mid-1);
        } else {
            return guessNumber(mid+1, end);
        }
    }
    public int guessNumber(int n) {
        return guessNumber(1, n);
    }

    public int guess(int n){
         return NUMBER < n? -1 : NUMBER > n? 1 : 0 ;
    }

    public static void main(String[] args) {


        System.out.println( new GuessNumberHigherOrLower().guessNumber(2126753390));
    }
}
