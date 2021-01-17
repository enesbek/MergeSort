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

        Random rand = new Random(11);
        
        MergeSort merge = new MergeSort();
        BottomUpMergeSort bmerge = new BottomUpMergeSort();
        
        
        for (int i = 0; i < x; i++){ 
            myArray[i] = rand.nextInt(100);
            myArray2[i] = rand.nextInt(100);
        }
        
        int start = (int) System.currentTimeMillis();
        
        merge.Sort(myArray, 0, myArray.length - 1);     
        
        int elapsedTime = (int) (System.currentTimeMillis() - start);

        System.out.println("Merge Sort: " + elapsedTime + " ms");
        
        start = (int) System.currentTimeMillis();
        
        merge.Sort(myArray, 0, myArray.length - 1);     
        
        elapsedTime = (int) (System.currentTimeMillis() - start);
        
        System.out.println("Bottom up Merge Sort: " + elapsedTime + " ms");
        
    }
}
