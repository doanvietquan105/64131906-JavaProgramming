import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập chiều dài và chiều rộng từ bàn phím
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        
        // Tính chu vi, diện tích và cạnh nhỏ nhất
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);
        
        // Xuất kết quả
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + canhNhoNhat);
        
        scanner.close();

	}

}
