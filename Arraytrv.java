import java.util.ArrayList;

public class Arraytrv {
    public static void printArr(int arr[],int i,ArrayList<Integer> arrlist){
        
        if(i==arr.length-1){  
            arrlist.add(arr[i]);
            return;
        }
        
        printArr(arr,i+1,arrlist);
        arrlist.add(arr[i]); 
    }
    public static void main(String12[] args) {
        
        int arr[] = {1,2,2,3,4};
        //  int i =0;
        //  while(i<=arr.length-1){
        //     System.out.println("The arr value is: "+ arr[i]);
        //     i++;
        
        ArrayList<Integer> arrlist= new ArrayList<>();
        printArr(arr,0, arrlist);

        // arrlist.toString();
        System.out.println(arrlist.toString());
    }
}
