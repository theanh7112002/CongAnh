//Bùi Công Anh - 715105005
package BuiCongAnh;

import java.util.Scanner;

public class GiaoTrinh extends ChuyenNganh{
	private String TenGT;
	private	double Gia;
	private PhanLoai PLGT = new PhanLoai();
	public GiaoTrinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoTrinh(String maCN, String tenCN) {
		super(maCN, tenCN);
		// TODO Auto-generated constructor stub
	}
	public String getTenGT() {
		return TenGT;
	}
	public void setTenGT(String tenGT) {
		TenGT = tenGT;
	}
	public double getGia() {
		return Gia;
	}
	public void setGia(double gia) {
		Gia = gia;
	}
	public PhanLoai getPLGT() {
		return PLGT;
	}
	public void setPLGT(PhanLoai pLGT) {
		PLGT = pLGT;
	}
	@Override
	public String toString() {
		return super.toString()+ "GiaoTrinh [TenGT=" + TenGT + ", Gia=" + Gia + ", PLGT=" + PLGT + "]";
	}
	public void nhapGiaoTrinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten giao trinh: ");
		TenGT = sc.nextLine();
		System.out.println("Nhap gia: ");
		Gia = sc.nextDouble();
		System.out.println("Co phai giao trinh co ban khong? ");
		PLGT.setGTCB(sc.nextBoolean());
		System.out.println("Nhap so luong: ");
		PLGT.setSoLuong(sc.nextInt());
		super.nhap();
		
	}
	public void xuat() {
		super.xuat();
		System.out.println("Ten giao trinh: %s\nGia: " +  Gia);
		if (PLGT.isGTCB()) {
			System.out.println("\nGiao trinh co ban");
			
		}
		else {
			System.out.println("\nGiao trinh nang cao");
		}
	}
}
