import java.io.*;
import java.util.Scanner;

public class delete {
    void delete_data(String id){
        System.out.println("Select what You want to delete:\n");
        System.out.println("1.Name\n 2.Age\n 3.Company\n 4.Designation\n 5.Salary\n 6.Address\n 7.Phone number\n");
        Scanner sc=new Scanner(System.in);
        String update=" ";
        int n=sc.nextInt();
        try {
            BufferedReader file1 = new BufferedReader(new FileReader("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main1.csv"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main2.csv")));
            String nam=" ";
            while ((nam = file1.readLine()) != null) {
                String[] line = nam.split(",");
                if (!id.contains(line[0])) {
                    pw.println(nam);
                } else {
                    if(n==1) {
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, update, line[2],line[3],line[4],line[5],line[6],line[7]);
                    }
                    else if(n==2) {
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], update, line[3], line[4], line[5], line[6], line[7]);
                    }
                    else if(n==3) {
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], update, line[4], line[5], line[6], line[7]);
                    }
                    else if(n==4) {
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], update, line[5], line[6], line[7]);
                    }
                    else if(n==5) {
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], update, line[6], line[7]);
                    }else if(n==6) {
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], line[5], update, line[7]);
                    }
                    else if(n==7) {
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], line[5], line[6], update);
                    }
                    else{
                        System.out.println("Invalid Input");
                    }


                }

            }
            file1.close();
            pw.flush();
            pw.close();
            File delName = new File("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main1.csv");
            File oldName = new File("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main2.csv");
            File newName = new File("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main1.csv");
            delName.delete();
            oldName.renameTo(newName);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}