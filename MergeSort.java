import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 7, 9, 1, 2, 1};
        mergeSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] arr) {
        int high = arr.length - 1;
        int low = 0;
        mg(arr, low, high);
    }

    public static void mg(int[] arr, int low, int high) {
     if (low>=high) {
         return;
     }
     int mid=(low+high)/2;
     mg(arr,low,mid);
     mg(arr,mid+1,high);
     merge(arr,low,mid,high);
    }
   public static  int[] merge(int[] arr,int low,int mid,int high){
       ArrayList<Integer> a=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high) {
            if (arr[left] <= arr[right]) {
                a.add(arr[left]);
                left++;
            } else {
                a.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            a.add(arr[left]);
            left++;
        }
        while(right<=high){
            a.add(arr[right]);
            right++;
        }
       for (int i = low; i <=high ; i++) {
           arr[i]=a.get(i-low);
       }
       return arr;
    }
}
