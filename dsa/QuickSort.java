public class QuickSort {

  public static void quickSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    //last element
    int pIdx = partition(arr, si, ei);
    quickSort(arr, si, pIdx - 1); //left
    quickSort(arr, pIdx + 1, ei); //right
  }

  public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1; //elements jo pivot se chote hai unke liye jagh banana

    for (int j = si; j < ei; j++) {
      if (arr[j] <= pivot) {
        i++;
        //swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int array[] = { 6, 3, 4, 2, 9, 5 };
    quickSort(array, 0, array.length - 1);
    printArr(array);
  }
}