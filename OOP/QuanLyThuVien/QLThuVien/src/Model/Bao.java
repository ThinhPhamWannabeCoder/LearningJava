package Model;

public class Bao  extends TaiLieu{
    private int ngayPhatHanh;
    public Bao(String maTaiLieu, int ngayPhatHanh){
        super(maTaiLieu);
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public void setNgayPhatHanh(int ngayPhatHanh){
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public int getNgayPhatHanh(){
        return ngayPhatHanh;
    }
    @Override
    public String toString(){
        return "Tai lieu - Bao: {Ma Tai Lieu: " + maTaiLieu + ", Ngay Phat Hanh: " + ngayPhatHanh + "}" ;
    }
}
