public class MergeSort {
    public static void main(String[] args) {
        
    }

    public static void mergeSort(int[] arr, int left, int right) {
        int mid;
        if(left < right) {
            mid = (left + right) / 2;
            mergeSort(arr, left, mid );
            mergeSort(arr, mid + 1, right );
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        
    }
}