/**
 * Created by dmich on 3/6/2017.
 *
 */
public class BruteforceKnapsack {
    private static int bestValue;
    private static int currentValue;
    public static int knapsack(int[] profit,int[] weight,int capacity,int n){

        // Base Case
        if (n == 0 || capacity == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (weight[n-1] > capacity)
            return knapsack(profit, weight, capacity, n-1);

            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
        else{
            int l = profit[n-1] + knapsack(profit, weight,capacity-weight[n-1] , n-1);
            int r = knapsack(profit,weight,capacity,n-1);
            return Math.max(l,r);
    }



    }
}
