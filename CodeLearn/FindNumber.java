// Tìm sô tăng dần nhỏ nhất với giá trị bằng hoặc lớn hơn n.
import java.util.ArrayList;
import java.util.Collections;

public class FindNumber {
    public static void main(String[] args) {
        System.out.print(findNumber(864783));
    }

    public static Boolean checkNumber(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        while(number > 0) {
            list.add(number % 10);
            list2.add(number % 10);
            list3.add(number % 10);
            number /= 10;
        }

        Collections.sort(list2);
        Collections.sort(list3, Collections.reverseOrder());

        if(list.equals(list2) || list.equals(list3)){
            return true;
        }
        return false;
    }

    public static int findNumber(int n) {

        int result = -1;
        for(int i = n; i > 0; i++){
            if(checkNumber(i)){
                result = i;
                break;
            }
        }
        return result;
    }
}