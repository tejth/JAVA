public class InsertionInArray {

    public static void insertFunc(int arr[], int value, int index) {
        int n = arr.length;

        // Shift the elements to the right to make space for the new element
        for (int i = n - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element at the specified index
        arr[index] = value;

        // Print the modified array
        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 6};
        insertFunc(arr, 32, 2);
    }
}
