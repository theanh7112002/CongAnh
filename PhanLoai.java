//Bùi Công Anh - 715105005
package BuiCongAnh;

public class PhanLoai {
	private boolean GTCB;
	private int SoLuong;
	
	public PhanLoai()
	{
		SoLuong = 0;
	}
	public PhanLoai(boolean gTCB, int soLuong) {
		super();
		GTCB = gTCB;
		SoLuong = soLuong;
	}
	public boolean isGTCB() {
		return GTCB;
	}
	public void setGTCB(boolean gTCB) {
		GTCB = gTCB;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	@Override
	public String toString() {
		return "PhanLoai [GTCB=" + GTCB + ", SoLuong=" + SoLuong + "]";
	}
}
