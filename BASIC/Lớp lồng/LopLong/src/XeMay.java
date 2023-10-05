public class XeMay {
    private String tenXe;
    private static int bienHieu; 
    public static  class YenXe{
        public int x;
        public void inBai(){
            System.out.println("Loai xe: " + tenXe); // Khong the truy cap duoc vi tenXe khong mang static
        }
        public void inBai2(){
            System.out.println("Loai xe: " + bienHieu); //Truy cap duoc vi day la static nested class  va bienHieu mang static
        }
        
    }
}
