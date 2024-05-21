//Bùi Công Anh - 715105005
package BuiCongAnh;

import java.util.Scanner;

public class ChuyenNganh {
	private String MaCN;
	private String TenCN;
	public ChuyenNganh() {
		super();
	}
	public ChuyenNganh(String maCN, String tenCN) {
		super();
		MaCN = maCN;
		TenCN = tenCN;
	}
	public String getMaCN() {
		return MaCN;
	}
	public void setMaCN(String maCN) {
		MaCN = maCN;
	}
	public String getTenCN() {
		return TenCN;
	}
	public void setTenCN(String tenCN) {
		TenCN = tenCN;
	}
	
	@Override
	public String toString() {
		return "ChuyenNganh [MaCN=" + MaCN + ", TenCN=" + TenCN + "]";
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma chuyen nganh");
		MaCN = sc.nextLine();
		System.out.println("Nhap ten chuyen nganh");
		TenCN = sc.nextLine();
	}
	public void xuat() {
		System.out.printf("Ma chuyen nganh: %s\nTen chuyen nganh: %s\n", MaCN, TenCN);
	}
	
}
