import Model.CanBo;
import Model.CongNhan;
import Model.KySu;

public class App {
    public static void main(String[] args) throws Exception {
        // The job is actually do something "interface-like" but I just want to make sure all the functions work perfectly 
        // *I need to also add try and Catch to cover the errors. but for today's job, it's ok
        CanBo kySu = new KySu("Pham Tien Thinh", 20, "Nam", "Hanoi", "Data Engineer");
        CanBo congNhan = new CongNhan("Pham Trung Son", 58  , "Nam", "Hanoi", 5);
        CanBoManager canBoManager = new CanBoManager();
        canBoManager.themCanBo(kySu);
        canBoManager.themCanBo(congNhan);
        canBoManager.timKiemCanBo("Thinh");
        canBoManager.hienThiCanBo();
    }
}
