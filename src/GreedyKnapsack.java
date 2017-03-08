import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmich on 3/6/2017.
 */
public class GreedyKnapsack {

    private static boolean timing = true;
    private static long startime;

    public static int knapsack(int[] profit,int[] weight,int capacity){
        if(timing) startime = System.nanoTime();
        int priceToReturn = 0;
        // Create the price/density array
        List<Comparable> dArray = createDensityArray(profit,weight);

        // Sort the density
        HeapSort.sort(dArray);

        // Go bottom up
        for(int i = dArray.size()-1;i >=0;i--){
            PriceDensity priceDensity =(PriceDensity) dArray.get(i);
            if(capacity >= priceDensity.getWeight()){
                priceToReturn+=priceDensity.getPrice();
                capacity=capacity-priceDensity.getWeight();
            } else break;
        }
        if(timing) {
            Logger.log("Greedy_time.txt",(System.nanoTime() - startime)+"");
        }

        return priceToReturn;
    }

    private static List<Comparable> createDensityArray(int[] profit, int[] weight){
        List<Comparable> dArray = new ArrayList<Comparable>();
        for(int i = 0; i<weight.length;i++){
            dArray.add(new PriceDensity(profit[i],weight[i],i));
        }
        return dArray;
    }
}
