public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int number = 5;
        int result = binarySearchRecursion(arr, 0, arr.length - 1, number);
        if(result != -1) {
            System.out.printf("Index of number: %d", result);
        } else {
            System.out.printf("Number not present in array.");
        }
    }

    public static int binarySearch(int[] arr, int number) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if(arr[mid] == number)  {
                return mid;
            } else if(arr[mid] > number) {
                left = 0;
                right = mid - 1;
            } else {
                left = mid + 1;
                right = arr.length - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr, int left, int right, int number){
        if(left > right){
            return -1;
        }
        int mid = (left + right) /2;
        if(arr[mid] == number){
            return mid;
        } else if(arr[mid] > number) {
            return binarySearchRecursion(arr, left, mid - 1, number);
        } else { 
            return binarySearchRecursion(arr, mid + 1, right, number);
        } 
    }
}