public class RevArray {

    public static void printArray(int[] arr) {
        System.out.print("The array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        if(arr.length < 0){
            System.out.println("Array is empty..");
        } else if (arr.length == 0) {
            printArray(arr);
        } else {
            int i = 0;
            int j = arr.length - 1;
            while (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
            printArray(arr);
        }

        
    }
    public static void main(String12[] args) {
        int[] arr = { 1,2,3,4,5 };
        printArray(arr);
        reverseArray(arr);
    }
}
