import java.util.Scanner;

//@@@@@@@@@@@@@@@ chương trình giải phương trình SỬ DỤNG PHƯƠNG THỨC @@@@@@@@@@@@@@

public class Quadratic {
	public static void main(String[] args) {
// Giới thiệu chương trình
		System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2\n");

		Scanner input = new Scanner(System.in);
// dữ liệu người dùng nhập vào
		System.out.print("Nhập vào hệ số a : ");
		double a = input.nextDouble();
		System.out.print("Nhập vào hệ số b : ");
		double b = input.nextDouble();
		System.out.print("Nhập vào hệ số c : ");
		double c = input.nextDouble();

		System.out.println("\n### KẾT QUẢ ###\n");
		double d = delta(b, a, c);

//############################ BIỆN LUẬN SỐ NGHIỆM ############################
		if (a == 0) {
			System.out.println("phương trình có một nghiệm : " + nghiem(c, b));
		} else {
			if (delta(b, a, c) > 0) {
				System.out.println(" phương trình có hai nghiệm\n x1= " + x1(a, b, c, d) + "\n x2= " + x2(a, b, c, d));

			} else {
				if (delta(a, b, c) == 0) {
					System.out.println("phương trình có nghiệm kép: " + xKep(b, a));
				} else {
					System.out.println("phương trình vô nghiệm");
				}
			}
		}
	}

	// ############################### TÍNH NGHIỆM# #############################
// tính delta
	public static double delta(double b, double a, double c) {
		return b * b - 4 * a * c;
	}

// tính nghiệm khi a = 0
	public static double nghiem(double c, double b) {

		return -c / b;
	}

// tính nghiệm khi delta > 0
	public static double x1(double a, double b, double c, double delta) {
		return (-b + Math.sqrt(delta)) / (2 * a);
	}

	public static double x2(double a, double b, double c, double delta) {
		return (-b - Math.sqrt(delta)) / (2 * a);
	}

// tính nghiệm khi delta = 0
	public static double xKep(double b, double a) {
		return -b / (2 * a);

	}
}
