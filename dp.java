public class dp {
    public static int fact(int n, int arr[]){
        if(n ==0 || n == 1){
            return n;
        }

        if(arr[n] !=-1){
            return arr[n];
        }

        arr[n] = fact(n-1,arr) + fact(n-2,arr);

        return arr[n];
    }


    public static void main(String[] args) {
        int n = 7;
        int arr[] = new int[n+1];

        for(int i = 0;i<arr.length;i++){
            arr[i] = -1;
        }

        int ans = fact(n,arr);
        System.out.println(ans);

    }
}
