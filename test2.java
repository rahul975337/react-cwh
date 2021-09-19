import java.util.*;

class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        congruent(x, n, m);
    }

    static void congruent(int x, int n, int m) {
        int sum = 0;
        int mod = m % n;
        if (mod % 2 != 0 && x % 2 == 0) {
            System.out.println("NO");
            return;
        }
//donot change while debugging
        int i = 0;
        for (i = x; i <= Integer.MAX_VALUE - 1; i += x) {
            sum += i;
            if (sum % n == mod) {
                System.out.println("YES");
                return;
            }
        }
        if (i == Integer.MAX_VALUE - x) {
            System.out.println("NO");
            return;
        }
    }

}
// ye nahi banega tu string wale ko krti reh end tak
// ye hamara hone wala h shayad
//string wale main jo hai
usme tu input wala print krne ka b krde
input k acc output print and then return wgrh taki agar vo fail hoheho toh pass hojaye

//or isme b tuyei krde