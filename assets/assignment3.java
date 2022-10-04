
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//scanner class
    Scanner inputData = new Scanner(System.in);
    //
    
    System.out.println("---------------------------------------------");
    
    System.out.println("CV Assignment solution 3");
    
    System.out.println("---------------------------------------------");
    
    System.out.println("Enter a Sentence");
    String sentence = inputData.nextLine();
    System.out.println("Enter a Letter");
    String letter = inputData.nextLine();
    //
    int index = sentence.indexOf(letter);
    //
    if(index == -1){
        System.out.println("The letter does not exist in the sentence");
    }else{
        System.out.println(sentence.substring(index+1));
    }
	    
	}
}
