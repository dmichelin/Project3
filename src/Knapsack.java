/**
 * Created by dmich on 3/6/2017. Provides brute force,
 */
public class Knapsack {
    // Solution using dynamic programming
    public static void solveDynamically(int[]theProfit, int[] theWeight,int theCapacity){
            DynamicKnapsack.knapsack(theProfit,theWeight,theCapacity);
    }
    // Try all possible combinations of the knapsack
    public static void solveBruteforce(int[] profit, int[] weight, int capacity){
        //Base case
        System.out.println(BruteforceKnapsack.knapsack(profit,weight,capacity,profit.length));
    }

    //Solution using price/weight density
    public static void solveGreedily(int[] profit, int[] weight, int capacity){
        System.out.println(GreedyKnapsack.knapsack(profit,weight,capacity));
    }
}
