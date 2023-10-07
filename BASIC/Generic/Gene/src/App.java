import java.util.Scanner;

public class App {
    public static <T> T getFirst(T[] a) {
        return a[0];
    }
    public static void main(String[] args) throws Exception {
        Word<String, String>[] words = new Word[]
            {
                new Word<>("Java", "Là một ngôn ngữ lập trình cấp cao, hướng đối tượng mà bạn đang học"),
                new Word<>("Kotlin", "Là một ngôn ngữ lập trình đa nền tảng, tương thích hoàn toàn với Java, nếu thích bạn cứ học."),
                new Word<>("C", "Là ngôn ngữ lập trình kinh điển trong các trường học."),
                new Word<>("Objective-C", "Ngôn ngữ được dùng để viết ứng dụng trên các thiết bị của Apple."),
                new Word<>("Swift", "Là ngôn ngữ được dùng để thay thế cho Objective-C."),
            };
        Dictionary<String, String> dictionary = new Dictionary<>(words);
        Scanner scanner = new Scanner(System.in);
        String key;
        do{
            System.out.println("Nhap ngon ngu ban muon tra cuu");
            key = scanner.nextLine();
            String result = dictionary.findWord(key);
            if(result != null){
                System.out.println(result);
            }
            else{
                System.out.println("Chua co du lieu");
            }
        }while(key != null && !key.equalsIgnoreCase("q"));
    }
}
