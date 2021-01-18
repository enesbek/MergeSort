package mergesort;

import java.util.Random;
/**
 *
 * @author EnesBEK
 */
public class Test {
    
    public static void main(String[] args) {
        int x = 32000000;
        
        int[] myArray = new int[x];
        int[] myArray2 = new int[x];
        int[] myArray3 = new int[x];
        
        Random rand = new Random(1);
        
        MergeSort merge = new MergeSort();
        BottomUpMergeSort bmerge = new BottomUpMergeSort();
        MergeSort3Way merge3 = new MergeSort3Way();
        
        for (int i = 0; i < x; i++){ 
            myArray[i] = rand.nextInt(100);
            myArray2[i] = rand.nextInt(100);
            myArray3[i] = rand.nextInt(100);
        }
        
        int start = (int) System.currentTimeMillis();
        merge.Sort(myArray, 0, myArray.length - 1);     
        int elapsedTime = (int) (System.currentTimeMillis() - start);
        System.out.println("Merge Sort: " + elapsedTime + " ms");
        
        start = (int) System.currentTimeMillis();
        bmerge.sort(myArray2);     
        elapsedTime = (int) (System.currentTimeMillis() - start);
        System.out.println("Bottom up Merge Sort: " + elapsedTime + " ms");
        
        start = (int) System.currentTimeMillis();
        merge3.Sort3Way(myArray3);   
        elapsedTime = (int) (System.currentTimeMillis() - start);
        System.out.println("3 Way Merge Sort: " + elapsedTime + " ms");
    }
}
 
