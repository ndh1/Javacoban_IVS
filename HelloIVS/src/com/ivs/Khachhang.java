package com.ivs;

public class Khachhang {
	//Thuoc tinh
	private long id;
	private String makh;
	private String ten;
	private String diachi;
	private long doanhSo=0;
	private static long lastID=0;
	
	
	//Phuong thuc
	public static long getLastID() {
		return lastID;
	}
	public static void setLastID(long lastID) {
		Khachhang.lastID = lastID;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public long getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(long doanhSo) {
		this.doanhSo = doanhSo;
	}
	void info() {
		System.out.println("ID:"+id+"\n"+"Mã khách hàng:"+makh+"\n"+"Tên:"+ten+"\n"+"Địa chỉ:"+diachi+"\n"+"Doanh số:"+doanhSo);
	}
	void muaHang(int soTien)
	{	
		doanhSo=soTien+doanhSo;
	}
	static long increaseID() {
		return lastID=lastID+1;
	}
	
	
	public static void main(String[] args) {
		Khachhang kh1 = new Khachhang();//Khoi tao khach hang
		Khachhang kh2 = new Khachhang();
		
//		Cau5
//		kh1.id=001;;kh1.makh="A1";kh1.ten="Dinh Huong";kh1.diachi="123 Chau Van Liem";//Them thong tin
//		kh2.id=002;kh2.makh="A2";kh2.ten="Huong";kh2.diachi="Can Tho";
//		
		//Cau7
		kh1.id=kh1.increaseID();;kh1.makh="A1";kh1.ten="Dinh Huong";kh1.diachi="123 Chau Van Liem";//Them thong tin
		kh2.id=kh2.increaseID();kh2.makh="A2";kh2.ten="Huong";kh2.diachi="Can Tho";
		
		kh1.info();//In thong tin ra
		kh2.info();
		
		kh1.muaHang(100); //Tang doanh so
		kh2.muaHang(200);
		
		System.out.println("\n");
		
		kh1.info();//In lai thong tin sau khi tăng doanh số
		kh2.info();
		
		

	}
	
}
