public class MagicSquare {

    public static void main(String[] args) {
        int [][] square = {
            {4,3,4,5,3},
            {2,7,3,8,4},
            {1,7,6,5,2},
            {0,4,9,5,5}
        };
        int[] result =  loopCheck(square);
        System.out.printf("Size: %d\nDiagonal: %d \n", result[1], result[0]);
    }

    // Check hình vuông bắt đầu từ vị trí [row][col] với size = size có phải là magic square không.
    public static int checkMagicSquare(int[][] square, int size, int row, int collum) {
        int sumD1 = 0;
        int sumD2 = 0;
        for (int i = 0; i < size; i++){
            sumD1 += square[row + i][collum + i];
            sumD2 += square[row + i][collum + size - i - 1];
        }
        if(sumD1!=sumD2){
            return -1;
        }

        for (int i = 0; i < size; i++) {
 
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < size; j++)
            {
                rowSum += square[row + i][collum + j];
                colSum += square[row + j][collum + i];
            }
            if (rowSum != colSum || colSum != sumD1)
                return -1;
        }

        return sumD1;
    }


    // Kiểm tra các ô vuông nhỏ có trong ô vuông lớn
    public static int[] loopCheck (int[][] arr) {
        int row = arr.length; 
        int collumns = arr[0].length;
        int size = Math.min(row, collumns);
        int[] result = {-1, size}; // trả về[Diagonal, size]
        Boolean isHave = false; // Kiểm tra xem với size đang lặp có Magic square không, nếu có thì break. Không cần kiểm tra với size nhỏ hơn

        while(size > 0) {
            result[1] = size;
            for(int i = 0; i <= row - size; i++) {
                for(int j = 0; j <= collumns - size; j++) {
                    if(result[0] < checkMagicSquare(arr, size, i, j)) {
                        result[0] = checkMagicSquare(arr, size, i, j);
                        isHave = true;
                    }
                }
            }
            if(isHave){
                break;
            }
            size--;
        }
        return result;
    }
}