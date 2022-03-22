import java.io.*;
import java.util.Scanner;

public class Add_data {
    boolean data(String id) throws IOException {
        String name,company,designation,salary = null,address,phone=null;
        int age=0;
        System.out.println("User-Id :"+id);
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        name=sc.nextLine();
        boolean check=false;
        while(!check) {
            age_check Check_age=new age_check();
            System.out.println("age");
            age = sc.nextInt();
            if(Check_age.age_c(age)){
                check=true;
            }
            else
            {
                System.out.println("Invalid input enter again\n");
                check=false;
            }

        }
        System.out.println("Company-Name:");
        company=sc.next();
        System.out.println("Designation:");
        designation=sc.next();
        check=false;
        while(!check) {
            Salary_check Check_salary=new Salary_check();
            System.out.println("Salary:");
            salary=sc.next();
            if(Check_salary.salary_ch(salary)){
                check=true;
            }
            else
            {
                System.out.println("Invalid input enter again\n");
                check=false;
            }
        }
        System.out.println("address:");
        address=sc.next();
        check=false;
        while(!check) {
            Phone_Number_Check Check_Phone=new Phone_Number_Check();
            System.out.println("Phone number:");
            phone=sc.next();
            if(Check_Phone.phone_check(phone)){
                check=true;
            }
            else
            {
                System.out.println("Invalid input enter again\n");
                check=false;
            }
        }

        try {
            BufferedReader file1 = new BufferedReader(new FileReader("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main1.csv"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main2.csv")));
            String nam;
            while ((nam = file1.readLine()) != null) {
                String[] line = nam.split(",");
                if (!id.contains(line[0])) {
                    pw.println(nam);
                } else {
                    pw.printf("%s,%s,%d,%s ,%s,%s,%s,%s\n",id, name, age, company, designation, salary, address, phone);
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
        }
        return true;
    }
}