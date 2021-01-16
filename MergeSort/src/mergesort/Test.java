package mergesort;

import java.util.Random;

/**
 *
 * @author enesb
 */
public class Test {
    
    public static void main(String[] args) {
        int x = 32000000;
        
        int[] myArray = new int[x];

        Random rand = new Random(11);
        
        MergeSort merge = new MergeSort();
        
        for (int i = 0; i < x; i++) 
            myArray[i] = rand.nextInt(100);
        
        
        long start = System.currentTimeMillis();
        
        merge.Sort(myArray, 0, myArray.length - 1);     
        
        long elapsedTime = System.currentTimeMillis() - start;

        System.out.println(elapsedTime);
        
    }
}
