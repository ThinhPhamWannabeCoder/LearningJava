import java.util.Arrays;

public class App {
    static void selectionSort1(int[] o){ //This is reference data type
        int smallest;
        int temp;
        for(int i = 0; i < o.length - 1 ; i++){
            smallest = i;
            for(int j = i+1; j < o.length; j++){
                if(o[smallest] > o[j]){
                    smallest = j;
                }
                
            }
            temp = o[smallest];
            o[smallest] = o[i];
            o[i] = temp;
        }
        System.out.println("The ascesding order is: ");
        for(int i = 0; i < o.length ; i++){
            System.out.print(" " + o[i]);
        }
    }
    static void bubbleSort1(int[] o){
        int temp;
        for(int i = 0; i < o.length - 1 ; i++){
            for(int j = i+1; j < o.length; j++){
                if(o[i] > o[j]){
                   temp = o[j];
                    o[j] = o[i];
                    o[i] = temp; 
                }
                
            }
            
        }
        System.out.println("The ascesding order is: ");
        for(int i = 0; i < o.length ; i++){
            System.out.print(" " + o[i]);
        }
    }
    static void insertionSort(int[] o){
        int tmp;
        for(int marker = 1; marker < o.length; marker++){
            if(o[marker-1]>o[marker]){
                tmp = o[marker];
                o[marker] = o[marker-1];
                for(int j = marker-2; j>0;j--){
                    if(o[j]>tmp){
                        o[j+1]=o[j];
                    }
                    else{
                        o[j+1]=tmp;
                        break;
                    }
                }
            }
        }
        System.out.println("The ascesding order is: ");
        for(int i = 0; i < o.length ; i++){
            System.out.print(" " + o[i]);
        }
    }
    // Merge sort is a Divide an conquer Algorithm -> Recursive function

    static void sortMerge(int[] o, int l, int m, int r){

        int[] a = Arrays.copyOfRange(o, l, m+1);
        int[] b = Arrays.copyOfRange(o, m+1, r+1);


        int index = l;
        int iA = 0;
        int iB = 0;


        while(index <= r){
            if(iA < a.length && iB < b.length){
                if(a[iA] > b[iB]){
                    o[index] = b[iB];
                    iB++;
                }
                else{
                    o[index] = a[iA];
                    iA++;
                }
            }
            else{
                if(iA == a.length){
                    o[index] = b[iB];
                    iB++;
                }
                else{
                    o[index] = a[iA];
                    iA++;
                }
            }
            index++;
        }
    }
    static void mergeSort(int[] o, int l, int r){
        int m = (l+(r-1))/2;
        if(l<r){
            mergeSort(o,l, m);
            mergeSort(o,m +1, r);   
            sortMerge(o, l , m , r);
        }
    }

    static void quickSort(int[] o, int l,  int pivot){
        // Xep pivot ve dung cho
        if(pivot > l && pivot< o.length){
            int j = -1; int temp;
            int nextl = l+1;
            while(l <= pivot){
                l++;
                if(o[l]>o[pivot]){
                    continue;
                }
                else{
                    j++;
                    if(l==j){
                        continue;
                    }
                    else{
                        temp = o[l];
                        o[l] = o[j];
                        o[j] = temp;
                        nextl = j;
                    }
                }
            }
            quickSort(o, 0, nextl-1); //trai
            quickSort(o, nextl+1, pivot); //phai ?
        }
        else{
            return;
        }
        

        // Can co dieu kien de dung 
        // quickSort(o, pivot);
        // quickSort(o, pivot);

        // quickSort trai
        // quickSort phai
    }
    public static void main(String[] args) throws Exception {
        int[] a = {3,2,9,5,7,6,8,4};
        quickSort(a, -1, a.length-1);
        // int[] o = Arrays.copyOfRange(a, 0, 3);
        for(int i = 0; i < a.length ; i++){
            System.out.print(" " + a[i]);
        }
        // int[] b = Arrays.copyOfRange(a, 3, 6);
        // for(int i = 0; i < b.length ; i++){
        //     System.out.print(" " + b[i]);
        // }
        // mergeSort(a, 0, a.length-1);
        
    }
}
