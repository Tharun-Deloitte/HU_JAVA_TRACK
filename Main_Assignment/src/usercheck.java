import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class usercheck {
    String user(){
        Scanner sc =new Scanner(System.in);
        String line = "";
        String splitBy = ",";
        System.out.println("******Welcome to User Login page*******");
        System.out.println("Enter User Name");
        String us=sc.next();
        System.out.println("Enter Password");
        String pa=sc.next();
        String userid = null;
        boolean us_check = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\Login.csv"));
            while ((line = br.readLine()) != null) {
                String[] rank = line.split(splitBy);
                if(rank[0].contains(us) && rank[1].contains(pa)){
                    us_check=true;
                    userid=rank[2];
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(us_check){
            return userid;
        }
        else{
            return "False";
        }
    }
}