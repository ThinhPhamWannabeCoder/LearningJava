import java.util.LinkedList;
import java.util.List;

import Model.TaiLieu;

public class TaiLieuManager {
    List<TaiLieu> taiLieus;
    public TaiLieuManager(){
        taiLieus = new LinkedList<>();
    }
    public void themTaiLieu(TaiLieu taiLieu){
        taiLieus.add(taiLieu);
    }
    public boolean xoaTaiLieu(String maTaiLieu){
        TaiLieu o= taiLieus.stream().filter(taiLieu -> taiLieu.getMaTaiLieu().equals(maTaiLieu)).findFirst().orElse(null);
        if(o==null){
            return false;
        }
        else{
            taiLieus.remove(o);
            return true;
        }

    }
    public void timKiemTaiLieuTheoLoai(int o){
        switch(o){
            case 1:
                System.out.println("Toan bo thong tin ve dau Bao: ");
                taiLieus.stream().filter(taiLieu -> taiLieu.getClass().getName().equals("Model.Bao")).forEach(System.out::println);
                break;
            case 2:
                System.out.println("Toan bo thong tin ve dau Sach: ");
                taiLieus.stream().filter(taiLieu -> taiLieu.getClass().getName().equals("Model.Sach")).forEach(System.out::println);
                break;
            case 3:
                System.out.println("Toan bo thong tin ve dau Tap Chi: ");
                taiLieus.stream().filter(taiLieu -> taiLieu.getClass().getName().equals("Model.TapChi")).forEach(System.out::println);
                break;
            default:
                System.out.println("Da nhap sai"); //Doan nay nen throw error
        }
            
    }
    public void hienThiTaiLieu(){
        taiLieus.stream().forEach(taiLieu -> System.out.println(taiLieu));
    }
}
