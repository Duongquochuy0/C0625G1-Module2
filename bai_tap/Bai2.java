package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập usd cần đổi: ");
        int usd =scanner.nextInt();
        int vnd = rate*usd;
        System.out.println("Giá trị vnd là:" +vnd);
    }
}
