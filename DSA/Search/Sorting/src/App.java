public class App {
    static int binarySearch(int[] arr, int l, int  h, int value){
        int i = (l+h)/2;
        if(arr[i]<value){
            return binarySearch(arr, i, h, value);
        }
        else if(arr[i] > value){
            return binarySearch(arr, l, i, value);
        }
        else{
            return i;
        }
        
    }
    static int linearSearch(int[] arr, int value){
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = {1,3,4,5,8,9}; 
        System.out.println(binarySearch(arr, 0, arr.length, 3)); // target: 1
        System.out.println(linearSearch(arr, 3)); // target: 1

        
    }
}
