
//Declaration of class for printing ascii codes and its character value
public class AsciiPrint {
	public static void main(String Args[]){ // Declaration of main method
		
		String ch;//String variable declaration for storing character value
		
			//
			for (int i = 65; i<=90; i++){
			ch = new Character((char)i).toString();	//type casting each value of i to character ant to string	
			System.out.println("ASCII VAlue of " + ch + " = " + i + "\n");	//Printing character with corresponding ascii value
		}
	}
}
