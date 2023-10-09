import Model.Bao;
import Model.Sach;
import Model.TaiLieu;
import Model.TapChi;

public class App {
    public static void main(String[] args) throws Exception {
        // Chu yeu thuc hanh upcasting, stream, generic va cac ham trong do, con try catch va dat dkien cu the cho tung bien thi moi lam cho bai nay hoan thien


        TaiLieu tapChi = new TapChi("11215518", 1, 1);
        TaiLieu bao = new Bao("11223344", 1);
        TaiLieu sach = new Sach("11334423", "Pham Tien Thinh", 300);
        TaiLieuManager taiLieuManager = new TaiLieuManager();
        taiLieuManager.themTaiLieu(sach);
        taiLieuManager.themTaiLieu(bao);
        taiLieuManager.themTaiLieu(tapChi);

        taiLieuManager.hienThiTaiLieu();

        taiLieuManager.xoaTaiLieu("11215518");

        taiLieuManager.hienThiTaiLieu();

        taiLieuManager.timKiemTaiLieuTheoLoai(3);
    }
}
