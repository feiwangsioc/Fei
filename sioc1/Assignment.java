package sioc1;

import java.io.BufferedReader;
import java.io.*;


public class Assignment {

	public static void main(String[] args) throws Exception {
		
		File file = new File ("C:/Users/feiwa/Desktop/Fei.txt");
		BufferedReader br = new BufferedReader( new FileReader(file));
       // String st = br.readLine();
       String st;
		while((st = br.readLine())!=null) {
        	
        	System.out.println(st);
        	
        }
	}

}
