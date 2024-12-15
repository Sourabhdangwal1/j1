public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 7, 9, 1, 2, 1};
        quickSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void quickSort(int[] arr){
        int low=0;
        int high=arr.length-1;
         qs(arr,low,high);
    }
    public static void qs(int[] arr,int low,int high){
        if(low<high) {
            int p = partition(arr, low, high);
            qs(arr, low, p - 1);
            qs(arr, p + 1, high);
        }
    }
    public static int partition(int[] arr,int start,int end) {
        int pivot=arr[start];
        int i=start;
        int j=end;
        while(i<j){
            while(arr[i]<=pivot && i<end){
                i++;
            }
            while (arr[j]>pivot && j>=start){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
         swap(arr,start,j);
        return j;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

//ex 5 4 7 1 3 6
//quicksort(arr);
//     |
//  qs(arr,0,5) -> first it will get call  p(arr,0,5)
//       |
//    qs(arr,0,3)
//and qs(arr,5,5)