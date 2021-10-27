/*
    Mỗi quân nhân 1 cấp bậc x, quân nhân phải báo cáo cho người có cấp bậc x + 1.
    Viết hàm nhập 1 mảng, trả về số lượng quân nhân sẽ báo cáo trong mảng đó.
*/

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
