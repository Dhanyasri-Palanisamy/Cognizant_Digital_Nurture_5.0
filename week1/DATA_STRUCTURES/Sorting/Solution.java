class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n= arr.length;
    for(int i=0;i<n-1;i++){
        int min_index= i;
        for(int j=i+1;j<n;j++){
            if(arr[min_index]>arr[j]){
                min_index=j; 
            }
        }
        int temp = arr[i];
        arr[i]=arr[min_index];
        arr[min_index]= temp;
        
    }
    }
      public void bubbleSort(int[] arr) {
        // code here
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped= false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }
            if(swapped!=true){
                return;
            }
        }
    
        
    }
     public void insertionSort(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key= arr[i];
            int j=i-1;
            
            while(j>=0 && key<arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }

    void mergeSort(int arr[], int l, int r) {
        // code here
         int mid= (l+r)/2;
         if(l<r){
         mergeSort(arr,l,mid);
         mergeSort(arr,mid+1,r);
         
         merge(arr, l,r,mid);
         }
    }
    
    static void merge(int arr[],int l,int r, int mid){
        int n1= mid-l+1;
        int n2= r-mid;
        
        int left[]= new int[n1];
        int right[]= new int[n2];
        
        for(int i=0;i<n1;i++){
            left[i]= arr[i+l];
        }
        for(int i=0;i<n2;i++){
            right[i]= arr[i+mid+1];
        }
        
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]= left[i];
                i++;
            }
            else{
                arr[k]= right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
         while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        
        
    }

    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int pivot = partition(arr,low,high);
            
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
            
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int p= arr[high];
        
        int i=low-1;
        
        for(int j=low;j<=high-1;j++){
            if(arr[j]<=p){
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                
            }
        }
               int temp= arr[i+1];
                arr[i+1]= p;
                arr[high]= temp;
         
         return i+1;
    }
}