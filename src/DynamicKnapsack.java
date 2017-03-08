/**
 * Created by daniel on 2/20/17 for the solution to the knapsack problem. Uses snippets from Sartaj
 * Sahni's Data Stuctures
 */
public class DynamicKnapsack {
    private static int[][] fArray ;
    private static int[] profit;
    private static int[] weight;
    private static int numObjects;

    static void knapsack(int[]theProfit, int[] theWeight,int theCapacity){
        profit = theProfit;
        weight=theWeight;

        numObjects = theProfit.length-1;
        fArray = new int[numObjects+1][theCapacity+1];
        for(int i = 0; i<=numObjects;i++){
            for(int j = 0; j<=theCapacity;j++){
                fArray[i][j]=-1;
            }
        }
        System.out.println(fill(0,theCapacity));
        //traceback(fArray,weight,theCapacity,new int[numObjects+1]);

    }

    private static int fill(int i, int capacity){
        // If a solution already exists, return the solution

        if(fArray[i][capacity]>=0){
            return fArray[i][capacity];
        }
        // Either make the capacity 0 or the profit if at the end
        if(i==numObjects){
            fArray[i][capacity] = (capacity<weight[numObjects])
                    ? 0 : profit[numObjects];
            return fArray[i][capacity];
        }
        // Do the next row
        if(capacity<weight[i]) fArray[i][capacity]=fill(i+1,capacity);

        else fArray[i][capacity]= Math.max(fill(i+1,capacity),fill(i+1,capacity-weight[i])+profit[i]);
        return fArray[i][capacity];
    }
    /*
        Traces the solution back and prints the solution to the terminal
     */
    public static void traceback(int[][]f, int[] weight, int capacity, int[] x){
        for(int i = 0; i<numObjects;i++){
            if(f[i][capacity]==f[i+1][capacity]) x[i] = 0;
            else {
                x[i] =1;
                capacity -= weight[i];
            }
        }
        x[numObjects]= (f[numObjects][capacity]>0) ?1:0;

        for(int i = 1; i<=numObjects;i++){
            System.out.print(x[i]+ " ");
        }

    }
}
