import java.util.Arrays;

public class CreatePhoneNumber{
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,0};
        System.out.printf("Using for: %s \n",CreatPhoneNumberUsingFor(number));
        System.out.printf("Using String.format: %s \n",CreatPhoneNumberUsingFor(number));
        System.out.printf("Using String.insert: %s",CreatPhoneNumberUsingStringInsert(number));
    }

    public static String CreatPhoneNumberUsingFor(int[] number) {
        String result = "(";
        for(int i = 0; i < number.length; i++){
            if (i == 0 || i == 1 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8 || i == 9 ) {
                result += number[i];
            } else if (i == 2) {
                result += number[i] + ") ";
            } else if (i == 5) {
                result += number[5] + "-";
            }
        }
        return result;
    }

    public static String CreatPhoneNumberUsingStringFormat(int[] number) {
        String result = String.format("(%d$d%d) %d%d%d-%d%d%d%d ", number[0], number[1], number[2], number[3], number[4], number[5], number[6], number[7], number[8], number[9]);
        return result ;
    }

    public static StringBuilder CreatPhoneNumberUsingStringInsert(int[] number) {
        String str = Arrays.toString(number).replaceAll("\\[|\\]|,\\s", "");
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, "(");
        sb.insert(4, ") ");
        sb.insert(9, "-");
        return sb;
    }
}
