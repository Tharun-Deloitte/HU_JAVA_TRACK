import javax.naming.Name;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Display {
    void disp(String id){
        String line=" ";
        String splitBy=",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main1.csv"));
            while ((line = br.readLine()) != null) {
                String[] rank = line.split(splitBy);
                if(rank[0].contains(id)){
                    System.out.println("userID:"+rank[0]+"\n"+"name:"+rank[1]+"\n"+"age:"+rank[2]+"\n"+"Companyname:"+rank[3]+"\n"+"Designation:"+rank[4]+"\n"+"salary:"+rank[5]+"\n"+"address:"+rank[6]+"\n"+"phonenumber:"+rank[7]);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}