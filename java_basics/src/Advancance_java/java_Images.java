package Advancance_java;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class java_Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//image Handling using java 
		System.out.println("Image handling using Java");
		System.out.println("-->>using file handling");
		int width=500;
		int height=600;
		BufferedImage img=null;
		img = readFromFile(width,height,img);
		writeToFile(img);
	}
	private static BufferedImage readFromFile(int width,int height,BufferedImage img) {
		try {
			//choose the image using File IO
			File sampleFile=new File("C:\\Users\\pruth\\OneDrive\\Desktop\\auto.jpg");
			//obj of buffered image
			img=new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
			//read i/p the file
			img=ImageIO.read(sampleFile);
			System.out.println("Reading complete :"+img);
		}
		catch(IOException e) {
			System.out.println("Error :"+e);
		}
		return img;
	}
	private static void writeToFile(BufferedImage img) {
		try {
			File output=new File("C:\\Users\\pruth\\OneDrive\\Desktop\\output.jpg");
			//calling the write function to pass the args to create the file
			
			//source file,type of img,location
			ImageIO.write(img,"jpg",output);
			
			//printing the hash code of img
			System.out.println("Successfully completed the writing");
		}
		catch(IOException e) {
			System.out.println("Error : "+e);
		}
	}
}
