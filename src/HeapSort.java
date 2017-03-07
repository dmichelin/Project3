import java.util.List;

/**
 * Created by daniel on 2/5/17.
 */
public class HeapSort {

    private static int heapsize;

    public static void timeSort(List<Comparable> A){
        long time = System.nanoTime();
        sort(A);
        time = System.nanoTime() - time;
        System.out.println(time);
    }

    public static void sort(List<Comparable> A){
        // Build the heap
        buildMaxHeap(A);
        // Sort through the heap
        for(int i = A.size()-1; i>1;i-- ){

            Comparable temp = A.get(i);
            A.set(i,A.get(0));
            A.set(0,temp);
            heapsize--;
            maxheapify(A,0);

        }
    }
    /*
        Builds a max heap
     */
    private static void buildMaxHeap(List<Comparable> A){
        heapsize = A.size()-1;
        for(int i = heapsize/2; i>= 0; i--){
            maxheapify(A,i);
        }
    }

    private static void maxheapify(List<Comparable> A, int i){
        int l = 2*i;
        int r= 2*i+1;
        int largest = i;
        // Go through the procedure finding the index of the largest element
        if(l < heapsize && A.get(l).compareTo(A.get(largest))==1){
            largest = l;
        }
        if(r < heapsize && A.get(r).compareTo(A.get(largest))==1){
            largest = r;
        }

        if(largest != i){
            Comparable temp = A.get(i);
            A.set(i,A.get(largest));
            A.set(largest,temp);
            maxheapify(A, largest);
        }
    }

}
