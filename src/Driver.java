/**
 * Created by dmich on 3/6/2017.
 */
public class Driver {
    public static void main(String[] args){
        int[] weights = new int[]{0,20,15,15};
        int[] profit = new int[]{0,40,25,25};
        int n = 50;

        Knapsack.solveBruteforce(profit,weights,n);
        Knapsack.solveDynamically(profit,weights,n);
    }
}
