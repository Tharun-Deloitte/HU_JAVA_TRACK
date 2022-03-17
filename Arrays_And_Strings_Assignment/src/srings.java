
public class srings {
    public static void main(String[] args) {
        String str1 = "gid";
        String str2 = "Hash";
        String str3 = "Hgiadsh";
        int a, b;
        a = str1.length();
        b = str2.length();
        if (a + b != str3.length()) {
            System.out.println("Invalid");
        } else {
            int f = 0;
            int i = 0, j = 0, k = 0;
            while (k < str3.length()) {
                if (i < str1.length() && str1.charAt(i) == str3.charAt(k))
                    i++;
                else if (j < str2.length() && str2.charAt(j) == str3.charAt(k))
                    j++;
                else {
                    f = 1;
                    break;
                }
                k++;
            }
            if (i < str1.length() || j < str2.length())
                System.out.println("Invalid");
            else
                System.out.println("Valid");

        }
    }
}

