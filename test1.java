import java.util.*;
//3rd question clear bhej dikh nahi raha
//dm kar merko

class GFG {
    static String kStringGenerate(String str, int k) {
        int frequency[] = new int[26];
        Arrays.fill(frequency, 0);
        int len = str.length();
        for (int i = 0; i < len; i++)
            frequency[str.charAt(i) - 'a']++;
        String single_copy = "";
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0) {
                if ((frequency[i] % k) != 0) {
                    String ans = "NO";
                    return ans;
                } else {
                    int total_occurrences = (frequency[i] / k);
                    for (int j = 0; j < total_occurrences; j++) {
                        single_copy += (char) (i + 97);
                    }
                }
            }
        }

        String kString = "";

        for (int i = 0; i < k; i++) {
            kString += single_copy;
        }

        return kString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String str = sc.next();
        String kString = kStringGenerate(str, K);
        if (kString == "NO")
            System.out.println(-1);
        else
            System.out.print(kString);
    }
}
// boilerplate bhej