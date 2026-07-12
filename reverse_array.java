public class reverse_array {
    static void reverse(int a[], int n) {
        for (int i=n-1;i>=0;i--) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10};
        reverse(arr, arr.length);
    }
}
/*public class reverse_array {
    static void reverse(int arr[]) {
        int l=0;
        int r= arr.length-1;
        while(l<r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
        public static void main(String[] args){
            int[] arr = {1, 2, 3, 4, 5};
            reverse(arr);
            System.out.println("Reversed array:");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        
        }
    
    }*/
    

