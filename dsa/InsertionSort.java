public class InsertionSort {
    public static void SelecFunc(int arr[]){
        int n =arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev =i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void maain(String args[]){

    }
}
