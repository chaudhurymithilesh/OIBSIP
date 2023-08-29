package Library_Management;
import java.util.*;
import java.util.ArrayList;


 class Library_Admin {
//    char r;
	
		static String Name,date,b;
		static int a,c;

		public void add(){
			Scanner obj2= new Scanner(System.in);
			
		   
		    System.out.println("Enter Book Name");
		    String Name =obj2.nextLine();
		    System.out.println("Enter Price");
		    float Price =obj2.nextInt();
		    System.out.println("Enter Number");
		    int Book_No=obj2.nextInt();
		    System.out.println("Your details is ");
			System.out.println("Book Name:-"+Name);
			System.out.println("Price:-"+Price);
			System.out.println("Book_No:-"+Book_No);
		
		

		}




		public void issue(){
		Scanner obj3 = new Scanner(System.in);
		System.out.println("Book Name");
		Name=obj3.nextLine();
		System.out.println("Book_id");
		a=obj3.nextInt();
		obj3.nextLine();
		System.out.println("Issue Date");
		b= obj3.nextLine();
		System.out.println("Total Book Issued");
		c=obj3.nextInt();
		obj3.nextLine();
		System.out.println("Return Book Date");
		date=obj3.nextLine();
		}

//		int getid(){
//		return a;
//		}

		public void ret(){
		System.out.println("Enter Book_name & book_id");
		Scanner obj4 =new Scanner(System.in);
		Name=obj4.nextLine();
		int book_id=obj4.nextInt();
		if(book_id==a){

		    System.out.println("All Deatils");
		    System.out.println("Book Name ::" +Library_Admin.Name);
		    System.out.println("Book_id ::" +Library_Admin.a);
		    System.out.println("Issue Date ::" +Library_Admin.b);
		    System.out.println("Total Book Issued ::" +Library_Admin.c);
		    System.out.println("Return Date ::" +Library_Admin.date);
		    System.out.println("You have Returned the Book Sucessesfully");
		}

		else{
		    System.out.println("Wrong Id" +"\n" +"Please Enter Correct Id");
		}
		} 

		public void detail(){
		System.out.println("Book Name ::" +Library_Admin.Name);
		    System.out.println("Book_id ::"  +Library_Admin.a);
		    System.out.println("Issue Date ::" +Library_Admin.b);
		    System.out.println("Total Book Issued::" +Library_Admin.c);
		    System.out.println("Return Date ::" +Library_Admin.date);
		}

		void exit()
		{
		 System.exit(0);
		}

		}
   
   






