package com.project1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Operations implements UserInterface {
   
	@Override
	public void showUser() {
		// TODO Auto-generated method stub
	   		System.out.println("Enter the folder path/name you want to retrieve:" );
	      	Scanner sc=new Scanner(System.in);
	   		String input= sc.nextLine();
	        File dir= new File(input);  
	        
	        if(dir.isDirectory()){
	        File [] files= dir.listFiles();
			Arrays.sort(files);  //SORTING 
	        //sorted files are retrieved  
			System.out.println("Sorted Order of files:");
			System.out.println("--------------------------------");
			for(File f: files)
				System.out.println(f.getName());

			}else{
					
				System.out.println(dir.getAbsolutePath() + " is not a directory");
			}                  
	}//End of the method
		

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter the user file name you want to add:");
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine();
		File f=new File(filename);
		try {
			if(f.createNewFile()) {
				System.out.println(filename+" User file is added to the application");
				//Desktop.getDesktop().edit(f);
			}else
				System.out.println(f.getName()+" file is already present");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}//End of the method

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter the user file you want to delete:");
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine();
		File f=new File(filename);
		if(f.delete()) 
			System.out.println(f.getName()+" user file got deleted");
			else
				System.out.println("File not found");
		}//End of the method
		
	
	@Override
	public void searchUser() {
		// TODO Auto-generated method stub
		System.out.println("Enter the user file to be searched: ");
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine();
		File file=new File(filename);
		if(file.exists())
			System.out.println("Searched file "+file.getName()+" exists");
		else
			System.out.println("Searched file "+file.getName()+" does not exists.");
		
	}//End of the method

}
