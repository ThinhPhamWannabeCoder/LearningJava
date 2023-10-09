package Model;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;
    public TapChi(String maTaiLieu, int soPhatHanh, int thangPhatHanh){
        super(maTaiLieu);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    public void setSoPhatHanh(int soPhatHanh){
        this.soPhatHanh = soPhatHanh;
    }
    public int getSoPhatHanh(){
        return soPhatHanh;
    }
    public void setThangPhatHanh(int thangPhatHanh){
        this.thangPhatHanh = thangPhatHanh;
    }
    public int getThangPhatHanh(){
        return thangPhatHanh;
    }
    @Override
    public String toString(){
        return "Tai lieu - Tap Chi: {Ma Tai Lieu: " + maTaiLieu + ", So Phat Hanh: " + soPhatHanh + ", Thang Phat Hanh: " + thangPhatHanh + "}";
    }
}
