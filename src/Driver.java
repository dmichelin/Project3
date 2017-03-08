import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

/**
 * Created by dmich on 3/6/2017.
 */
public class Driver {
    public static void main(String[] args){
        int[] weights = new int[]{0,0,20,15,15};
        int[] profit = new int[]{0,0,40,25,25};
        int n = 40;

        System.out.print("Bruteforce :");
        Knapsack.solveBruteforce(profit,weights,n);
        System.out.print("Dynamic :");
        Knapsack.solveDynamically(profit,weights,n);
        System.out.print("Greedy :");
        Knapsack.solveGreedily(profit,weights,n);
    }

    public static void compare(int n){
        Random random;
        int[] weights = new int[n];
        int[] profit = new int[n];
        for(int i =0;i<n;i++){
            random = new Random();
            weights[i]= random.nextInt(100);
            profit[i]= random.nextInt(100);
        }
        try {
            Knapsack.solveBruteforce(profit,weights,n);
            Knapsack.solveDynamically(profit,weights,n);
            Knapsack.solveGreedily(profit,weights,n);

        }catch (Exception err){

        }

    }
}
