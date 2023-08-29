package Library_Management;
import java.util.Scanner;

public class Library_Admin_client {

	public static void main(String[] args) {
		Library_Admin aa=new Library_Admin();
       char r; 
        do{
            
        
        System.out.println("*******libraray_management system********");
        System.out.println("press 1 to add book");
        System.out.println("press 2 to issue book");
        System.out.println("press 3 to return a book");
        System.out.println("press 4 to print complete issue details ");
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter any Number");
        int a = obj1.nextInt();
        switch(a){
            case 1:
            aa.add();
            break;

            case 2:
            
            aa.issue();
            break;

            case 3:
            
            aa.ret();
            break;

            case 4:
            
            aa.detail();
            break;

            default:
            System.out.println("invalid number");
        }
        
        System.out.println("Do you want exit then type (N/n)for restart (Y/y)");
         r=obj1.next().charAt(0);
            
            
    }
        
       while(r=='y'|| r=='Y');
        
    	   if(r=='n'|| r=='N')
           {
               
               aa.exit();

           }
       
      
       }

}
