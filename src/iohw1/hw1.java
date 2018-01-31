package iohw1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class hw1 {
public static void main(String[] args) throws IOException {
	File file=new File("D:/DAD/控制台输入.wmv");
	
	InputStream is=new FileInputStream(file);
	byte[] b=new byte[(int) file.length()];
	is.read(b);
	File file1=new File("D:/EAE/控制台输入.wmv");
	file1.createNewFile();
	OutputStream os=new FileOutputStream(file1);
	/*byte[] abcd=b;*/
	os.write(b);
	System.out.println("success");
	
	
		
	
	
}
}
