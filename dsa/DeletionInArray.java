public class DeletionInArray{
     public static void deleteFunc(int arr[], int index) {
        int n = arr.length;

        // Shift the elements to the left to remove the element at the specified index
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Print the modified array
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add a new line for clarity
    }

    public static void main(String args[]){
        int arr[]={3,4,5,6};
        deleteFunc(arr,2);


    }
} 










 
