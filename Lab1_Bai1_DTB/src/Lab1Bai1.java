import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		// Khởi tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        // Nhập họ và tên
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất kết quả ra màn hình với định dạng yêu cầu
        System.out.printf("%s %f điểm", hoTen, diemTB);

        // Đóng scanner để tránh rò rỉ tài nguyên
        scanner.close();
	}

}
