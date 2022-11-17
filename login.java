import  java.util.Scanner;
import java.io.*;
public class login {
    public static void main(String[] args)throws IOException {
        Scanner ke= new Scanner(System.in);
        String name1 = "ibrar ul haque";
        String email1= "ibrar@gmail.com";
        String pass1 ="ibrar123";
        String name2 = "qayoom";
        String email2= "qayoom@gmail.com";
        String pass2 ="qayoom123";
        String name3 = "ali";
        String email3= "ali@gmail.com";
        String pass3 ="ali123";
        String name4= "ahmed";
        String email4= "ahmed@gmail.com";
        String pass4="ahmed123";
        String name5 = "aqeel";
        String email5= "aqeel@gmail.com";
        String pass5 ="aqeel123";
        System.out.println("Enter your email id:");
        String email=ke.next();
        System.out.println("Enter your password ");        
        //get the object od console class..
        Console con=System.console();
        char[] chars=con.readPassword();
        String password=new String(chars);
              
        String [][]sh={{name1,email1,pass1},{name2,email2,pass2},{name3,email3,pass3},{name4,email4,pass4},{name5,email5,pass5}};
        if (email1.equals(email)&&pass1.equals(password)){
            System.out.println("******Wellcome Screen******");
            for (int a=0;a<=2;a++){
                System.out.println(sh[0][a]);
            }
        }
        else if  (email2.equals(email)&&pass2.equals(password)){
            System.out.println("******Wellcome Screen******");
            for (int a=0;a<=2;a++){
                System.out.println(sh[1][a]);
            }
        }
        else if  (email3.equals(email)&&pass3.equals(password)){
            System.out.println("******Wellcome Screen******");
            for (int a=0;a<=2;a++){
                System.out.println(sh[2][a]);
            }
        }
        else if  (email4.equals(email)&&pass4.equals(password)){
            System.out.println("******Wellcome Screen******");
            for (int a=0;a<=2;a++){
                System.out.println(sh[3][a]);
            }
        }
        else if  (email5.equals(email)&&pass5.equals(password)){
            System.out.println("******Wellcome Screen******");
            for (int a=0;a<=2;a++){
                System.out.println(sh[5][a]);
            }
        }
        else System.out.println("SORRY SOMETHING IS WRONG ");
        
    }
}