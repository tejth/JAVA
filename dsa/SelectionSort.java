public class SelectionSort{
    public static void selecFunc(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minpos =i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp =arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] ={33,2,55,1,2};
        selecFunc(arr);

    }
}