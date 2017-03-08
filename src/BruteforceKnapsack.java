/**
 * Created by dmich on 3/6/2017.
 *
 */
public class BruteforceKnapsack {
    private static int bestValue;
    private static int currentValue;
    private static boolean timing = true;
    private static long startime;

    public static int knapsack(int[] profit,int[] weight,int capacity,int n){
        if(timing) startime = System.nanoTime();

        int intToReturn = knap(profit,weight,capacity,n);
        if(timing)Logger.log("Bruteforce_time.txt",(System.nanoTime() - startime)+"");
        return intToReturn;
    }

    private static int knap(int[] profit,int[] weight,int capacity,int n){

        // Base Case
        if (n == 0 || capacity == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (weight[n-1] > capacity)
            return knap(profit, weight, capacity, n-1);

            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
        else{
            int l = profit[n-1] + knap(profit, weight,capacity-weight[n-1] , n-1);
            int r = knap(profit,weight,capacity,n-1);
            return Math.max(l,r);
        }



    }
}
