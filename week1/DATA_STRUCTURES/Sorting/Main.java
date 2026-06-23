import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the values one by one");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Solution sol= new Solution();
        sol.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        Random rand= new Random();
        for(int i=0;i<n;i++){
            arr[i]=rand.nextInt(20,31);
        }
        System.out.println("before bubbleSort "+Arrays.toString(arr));
        sol.bubbleSort(arr);
         System.out.println("After bubbleSort "+Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
         for(int i=0;i<n;i++){
            arr[i]=rand.nextInt(30,41);
        }
        System.out.println("before Insertion Sort "+Arrays.toString(arr));
        sol.insertionSort(arr);
         System.out.println("After Insertion Sort "+Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++){
            arr[i]=rand.nextInt(40,51);
        }
        System.out.println("before MergeSort "+Arrays.toString(arr));
        sol.mergeSort(arr, 0, n-1);
         System.out.println("After MergeSort "+Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));
    }
}
