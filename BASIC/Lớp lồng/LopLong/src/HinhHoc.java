
public class HinhHoc {
    private String tenHinh;
    public ToaDo toaDo;
    public HinhHoc(int x, int y){
        tenHinh = "Hinh hoc";
        this.toaDo = new ToaDo();
        this.toaDo.x = x;
        this.toaDo.y = y;
    }

    public class ToaDo{
        public int x;
        public int y;
        public void xuatThongTin(){
            System.out.println(tenHinh);
            System.out.println("Toa do: "+ "x: " + x + " y: " + y);
        }
    }
}
