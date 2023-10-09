package Model;

public class NhanVien  extends CanBo{
    private String task;
    public NhanVien(String fullName, int age, String gender, String address, String task){
        super(fullName, age, gender, address);
        this.task = task;
    }
    public void setTask(String task){
        this.task = task;
    }
    public String getTask(){
        return task;
    }

    @Override
    public String toString(){
        return "Can bo - KySu: { fullName: " + fullName + ", age: " + age + ", " + "gender: " + ", " + "address: " + address + ", " + "task: " + task +"}";
    }
}
