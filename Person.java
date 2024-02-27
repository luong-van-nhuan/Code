package bai6_1;

import java.util.Scanner;

public class Person {
	protected String hoTen;
	protected String ngaySinh;
	protected String queQuan;

	public Person(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
	}

	public Person() {
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập ngày sinh: ");
		ngaySinh = sc.nextLine();
		System.out.println("Nhập quê quán: ");
		queQuan = sc.nextLine();
	}

	public void xuat() {
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Quê quán: " + queQuan);
	}
}
