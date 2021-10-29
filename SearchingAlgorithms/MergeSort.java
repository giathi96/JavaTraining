public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,200,1,9,8,7,6,10};
        mergeSort(arr, 0, arr.length - 1);
        for(int item : arr) {
            System.out.print(item + "\t");
        }
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
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        
        for(int i = 0; i < n1; i++) {
            lArr[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++) {
            rArr[j] = arr[mid + j + 1];
        }

        int i =0, j = 0, k = left;
        while(i < n1 && j < n2) {
            if(lArr[i] <= rArr[j]) {
                arr[k++] = lArr[i++];
            } else {
                arr[k++] = rArr[j++];
            }
        }
        
        while(i < n1) {
            arr[k++] = lArr[i++];
        }

        while(j < n2) {
            arr[k++] = rArr[j++];
        }
    }
}