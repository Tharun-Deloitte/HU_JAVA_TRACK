import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[]args){
        ArrayList list=new ArrayList();
        list.add("tharun");
        list.add(100);
        list.add("Hashedin");
        list.add("Deloitte");
        list.add("java");
        list.add("Intellij");
        Collections.reverse(list);
        System.out.println(list);
    }
}
