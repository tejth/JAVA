public class MergeSort {

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void mergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }

    //kamm
    int mid = si + (ei - si) / 2;
    mergeSort(arr, si, mid); //leftPART
    mergeSort(arr, mid + 1, ei); //rightPart
    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si; //idx for 2nd part
    int j = mid + 1; //idx dor 2nd sorted part
    int k = 0; //idx for temps

    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    //for left over elements of 1st sorted array
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    //for leftover elements of 2nd sorted part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    //copy temp to original array
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }

  public static void main(String[] args) {
    int array[] = { 6, 3, 4, 2, 9, 5 };
    mergeSort(array, 0, array.length - 1);
    printArr(array);
  }
}