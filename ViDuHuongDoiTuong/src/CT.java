
public class CT {

	public static void main(String[] args) {
		// Tạo ra 2 sản phẩm (hardcore)
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Bánh Chuối", "Đồ ăn nhanh", "bc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("Bia SG");
		sp1.setLoaiSP("Đồ uống có cồn");
		sp1.setAnhSP("sg.png");
		
		// In ra màn hình thông tin 2 sp
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Mã SP2 là " + sp2.getMaSP();
			   thongtinSP2  +=" " + sp2.getTenSP();
		
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2);
			   
	}

}
