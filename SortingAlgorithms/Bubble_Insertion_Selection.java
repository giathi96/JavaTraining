import java.util.Arrays;

public class Bubble_Insertion_Selection {
    public static void main(String[] args) {
        int[] arr = {3,6,1,5,2,4,0};
        selectionSort(arr);
        System.out.printf("Result: %s", Arrays.toString(arr));  
    }

    public static void bubbleSort (int[] arr){
        Boolean check = false;
        for(int i = 0; i < arr.length - 1; i++) {
            check = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = true;
                }
            }
            if(check == false) {
                break;
            }
        }
    }   

    public static void insertionSort (int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int current = arr[i];
            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j + 1] = current;
        }
    }

    public static void selectionSort (int[] arr){
        int minIndex;
        for(int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}