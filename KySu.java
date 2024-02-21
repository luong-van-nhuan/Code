package bai6_1;

import java.util.Scanner;

public class KySu extends Person {
	private String nganh;
	private int namTN;
	private int n;
	private Person []person;
	public KySu(String hoTen, String ngaySinh, String queQuan, String nganh, int namTN, int n, Person[] person) {
		super(hoTen, ngaySinh, queQuan);
		this.nganh = nganh;
		this.namTN = namTN;
		this.n = n;
		this.person = person;
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

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Person[] getPerson() {
		return person;
	}

	public void setPerson(Person[] person) {
		this.person = person;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng kỹ sư: ");
		n = sc.nextInt();
		sc.nextLine();
		person = new Person[n];
		for (int i = 0; i < n; i++) {
			person[i] = new Person();
			person[i].nhap();
		System.out.println("Nhập ngành: ");
		nganh = sc.nextLine();
		System.out.println("Nhập năm tốt nghiệp: ");
		namTN = sc.nextInt();
		sc.nextLine();
		}
	}
	public void xuat() {
		System.out.println("Thông tin các kỹ sư");
		for (int i = 0; i < n; i++) {
			System.out.println("Thông tin kỹ sư " + (i +1));
			person[i].xuat();
		System.out.println("Ngành: " + nganh);
		System.out.println("Năm tốt nghiệp: " + namTN);
		}
	}	
}
