package Model;

public class TaiLieu {
    protected String maTaiLieu;
    public TaiLieu(String maTaiLieu){
        this.maTaiLieu = maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu){
        this.maTaiLieu = maTaiLieu;
    }
    public String getMaTaiLieu(){
        return maTaiLieu;
    }
    @Override
    public String toString(){
        return "Tai lieu: {Ma Tai Lieu: " + maTaiLieu + "}";
    }
}
