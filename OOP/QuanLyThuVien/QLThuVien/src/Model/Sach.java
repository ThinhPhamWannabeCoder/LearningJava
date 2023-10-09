package Model;

public class Sach extends TaiLieu{
    private String tacGia;
    private int soTrang;
    public Sach(String maTaiLieu, String tacGia, int soTrang){
        super(maTaiLieu);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }
    public void setTacGia(String tacGia){
        this.tacGia = tacGia;
    }
    public String getTacGia(){
        return tacGia;
    }
    public void setSoTrang(int soTrang){
        this.soTrang = soTrang;
    }
    public int getSoTrang(){
        return soTrang;
    }

    @Override
    public String toString(){
        return "Tai lieu - Sach: {Ma Tai Lieu: " + maTaiLieu + ", Tac Gia: " + tacGia + ", So Trang: " + soTrang + "}";
    }
}
