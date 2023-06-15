public class SearchEle {


    public static int searchMethod(int arr[], int element) {

        int ans = -1;

        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i] == element){
                ans = i;
            }
        }

        return ans;

    }

    public static void main(String12[] args) {
        int arr[] = {2,3,4,5,3};

        int searchele = 4;

        int index = searchMethod(arr, searchele);
        System.out.println("The index of " + searchele + " is :" + index);


    }
}