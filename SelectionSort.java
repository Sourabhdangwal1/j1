public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,3,5,7,9,1,2,1};
         selectionSort(arr);
         for (int i:arr){
             System.out.println(i);
         }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
