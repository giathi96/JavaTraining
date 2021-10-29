/* 
    Số đẹp là số không có các số tạo nên nó trùng nhau.
    Kiểm tra số đẹp bằng Regex.
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckNumberRegex {
    public static void main(String[] args) {
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

    public static boolean checkNumber(int number) {
        String str = String.valueOf(number);
        String pattern = "^(?!.*(.).*\\1)[0-9]+$";
        return Pattern.matches(pattern, str);
    }
}
