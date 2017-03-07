/**
 * Created by dmich on 3/6/2017.
 */
public class Driver {
    public static void main(String[] args){
        int[] weights = new int[]{0,20,15,15};
        int[] profit = new int[]{0,40,25,25};
        int n = 40;

        System.out.print("Bruteforce :");
        Knapsack.solveBruteforce(profit,weights,n);
        System.out.print("Dynamic :");
        Knapsack.solveDynamically(profit,weights,n);
        System.out.print("Greedy :");
        Knapsack.solveGreedily(profit,weights,n);
    }
}
