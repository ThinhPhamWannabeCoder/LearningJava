package Model;

public class CanBo {
    protected String fullName;
    protected int age;
    protected String gender;
    protected String address;

    public CanBo(String fullName, int age, String gender, String address){
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }




    @Override
    public String toString(){
        return "Can bo: { fullName: " + fullName + ", age: " + age + ", " + "gender: " + ", " + "address: " + address+"}";
    }
}
