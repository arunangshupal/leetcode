'''
https://leetcode.com/problems/guess-number-higher-or-lower/
374. Guess Number Higher or Lower
Easy

1027

172

Add to List

Share
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.



Example 1:

Input: n = 10, pick = 6
Output: 6
Example 2:

Input: n = 1, pick = 1
Output: 1
Example 3:

Input: n = 2, pick = 1
Output: 1


Constraints:

1 <= n <= 231 - 1
1 <= pick <= n
'''

NUMBER = 1702766719


def guess(n):
    if NUMBER < n:
        return -1
    elif NUMBER > n:
        return 1
    else:
        return 0


class GuessNumberHigherOrLower:

    def _guessNumber(self, start: int, end: int) -> int:
        mid = ((start + end) / 2).__int__()
        guessed_flag = guess(mid)
        if guessed_flag == 0:
            return mid
        elif guessed_flag == -1:
            return self._guessNumber(start, mid - 1)
        else:
            return self._guessNumber(mid + 1, end)

    def guessNumber(self, n: int) -> int:
        return self._guessNumber(1, n)


if __name__ == '__main__':
    print(GuessNumberHigherOrLower().guessNumber(2126753390))
