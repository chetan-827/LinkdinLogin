package ece.btech1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteFiles {

	public static void main(String[] args) {

		try {
			File obj=new File("Marks Eamcet.txt");
			if(obj.createNewFile()) {
				System.out.println("File already exists.");
			}else {
				System.out.println("File created: "+ obj.getName());
			}
		}catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		try {
			FileWriter mywrite=new FileWriter("Marks Eamcet.txt");
			mywrite.write("Files in java might be tricky");
			mywrite.close();
			System.out.println("Successfully wrote to the file");
		}catch (Exception e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		
		try {
			File newfile=new File("Marks Eamcet.txt");
			Scanner myreader=new Scanner(newfile);
			while(myreader.hasNextLine()) {
				String data=myreader.nextLine();
				System.out.println(data);
			}
			myreader.close();
		}catch (Exception e) {

			System.out.println("An error");
			e.printStackTrace();
		}
	}
}
