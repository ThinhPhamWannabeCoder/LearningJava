import java.util.ArrayList;
import java.util.List;

import Model.CanBo;

public class CanBoManager {
    List<CanBo> canBoManager;

    public CanBoManager(){
        canBoManager  = new ArrayList<>();
    }
    // Them can bo avo
    public void themCanBo(CanBo canBo){
        canBoManager.add(canBo);
    }
    // Tim kiem canBo qua ten;
    public void timKiemCanBo(String fullNameSearch){
        canBoManager.stream().filter(o->o.getFullName().contains(fullNameSearch)).forEach(canBo -> System.out.println(canBo.toString()));
    }
    // Hien thi toan bo thong tin canBo
    public void hienThiCanBo(){
        canBoManager.stream().forEach(canBo -> System.out.println(canBo.toString()));
    }
}
