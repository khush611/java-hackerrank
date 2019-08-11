//Alpha and Beta. CodeSprint contest

/* Our friends Alpha and Beta found a magical treasure of Asgard. It consists of  piles of gold coins. It is magical since if anyone tries to take a pile of  coins, all the other piles of exactly  coins (if they exist) disappear.

Alpha and Beta only have one turn each to choose a pile for themselves starting with Alpha. In one turn, a complete pile of gold coins can be chosen and since our friends are smart they will choose the pile with the maximum coins.

Find the number of coins Beta will get in his turn.

Function Description

Complete the alphaBeta function in the editor below. It should return an integer representing the number of coins Beta will get in his turn.

alphaBeta has the following parameter(s):

pile: an integer array

Input Format

First line of the input contains a single integer , number of piles.
Second line of the input contains  space seperated integers, number of gold coins in each pile.
Constraints

 (where )
Output Format

Single integer which is the number of coins Beta will receive in his first turn.

Sample Input 0

6
1 2 3 3 2 1
Sample Output 0

2
Explanation 0

Alpha will select a pile of  coins in his turn. So due to magic the other pile of  coins will disappear and Beta will be left with 4 piles:

1 2 2 1
Hence Beta will select a pile of  coins.

Sample Input 1

5
1 2 3 4 5
Sample Output 1

4
Explanation 1

Alpha will select a pile of  coins in his turn. There are no other piles of  coins so none disappear. Hence Beta will select a pile of  coins.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'alphaBeta' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY pile as parameter.
     */

    public static int alphaBeta(List<Integer> pile) {
    // Write your code here
int sizelist=pile.size();
    
        int max=0;
        for(int i=0;i<sizelist;i++)
        {
          if(pile.get(i)>max)
              max=pile.get(i);
           
        }
        int max2=0;
        for(int i=0;i<sizelist;i++)
        {
          if((pile.get(i)>max2)&&(pile.get(i)!=max))
              max2=pile.get(i);
           
        }
        return max2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] pileTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> pile = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pileItem = Integer.parseInt(pileTemp[i]);
            pile.add(pileItem);
        }

        int result = Result.alphaBeta(pile);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
