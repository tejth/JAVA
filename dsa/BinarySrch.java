public class BinarySrch {
    public static void binrSrch(int arr[],int element){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==element){
                System.out.println("Element found at index "+mid);
            }
            if(arr[mid]<element){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={3,4,5,6,7,8};
        binrSrch(arr,6);

    }
}
