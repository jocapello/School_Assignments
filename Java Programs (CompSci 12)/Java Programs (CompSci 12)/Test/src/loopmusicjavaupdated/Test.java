package loopmusicjavaupdated;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File; // File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; // handle errors
import java.io.LineNumberReader;
import java.util.Scanner;
public class Test{
	public static void main(String[]args) throws IOException {
		writeFile1();
	}
	public static void writeFile1() throws IOException {
		//			FileWriter myWriter = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\Filef1.txt");
		try {
			File fout = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\Filef1.txt");
			FileOutputStream fos = new FileOutputStream(fout);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

			for (int i = 0; i < 10; i++) {
				bw.write("something");
				bw.newLine();
			}

			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
//		String filepath = "Music.wav";
//		TestPartDu musicObject = new TestPartDu();
//		musicObject.playMusic(filepath);




// Create file
//	public static void main(String[]args) {
//		try {
//			File myObj = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\GameInfo.txt");
//			if (myObj.createNewFile()) {
//				System.out.println("File created: "+myObj.getName());
//			} else {
//				System.out.println("File already exists. ");
//			}
//			
//		} catch (IOException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
//	}
// File info
//	public static void main(String[]args) {
//		File myObj = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\Filef1.txt");
//		if (myObj.exists()) {
//			System.out.println("File name: "+myObj.getName());
//			System.out.println("Absolute path: "+myObj.getAbsolutePath());
//		}
//		else {
//			System.out.println("The file does not exist");
//		}
//	}
// Write to the file
//	public static void main(String[]args) {
//		try {
//			FileWriter myWriter = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\Filef1.txt");
//			myWriter.write("Java1");
//			myWriter.close();
//			System.out.println("Wrote");
//		} catch (IOException e) {
//			System.out.println("Error");
//			e.printStackTrace();
//		}
//	}
// Read
//	public static void main(String[]args) {
//	try {
//		File myObj = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\Filef1.txt");
//		Scanner myReader = new Scanner(myObj);
//		while (myReader.hasNextLine()) {
//			String data = myReader.nextLine();
//			System.out.println(data);
//		}
//		myReader.close();
//		} catch (FileNotFoundException e) {
//		System.out.println("Error");
//		e.printStackTrace();
//	}
//}



// Tracks changes in top right button 
if (splited[1].equals("1") && Button.equals("1") && Stop[0].equals("1")  && splited[3].equals("0")) {
	if (Information2[2][0].equals("2") || Information2[2][0].equals("0")) {
		Information2[2][0]="1";
	}
	else if (Information2[2][0].equals("1")) {			
		Information2[2][0]="0";
	}
	//System.out.println(Information2[2][0]+" BUTTON1");
	Stop[0]="0";
}
// Tracks changes in top left button 
if (splited[1].equals("5") && Button.equals("5") && Stop[1].equals("1")  && splited[3].equals("0")) {
	if (Information2[3][0].equals("2") || Information2[3][0].equals("0")) {
		Information2[3][0]="1";
	}
	else if (Information2[3][0].equals("1")) {			
		Information2[3][0]="0";
	}
	//System.out.println(Information2[3][0]+" BUTTON2");
	Stop[1]="0";
}
// Tracks changes in second row, first button 
if (splited[1].equals("9") && Button.equals("9") && Stop[2].equals("1")  && splited[3].equals("0")) {
	if (Information2[4][0].equals("2") || Information2[4][0].equals("0")) {
		Information2[4][0]="1";
	}
	else if (Information2[4][0].equals("1")) {			
		Information2[4][0]="0";
	}
	//System.out.println(Information2[4][0]+" BUTTON3");
	Stop[2]="0";
}
// Tracks changes second row, second button 
if (splited[1].equals("13") && Button.equals("13") && Stop[3].equals("1")  && splited[3].equals("0")) {
	if (Information2[5][0].equals("2") || Information2[5][0].equals("0")) {
		Information2[5][0]="1";
	}
	else if (Information2[5][0].equals("1")) {			
		Information2[5][0]="0";
	}
	//System.out.println(Information2[5][0]+" BUTTON4");
	Stop[3]="0";
}
// Tracks changes in third row, first button 
if (splited[1].equals("17") && Button.equals("17") && Stop[4].equals("1")  && splited[3].equals("0")) {
	if (Information2[6][0].equals("2") || Information2[6][0].equals("0")) {
		Information2[6][0]="1";
	}
	else if (Information2[6][0].equals("1")) {			
		Information2[6][0]="0";
	}
	//System.out.println(Information2[6][0]+" BUTTON5");
	Stop[4]="0";
}
// Tracks changes in third row, second button 
if (splited[1].equals("21") && Button.equals("21") && Stop[5].equals("1")  && splited[3].equals("0")) {
	if (Information2[7][0].equals("2") || Information2[7][0].equals("0")) {
		Information2[7][0]="1";
	}
	else if (Information2[7][0].equals("1")) {			
		Information2[7][0]="0";
	}
	//System.out.println(Information2[7][0]+" BUTTON6");
	Stop[5]="0";
}
// Tracks changes in bottom right button 
if (splited[1].equals("25") && Button.equals("25") && Stop[6].equals("1")  && splited[3].equals("0")) {
	if (Information2[8][0].equals("2") || Information2[8][0].equals("0")) {
		Information2[8][0]="1";
	}
	else if (Information2[8][0].equals("1")) {			
		Information2[8][0]="0";
	}
	//System.out.println(Information2[8][0]+" BUTTON7");
	Stop[6]="0";
}

