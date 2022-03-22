import java.io.*;
import java.util.Scanner;

public class update {
    void data(String id)
    {
        System.out.println("Select what You want to Update:\n");
        System.out.println("1.Name\n 2.Age\n 3.Company\n 4.Designation\n 5.Salary\n 6.Address\n 7.Phone number\n");
        Scanner sc=new Scanner(System.in);
        String name,company,designation, salary = null, address, phone = null;
        int age = 0;
        int n=sc.nextInt();
        boolean check=false;
        try {
            BufferedReader file1 = new BufferedReader(new FileReader("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main1.csv"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\naratreddy\\Documents\\New folder\\HU_JAVA_TRACK\\Main_Assignment\\main2.csv")));
            String nam;
            while ((nam = file1.readLine()) != null) {
                String[] line = nam.split(",");
                if (!id.contains(line[0])) {
                    pw.println(nam);
                } else {
                    if(n==1) {
                        System.out.println("Enter New Data");
                        name=sc.next();
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, name, line[2],line[3],line[4],line[5],line[6],line[7]);
                    }
                    else if(n==2) {
                        while(!check) {
                            age_check Check_age=new age_check();
                            System.out.println("age");
                            age = sc.nextInt();
                            if(Check_age.age_c(age)){
                                check=true;
                            }
                            else
                            {
                                check=false;
                            }

                        }
                        pw.printf("%s,%s,%d,%s ,%s,%s,%s,%s\n", id, line[1], age, line[3], line[4], line[5], line[6], line[7]);
                    }
                    else if(n==3) {
                        System.out.println("Enter New Data");
                        company = sc.next();
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], company, line[4], line[5], line[6], line[7]);
                    }
                    else if(n==4) {
                        System.out.println("Enter New Data");
                        designation= sc.next();
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], designation, line[5], line[6], line[7]);
                    }
                    else if(n==5) {
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
                                System.out.println("Invalid input enter agaib\n");
                                check=false;
                            }
                        }
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], salary, line[6], line[7]);
                    }else if(n==6) {
                        System.out.println("Enter New Data");
                        address= sc.next();
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], line[5], address, line[7]);
                    }
                    else if(n==7) {
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
                        pw.printf("%s,%s,%s,%s ,%s,%s,%s,%s\n", id, line[1], line[2], line[3], line[4], line[5], line[6], phone);
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