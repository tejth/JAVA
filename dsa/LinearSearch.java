public class LinearSearch {
    public static void LinearSrch(int arr[],int element){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                System.out.println("Element found at index "+i);
            }
        }
        
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,6};
        LinearSrch(arr,4);
       

    }
    
}
