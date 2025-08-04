package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn đọc: ");
        int number = scanner.nextInt();
        String str ="";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Đây là số không");
                    break;
                case 1:
                    System.out.println("Đây là số một");
                    break;
                case 2:
                    System.out.println("Đây là số hai");
                    break;
                case 3:
                    System.out.println("Đây là số ba");
                    break;
                case 4:
                    System.out.println("Đây là số bốn");
                    break;
                case 5:
                    System.out.println("Đây là số năm");
                    break;
                case 6:
                    System.out.println("Đây là số sáu");
                    break;
                case 7:
                    System.out.println("Đây là số bảy");
                    break;
                case 8:
                    System.out.println("Đây là số tám");
                    break;
                case 9:
                    System.out.println("Đây là số chín");
                    break;
            }
        }
        if (number >=10 && number <20){
            switch (number){
                case 10:
                    System.out.println("Đây là số mười");
                    break;
                case 11:
                    System.out.println("Đây là số mười một");
                    break;
                case 12:
                    System.out.println("Đây là số mười hai");
                    break;
                case 13:
                    System.out.println("Đây là số mười ba");
                    break;
                case 14:
                    System.out.println("Đây là số mười bốn");
                    break;
                case 15:
                    System.out.println("Đây là số mười năm");
                    break;
                case 16:
                    System.out.println("Đây là số mười sáu");
                    break;
                case 17:
                    System.out.println("Đây là số mười bảy");
                    break;
                case 18:
                    System.out.println("Đây là số mười tám");
                    break;
                case 19:
                    System.out.println("Đây là số mười chín");
                    break;
            }
        } else if (number>=20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            switch (tens){
                case 2:
                    str+="Hai mươi";
                    break;
                case 3:
                    str+="Ba mươi";
                    break;
                case 4:
                   str+="Bốn mươi";
                    break;
                case 5:
                    str+="Năm mươi";
                    break;
                case 6:
                    str+="Sáu mươi";
                    break;
                case 7:
                    str+="Bảy mươi";
                    break;
                case 8:
                    str+="Tám mươi";
                    break;
                case 9:
                    str+="Chín mươi";
                    break;
            }
            switch (ones){
                case 0:
                    break;
                case 1:
                    str+=" mốt";
                    break;
                case 2:
                    str+=" hai";
                    break;
                case 3:
                    str+=" ba";
                    break;
                case 4:
                    str+=" bốn";
                    break;
                case 5:
                    str+=" năm";
                    break;
                case 6:
                    str+=" sáu";
                    break;
                case 7:
                    str+=" bảy";
                    break;
                case 8:
                    str+=" tám";
                    break;
                case 9:
                    str+=" chín";
                    break;
            }
            System.out.println(str);
        }
        else if(number>=100 && number<999){
            int hundreds = number / 100;
            int remainder = number % 100;
            int tens = remainder / 10;
            int ones = remainder % 10;
            switch (hundreds) {
                case 1:
                    str += "Một trăm";
                    break;
                case 2:
                    str += "Hai trăm";
                    break;
                case 3:
                    str += "Ba trăm";
                    break;
                case 4:
                    str += "Bốn trăm";
                    break;
                case 5:
                    str += "Năm trăm";
                    break;
                case 6:
                    str += "Sáu trăm";
                    break;
                case 7:
                    str += "Bảy trăm";
                    break;
                case 8:
                    str += "Tám trăm";
                    break;
                case 9:
                    str += "Chín trăm";
                    break;
            }
            if (remainder == 0) {
            } else if (remainder < 10) {
                str += " lẻ";
                switch (ones) {
                    case 1:
                        str += " một";
                        break;
                    case 2:
                        str += " hai";
                        break;
                    case 3:
                        str += " ba";
                        break;
                    case 4:
                        str += " bốn";
                        break;
                    case 5:
                        str += " năm";
                        break;
                    case 6:
                        str += " sáu";
                        break;
                    case 7:
                        str += " bảy";
                        break;
                    case 8:
                        str += " tám";
                        break;
                    case 9:
                        str += " chín";
                        break;
                }
            } else if (remainder >= 10 && remainder < 20) {
                switch (remainder) {
                    case 10:
                        str += " mười";
                        break;
                    case 11:
                        str += " mười một";
                        break;
                    case 12:
                        str += " mười hai";
                        break;
                    case 13:
                        str += " mười ba";
                        break;
                    case 14:
                        str += " mười bốn";
                        break;
                    case 15:
                        str += " mười lăm";
                        break;
                    case 16:
                        str += " mười sáu";
                        break;
                    case 17:
                        str += " mười bảy";
                        break;
                    case 18:
                        str += " mười tám";
                        break;
                    case 19:
                        str += " mười chín";
                        break;
                }
            } else {
                switch (tens) {
                    case 2: str += " hai mươi"; break;
                    case 3: str += " ba mươi"; break;
                    case 4: str += " bốn mươi"; break;
                    case 5: str += " năm mươi"; break;
                    case 6: str += " sáu mươi"; break;
                    case 7: str += " bảy mươi"; break;
                    case 8: str += " tám mươi"; break;
                    case 9: str += " chín mươi"; break;
                }
                switch (ones) {
                    case 0: break;
                    case 1: str += " mốt"; break;
                    case 2: str += " hai"; break;
                    case 3: str += " ba"; break;
                    case 4: str += " bốn"; break;
                    case 5: str += " lăm"; break;
                    case 6: str += " sáu"; break;
                    case 7: str += " bảy"; break;
                    case 8: str += " tám"; break;
                    case 9: str += " chín"; break;
                }
            }

        } else {
            str = "Ngoài khả năng";
        }

        System.out.println( str);
    }
}
