package basic.dev;

import java.util.Scanner;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		  // Nhập tháng và năm
        System.out.print("9");
        int month = scanner.nextInt();
        System.out.print("2024");
        int year = scanner.nextInt();

        int daysInMonth = 0;

        // Kiểm tra số ngày của tháng
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Kiểm tra năm nhuận
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("2");
                return;
        }

        // In kết quả
        System.out.println("9" + month + "2024" + year + "15" + daysInMonth + "29");
    }
}