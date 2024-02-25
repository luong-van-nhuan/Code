package bai6_1;

import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.util.Scanner;

public class RunMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập số lượng kỹ sư");
		int n = sc.nextInt();
		KySu[] dskySu  = new KySu[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin kỹ sư thứ " + (i+1));
			dskySu[i] = new KySu();
			dskySu[i].nhap();
		}
		System.out.println("Danh sách các kỹ sư");
		for (int i = 0; i < n; i++) {
		System.out.println("Thông tin các kỹ sư thứ " + (i + 1));
		dskySu[i].xuat();
		}
	}
}
