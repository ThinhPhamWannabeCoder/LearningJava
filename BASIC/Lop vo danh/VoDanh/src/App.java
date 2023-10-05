public class App {
    public static void main(String[] args) throws Exception {
        MotImplement imp = new MotImplement(){ //Ke thua tu lop MotImplement
            @Override
            public void lamBai(){
                final int value = super.x + 1;
                System.out.println("Dcmm" + value);
            }
            
        };
        imp.lamBai();;
    }
}
