package ss1_tong_quan_java.bai_tap;

import java.net.SocketOption;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name =scanner.nextLine();
        System.out.println("Nhập tuổi của bạn");
        int age =scanner.nextInt();
        System.out.println("Xin chào " + name + " " +age+" tuổi");
    }
}
