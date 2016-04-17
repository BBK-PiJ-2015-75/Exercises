package ex01Ls;

import java.io.File;

/*Write a program that shows on screen the names of the files in the current directory. (Hint: look at methods from
class File).*/


public class Files {

	public static void main (String [] args) {	
		File files = null;
		String[] paths;
		
		try{		
			files = new File("c:"+ File.separator + "users"+ File.separator + "admin" + File.separator + "workspace" + File.separator +
					 "day16io" + File.separator + "src");
			System.out.println(files);
			
			paths = files.list();
			
			for(String path: paths) {
				System.out.println(path);
			}		
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}	
	}
}
