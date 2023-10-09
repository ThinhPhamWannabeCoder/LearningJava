package Model;

public class KySu extends CanBo{
    private String major;
    public KySu(String fullName, int age, String gender, String address, String major){
        super(fullName, age, gender, address);
        this.major = major;
    }
    public void setMajor(String major){    
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    @Override
    public String toString(){
        return "Can bo - KySu: { fullName: " + fullName + ", age: " + age + ", " + "gender: " + ", " + "address: " + address + ", " + "major: " + major +"}";
    }

}
