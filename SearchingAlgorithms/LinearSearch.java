public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int number = 8;
        int result = linearSearch(arr, number);
        if(result != 1) {
            System.out.printf("Index of number: %d", result);
        } else {
            System.out.printf("Number not present in array");
        }
    }

    public static int linearSearch(int[] arr, int number) {
        int result = -1;
        int left = 0;
        int right = arr.length - 1;
        int loopCount = 1;
        for(left = 0; left <= right;) {
            if(arr[left] == number) {
                result = left;
                break;
            }

            if(arr[right] == number) {
                result = right;
                break;
            }
            left ++;
            right --;
            loopCount ++;
        }
        System.out.printf("Loop count: %d \n", loopCount);
        return result;
    }
}
