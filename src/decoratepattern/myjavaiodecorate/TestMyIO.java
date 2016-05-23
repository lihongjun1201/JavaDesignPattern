package decoratepattern.myjavaiodecorate;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestMyIO {

	public static void main(String[] args) {
		
		String filepath = "D:\\EclipseProWorkSpace\\DesignPatternDemo\\src\\decoratepattern\\myjavaiodecorate\\";
		
		int c = 0;
		try {
			InputStream inputStream = new ChangeToLowerCaseInputStream(
										new BufferedInputStream( 
												new FileInputStream(filepath + "mytext.txt")));
			while ( (c=inputStream.read()) >= 0 ) {
				System.out.print((char)c);
			}
		
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
