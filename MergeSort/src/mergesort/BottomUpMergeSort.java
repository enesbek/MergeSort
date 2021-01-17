package mergesort;
/**
 *
 * @author EnesBEK
 */
public class BottomUpMergeSort {
    
    public void sort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i *= 2) 
            for (int j = 0; j < n - i; j += i + i) {
                int mid = j + i - 1;
                int end = Math.min(j + i + i - 1, n - 1);
                merge(a, j, mid, end);
            }
        
    }
    
    private void merge(int Arr[], int start, int mid, int end) {

        int temp[] = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (Arr[i] <= Arr[j]) {
                temp[k] = Arr[i];
                k++;
                i++;
            } else {
                temp[k] = Arr[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            temp[k] = Arr[i];
            k++;
            i++;
        }

        while (j <= end) {
            temp[k] = Arr[j];
            k++;
            j++;
        }

        for (i = start; i <= end; i += 1) 
            Arr[i] = temp[i - start];
        
    }
}
