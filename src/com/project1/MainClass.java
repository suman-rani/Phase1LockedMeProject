package com.project1;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********WELCOME TO********* \n****LOCKEDME APPLICATION****");
        System.out.println("Developer: Suman Rani-----\nFSD Batch-1-----------");
             try {
            	 menulogic();
             }catch (FileNotFoundException e) {
            	 e.printStackTrace();
             }
	}
	public static void menulogic() throws FileNotFoundException {
		 Scanner sc=new Scanner(System.in);
		 Operations obj=new Operations();
		 while(true) {
			 System.out.println("Enter your choice :");
				System.out.println("1. Retrieve the current users files in ascending order");
				System.out.println("2. Business Operations menu");
				System.out.println("3. Exit from application");
	             int opt=sc.nextInt();
	            switch(opt) {
	        
	            case 1:
        		        obj.showUser(); 
        		        break;
        	    case 2:
        	    	    Operation();
        	    	    break;
        	case 3:
        		   System.out.println("---Exiting from the lockedme application---");
        		   System.out.println("----------Thank You------");
        		   System.exit(0);
            default:
            	    System.out.println("Entered Choice is invalid.");
            	    break; 
        	}
        	
        }
        
	}
	static void Operation() {
		while(true) {

        	System.out.println("Enter your choice for operations");
			System.out.println("1. Add the user file");
			System.out.println("2. Delete the user file");
			System.out.println("3. Search for the user file");
			System.out.println("4. Return to main menu.");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			 Operations obj=new Operations();
			switch(ch) {
			case 1:
				   obj.addUser();
				   break;
			case 2: 
				   obj.deleteUser();
				   break;
			case 3:
				   obj.searchUser();
				   break;
			case 4:
				   System.out.println("You have navigated from the application operations");
				   return;
		   default:
			       System.out.println("You have entered invalid choice");
			       break;
			}
        }
   
   
		}
	}
