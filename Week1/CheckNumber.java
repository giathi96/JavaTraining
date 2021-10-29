/* 
    Số đẹp là số không có các số tạo nên nó trùng nhau.
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckNumber{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int number = sc.nextInt();
        if(checkNumber(number)){
            System.out.println(number + " la mot so dep!");
        } else {
            System.out.println(number + " khong phai la mot so dep!");
        }
        sc.close();
    }

    public static Boolean checkNumber (int n) {
        int item = 0;
        Set<Integer> setA = new HashSet<Integer>();
        while (n > 0){
            item = n % 10;
            if(setA.contains(item)){
                return false;
            } else {
                setA.add(item);
                n /= 10;
            }
        }
        return true;
    }
}
