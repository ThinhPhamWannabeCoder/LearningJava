import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Class<Girl> girlClass = Girl.class;
        System.out.println("Class: " + girlClass.getSimpleName());
        System.out.println("Constructors: " + Arrays.toString(girlClass.getConstructors())); // Lấy ra toàn bộ Constructor của class này
        try {
            // Tạo ra một object Girl từ class. (Khởi tạo không tham số)
            Girl girl1 = girlClass.newInstance();
            System.out.println("Girl1: " + girl1);

            // Lấy ra hàm constructor với tham số là 1 string
            // Chính là -> public Girl(String name) {}
            Constructor<Girl> girlConstructor = girlClass.getConstructor(String.class);
            Girl girl2 = girlConstructor.newInstance("Hello");

            System.out.println("Girl2: " + girl2);
        } catch (Exception e) {
            // Exception xay ra khi constructor khong ton tai hoac tham so truyen vao khong dung
            e.printStackTrace();
        }
    }
}
