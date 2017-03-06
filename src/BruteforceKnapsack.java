/**
 * Created by dmich on 3/6/2017.
 *
 * TODO: Have this return the list of objects taken rather than the price
 */
public class BruteforceKnapsack {

    public static int knapsack(int[] profit,int[] weight,int capacity,int n){

        //base case
        if(n==0 || capacity ==0) return 0;

        //If the weight of the nth item is more than the knapsack capacity, it cannot be included
        if(weight[n-1]>capacity) return knapsack(profit,weight,capacity,n-1);

        else return Math.max(profit[n-1]+knapsack(profit,weight,capacity-weight[n-1],n-1),knapsack(profit,weight,capacity,n-1));

    }
}
