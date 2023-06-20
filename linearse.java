public class linearse {
    public static void main(String[] args) {
        int arr[] = {1,2,6,4,7,9,5,1,4};
        int size = arr.length;
        int searchnum = 4;
        
        System.out.print("Array data:");
        printarr(arr,size);
        linesearch(arr,size,searchnum);

    }

    public static void linesearch(int arr[], int size,int elem){
        for(int i = 0;i<size;i++){
            if(arr[i] == elem){
                System.out.printf("The index of %d is %d.",elem,i);
                System.out.println();
            }
        }
    }

    public static void printarr(int[] arr, int size){
        for(int  i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
