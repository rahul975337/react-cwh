import java.util.*;

class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++)
                arr[j] = sc.nextInt();
            System.out.println(maxSumK(arr, n));
        }
    }

    static int maxSumK(int[] arr, int n) {
        System.out.println("array is " + Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int k = i;
            int sum = 0;
            for (int j = 0; j < n; j += k)
                sum += arr[j];
            if (sum > max) {
                max = sum;
                result = k;
            }
        }
        System.out.println(max);
        return result;
    }


//4 5 6 8 35
}