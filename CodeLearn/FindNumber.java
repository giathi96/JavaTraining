// Tìm sô tăng dần nhỏ nhất với giá trị bằng hoặc lớn hơn n.


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumber {
    public static void main(String[] args) {
        System.out.print(findNumber(9199999));
    }

    public static Boolean checkNumber(int number) {
        List<Integer> list = new ArrayList<Integer>();
        while(number > 0) {
            list.add(number % 10);
            number /= 10;
        }
        List<Integer> list2 = list.stream().sorted((item1, item2) -> item1 - item2).collect(Collectors.toList());
        List<Integer> list3 = list.stream().sorted((item1, item2) -> item2 - item1).collect(Collectors.toList());

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