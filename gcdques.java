class gcdques {
    public static void main(String[] args) {
        int arr[] = {};
        int queries[] = {};
        for (int i = 0; i < queries.length; i++) {
            System.out.println(fun(arr, queries[i]));
        }

    }

    static int fun(int[] arr, int m) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (gcd(arr[i], m - arr[i]) == arr[i]) {
                count++;
            }
        }

        return count;
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
}