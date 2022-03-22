import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Data {
    public static void main(String[] args) throws IOException {
        int n;
        usercheck login=new usercheck();
        Registration r=new Registration();
        Scanner sc =new Scanner(System.in);
        boolean Login=false,exit=false;
        String id = null;
        while(!Login){
            System.out.println("******Welcome to Login Page*******");
            System.out.println("1.Login \n" + "2. Registration \n");
            n = sc.nextInt();
            if (n == 1) {
                id=login.user();
                if (id!="False") {
                    System.out.println("Login Successful");
                    Login=true;
                } else {
                    System.out.println("Login Failed");
                }
            }
            else{
                if(r.reg())
                {
                    System.out.println("Registration successful");
                }
                else{
                    System.out.println("User name already exists");
                    System.out.println("Resgistration unsuccessful");
                }
            }
        }
        while(!exit && Login){
            System.out.println("******Welcome "+id+"*******");
            System.out.println("1. Add User Data ");
            System.out.println("2. List User Data ");
            System.out.println("3. Update User Data ");
            System.out.println("4. Delete User Data ");
            System.out.println("5. Exit ");
            n = sc.nextInt();
            if(n==5) {
                exit =true;
            }
            if(n==1){
                Add_data adddata=new Add_data();
                adddata.data(id);
            }
            if(n==2){
                Display displ=new Display();
                displ.disp(id);
            }
            if(n==3){
                update u_data=new update();
                u_data.data(id);
            }
            if(n==4){
                delete d_data=new delete();
                d_data.delete_data(id);
            }

        }
    }
}
