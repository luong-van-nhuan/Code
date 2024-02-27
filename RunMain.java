package bai6_1;

import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<KySu> personlist = new ArrayList<>();
		System.out.println("Nhập số lượng kỹ sư");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin kỹ sư thứ " + (i + 1));
			KySu kySu = new KySu();
			kySu.nhap();
			personlist.add(kySu);
		}
		Collections.sort(personlist, new Comparator<KySu>() {
			@Override
			public int compare(KySu o1, KySu o2) {
				return o2.getNamTN() - o1.getNamTN();
			}
		});
		System.out.println("Danh sách các kỹ sư tốt nghiệp gần đây nhất");
		for (KySu kySu : personlist) {
			System.out.println("Thông tin các kỹ sư ");
			kySu.xuat();
		}
	}
}