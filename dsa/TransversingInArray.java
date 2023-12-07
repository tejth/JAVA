public class TransversingInArray{

    public static void transverse(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6};
        transverse(arr);
    }
}