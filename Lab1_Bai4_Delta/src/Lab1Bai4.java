import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số a, b, c từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);
        
        // Xuất kết quả
        System.out.println("Delta: " + delta);
        System.out.println("Căn delta: " + canDelta);
        
        scanner.close();
	}

}
