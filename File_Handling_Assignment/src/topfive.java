import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class topfive {
    public static void main(String[] args) throws FileNotFoundException{
        String line = "";
        String splitBy = ",";
        int i=0;
        boolean check;
        ArrayList<Integer> pq = new ArrayList<Integer>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\File_Handling_Assignment\\src\\Book2.csv"));
            while ((line = br.readLine()) != null) {
                String[] rank = line.split(splitBy);
                if(!(rank[4].contains("rank")))
                {
                    int r= Integer.parseInt(rank[4]);
                    pq.add(r);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(pq);
        File stu =new File("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\File_Handling_Assignment\\src\\Top5.csv");
        PrintWriter out=new PrintWriter(stu);
        try {
            out.printf("%s,%s,%s,%s,%S\n", "Name", "reg no-10", "reg no-12", "reg no-B-Tech", "rank");
            for(i=0;i<5;i++) {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\File_Handling_Assignment\\src\\Book2.csv"));
                check=false;
                while ((line = br.readLine()) != null && check==false) {
                    String[] rank = line.split(splitBy);
                    if (!(rank[4].contains("rank"))) {
                        int r = Integer.parseInt(rank[4]);
                        if (r == pq.get(i) && i < 5) {
                            out.printf("%s,%s,%s,%s,%S\n", rank[0], rank[1], rank[2], rank[3], rank[4]);
                            check=true;
                        }
                    }
                }
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
