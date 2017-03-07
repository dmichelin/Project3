/**
 * Created by daniel on 3/6/17.
 */
public class PriceDensity implements Comparable<PriceDensity> {
    int weight;
    int price;
    float density;
    int pos;

    public float getDensity() {
        return density;
    }

    public int getPos() {
        return pos;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public PriceDensity(int price, int weight, int p){
        if (weight ==0) density = 0;
        else density = price/weight;
        this.weight = weight;
        this.price = price;

        pos = p;

    }

    public int compareTo(PriceDensity p){

        return Float.compare(density,p.getDensity());
    }
}
