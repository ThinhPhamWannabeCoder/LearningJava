package Model;

public class CongNhan extends CanBo {
    private int level;
    public CongNhan(String fullName, int age, String gender, String address, int level){        
          super(fullName, age, gender, address);           
          this.level = level;
        
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getLevel(){
        return level;
    }

    @Override
    public String toString(){
        return "Can bo - Cong Nhan: { fullName: " + fullName + ", age: " + age + ", " + "gender: " + ", " + "address: " + address + ", " + "level: " + level +"}";
    }
}
