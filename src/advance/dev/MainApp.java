package advance.dev;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		i = sc.nextInt();
		Student a[] = new Student[i];
		input(a);
		print(a);
	}
	
	public static void input(Student a[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = new Student();
			System.out.println(String.format("Nhap thong tin sinh vien thu %d: ", i+1));
			System.out.println("Ten:");
			a[i].name = sc.nextLine();
			System.out.println("Tuoi:");
			a[i].age = sc.nextInt();
			System.out.println("Dia chi:");
			a[i].address = sc.nextLine();
			sc.nextLine();
			System.out.println("So dien thoai:");
			a[i].phoneNumb = sc.nextLine();
			System.out.println("Diem trung binh:");
			a[i].diemTB = sc.nextDouble();
			sc.nextLine();
		}
	}
	public static void print(Student a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(String.format("Ten: %s - Tuoi: %d - Dia chi: %s - SDT: %s - DTB: %.2f", a[i].name, a[i].age, a[i].address, a[i].phoneNumb, a[i].diemTB));
		}
	}

}


