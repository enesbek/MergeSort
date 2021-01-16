package mergesort;
/**
 *
 * @author EnesBEK
 */
public class MergeSort {
    
    void Sort(int Arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            Sort(Arr, left, mid);
            Sort(Arr, mid + 1, right);
            merge(Arr, left, mid, right);
        }
    }
    
    void merge(int Arr[], int left, int mid, int right) {

        int temp[] = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (Arr[i] <= Arr[j]) {
                temp[k] = Arr[i];
                i++;
            } 
            else {
                temp[k] = Arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = Arr[i];
            k++;
            i++;
        }

        while (j <= right) {
            temp[k] = Arr[j];
            k++;
            j++;
        }

        for (i = left; i <= right; i += 1) 
            Arr[i] = temp[i - left];
    }
    
}
