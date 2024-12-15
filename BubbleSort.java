public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 7, 9, 1, 2, 1};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }

        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
