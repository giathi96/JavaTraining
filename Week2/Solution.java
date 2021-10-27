import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] rank = {4, 4, 3, 3, 1, 0};
        System.out.println("Result = " + solution(rank));
    }

    public static int solution (int[] rank){
        int result = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int item : rank) {
            list.add(item);
        }
        
        for(int item : rank) {
            if(list.contains(item + 1)) {
                result++;
            }
        }
        return result;
    }
}
