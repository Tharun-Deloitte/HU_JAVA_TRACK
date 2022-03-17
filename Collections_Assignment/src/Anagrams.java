import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagrams {
    public static void main(String[]args){
        String a,b;
        a="Listen";
        b="Silent";
        if(a.length()==b.length()) {
            char ar[] = a.toLowerCase().toCharArray();
            Arrays.sort(ar);
            a = new String(ar);
            char arr[] = b.toLowerCase().toCharArray();
            Arrays.sort(arr);
            b = new String(arr);
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            list1.add(a);
            list2.add(b);
            if (list1.equals(list2)) {
                System.out.println("It is an anagram");
            }
            else {
                System.out.println("It is not an anagram");
            }
        }
        else {
            System.out.println("It is not an anagram");
        }
    }

}
