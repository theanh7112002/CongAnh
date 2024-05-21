//Bùi Công Anh - 715105005
package BuiCongAnh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_715105005 {
	public static ArrayList<GiaoTrinh> GT = new ArrayList<>();
	private static void yc1(int n) {
		for (int i=0; i< n; i++) {
			System.out.println("Nhap thong tin giao trinh" + (i+1));
			GiaoTrinh gt = new GiaoTrinh();
			gt.nhap();
			GT.add(gt);
		}
		try {
			FileOutputStream fout = new FileOutputStream("giaotrinh.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(GT);
			out.close();
			fout.close();
			System.out.println("Luu vao file thanh cong");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	private static void yc2() {
		try {
			FileInputStream fin = new FileInputStream("giaotrinh.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			GT = (ArrayList<GiaoTrinh>) in.readObject();
			in.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Cac giao trinh doc tu file:");
		for (GiaoTrinh i : GT)
		{
			i.xuat();
		}
	}
	private static void yc3() {
		System.out.println("\nTen giao trinh thuoc loai nang cao");
		int count =0;
		for(GiaoTrinh i : GT) {
			if (i.getPLGT().getSoLuong()>1 && i.getTenGT().equalsIgnoreCase("Nang cao")) {
				System.out.println(i.getTenGT()+ "\n");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Khong co giao trinh thuoc loai nang cao");
		}
	}
	private static void yc4(){
		for (int i = 0; i < GT.size(); i++)
		{
			for (int j = i + 1; j < GT.size(); j++)
			{
				if (GT.get(i).getGia() > GT.get(j).getGia())
				{
					Collections.swap(GT, i, j);
				}
			}
		}
		System.out.println("Danh sach cac thiet bi sap xep theo chieu khong giam cua gia: ");
		for (GiaoTrinh i : GT)
		{
			i.xuat();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giao trinh: ");
		int N = sc.nextInt();
		yc1(N);
		yc2();
		yc3();
		yc4();
	}
}
