class app {
    public static void main(String[] args) {

    }

    int f(int arr2Idx, int[] arr1 int i){
    if(i == arr1.length-1)
        return 0;
     if(arr1[i]>=arr1[i+1] && arr2[i]>=arr2[i+1])return -1;
    if(arr1[i]>=arr1[i+1] || arr2[i]>=arr2[i+1]){
        int m, n;
        swap(arr,i,n+i);
        m = f(N, arr1, arr2, i+1);
        swap(arr1[i], arr2[i]);
        swap(arr1[i+1, arr2[i+1]);
        n = f(N, arr1, arr2, i+1);
        if(m == -1 && n==-1)return -1;
        if(m==-1)return n;
        if(n==-1)return m;
        return min(m, n);
    }
    return f(N, arr1, arr2, i+1);
 }

    int minSwaps(int N, int[] arr1, int[] arr2) {
        return f(N, arr1, arr2, 0);
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}