package mergesort;

/**
 *
 * @author enesb
 */
public class MergeSort3Way {
    public void Sort3Way(int[] Arr) {
        if (Arr == null) 
            return;
        
        int[] temp = new int[Arr.length];

        for (int i = 0; i < temp.length; i++) 
            temp[i] = Arr[i];
        
        Sort3WayRec(temp, 0, Arr.length, Arr);

        for (int i = 0; i < temp.length; i++) 
            Arr[i] = temp[i];
        
    }

    private void Sort3WayRec(int[] temp, int low, int high, int[] Arr) {
        if (high - low < 2) 
            return;
        
        int mid1 = low + ((high - low) / 3);
        int mid2 = low + 2 * ((high - low) / 3) + 1;

        Sort3WayRec(Arr, low, mid1, temp);
        Sort3WayRec(Arr, mid1, mid2, temp);
        Sort3WayRec(Arr, mid2, high, temp);

        merge(Arr, low, mid1, mid2, high, temp);
    }

    private void merge(int[] A, int low, int mid1, int mid2, int high, int[] B) {
        int i = low, j = mid1, k = mid2, l = low;
        
        while ((i < mid1) && (j < mid2) && (k < high)) {
            if (A[i] < A[j]) {
                if (A[i] < A[k]) 
                    B[l++] = A[i++];
                else 
                    B[l++] = A[k++];
            } 
            else {
                if (A[j] < A[k]) 
                    B[l++] = A[j++];
                else 
                    B[l++] = A[k++];
            }
        }
 
        while ((i < mid1) && (j < mid2)) {
            if (A[i] < A[j]) 
                B[l++] = A[i++];
            else 
                B[l++] = A[j++];
        }

        while ((j < mid2) && (k < high)) {
            if (A[j] < A[k]) 
                B[l++] = A[j++];
            else 
                B[l++] = A[k++];
        }

        while ((i < mid1) && (k < high)) {
            if (A[i] < A[k]) 
                B[l++] = A[i++];
            else 
                B[l++] = A[k++];
        }

        while (i < mid1) 
            B[l++] = A[i++];
        
        while (j < mid2) 
            B[l++] = A[j++];

        while (k < high) 
            B[l++] = A[k++];
    }
}
