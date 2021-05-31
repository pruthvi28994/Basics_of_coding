package Advanc_java;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

// a program uses an input stream to read data from a source ,one at a time
// a program uses output stream to write data to a destination ,one at a time
public class java_IO_handling {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//using byte stream
		System.out.println("1. Using Byte Stream");
		FileInputStream instream=null;
		FileOutputStream outstream=null;
		try {
			instream=new FileInputStream("C:\\Users\\pruth\\git\\Basics_of_coding\\java_basics\\src\\Advanc_java\\Source.txt");
			outstream=new FileOutputStream("C:\\Users\\pruth\\git\\Basics_of_coding\\java_basics\\src\\Advanc_java\\destination.txt");
			//reads a byte at a time ,if it reachs eof then retuns -1;
			int content;
			//read() reads the file and return -1 if it reachs end of file
			while((content=instream.read())!=-1) {
				outstream.write((byte)content); //int contents conveted to byte 
				//once done you can see destination file got created and contents are copied from source
			}
		}
		catch(Exception e) {
			System.out.println("Error Caused:"+e);
		}
		finally {
			if(instream!=null && outstream!=null) {
				instream.close();
				outstream.close();
			}
		}
		
		//using character stream
		System.out.println("2. Using character Stream");
		FileReader reader=null;
		FileWriter writer=null;
		try {
			reader=new FileReader("C:\\Users\\pruth\\git\\Basics_of_coding\\java_basics\\src\\Advanc_java\\Source1.txt");
			writer=new FileWriter("C:\\Users\\pruth\\git\\Basics_of_coding\\java_basics\\src\\Advanc_java\\destination1.txt");
			//reads a character at a time ,if it reach eof then returns -1;
			int content;
			//read() reads the file and return -1 if it reaches end of file
			while((content=reader.read())!=-1) {
				writer.write((char)content); //int contents conveted to byte 
				//once done you can see destination file got created and contents are copied from source
			}
		}
		catch(Exception e) {
			System.out.println("Error Caused :"+e);
		}
		finally {
			if(reader!=null && writer!=null) {
				reader.close();
				writer.close();
			}
		}
		
	}

}
