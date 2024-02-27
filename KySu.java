package bai6_1;

import java.util.Scanner;

public class KySu extends Person {
	private String nganh;
	int namTN;

	public KySu(String hoTen, String ngaySinh, String queQuan, String nganh, int namTN, int n) {
		super(hoTen, ngaySinh, queQuan);
		this.nganh = nganh;
		this.namTN = namTN;
	}

	public KySu() {
	}

	public KySu(String hoTen, String ngaySinh, String queQuan) {
		super(hoTen, ngaySinh, queQuan);
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public int getNamTN() {
		return namTN;
	}

	public void setNamTN(int namTN) {
		this.namTN = namTN;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập ngành: ");
		nganh = sc.nextLine();
		System.out.println("Nhập năm tốt nghiệp: ");
		namTN = sc.nextInt();
		sc.nextLine();
	}

	public void xuat() {
		super.xuat();
		System.out.println("Ngành: " + nganh);
		System.out.println("Năm tốt nghiệp: " + namTN);
	}
}
