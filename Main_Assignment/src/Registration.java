import java.io.*;
import java.util.Scanner;

public class Registration {
    boolean reg() {
        password_check p=new password_check();
        boolean check = false;
        String line = "";
        String splitBy = ",";
        Scanner s = new Scanner(System.in);
        String us,pa=null,pa2;
        System.out.println("Enter User Name");
        us=s.next();
        boolean p_check=true;
            System.out.println("Enter Password");
            pa = s.next();
            System.out.println("Re Enter Password");
            pa2 = s.next();
        int i=0;
        try {
            FileWriter fr = new FileWriter("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\Login.csv", true);
            PrintWriter printWriter = new PrintWriter(fr);
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\Login.csv"));
            while ((line = br.readLine()) != null) {
                String[] rank = line.split(splitBy);
                if ((rank[0].contains(us) || rank[0].contains("User name"))) {
                    i++;
                }
            }
            br.close();
            if(i==1){
                while (p_check) {
                    if(pa.contains(pa2))
                    {
                        if(p.pc(pa)){
                            p_check=false;
                            String st=us;
                            st=st.concat("_Deloitte");
                            printWriter.printf("%s ,%s,%s\n", us, pa,st);
                            printWriter.flush();
                            printWriter.close();
                            FileWriter fr1 = new FileWriter("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main1.csv", true);
                            PrintWriter pw = new PrintWriter(fr1);
                            pw.printf("%s\n",st);
                            System.out.println(st);
                            pw.flush();
                            pw.close();
                            check = true;

                        }
                        else{
                            System.out.println("Weak Password Enter Again");
                            System.out.println("Enter Password");
                            pa = s.next();
                            System.out.println("Re Enter Password");
                            pa2 = s.next();
                        }
                    }
                    else{
                        System.out.println("Passwords does not match Enter Again");
                        System.out.println("Enter Password");
                        pa = s.next();
                        System.out.println("Re Enter Password");
                        pa2 = s.next();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (check == true) {
            return true;
        } else {
            return false;
        }
    }
}