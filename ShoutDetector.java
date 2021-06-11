import java.util.Scanner;

public class ShoutDetector {
  public static void main(String[] args) {
    System.out.println("Please say something");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.next();


    if(isUpperCase(userInput)){
      System.out.println("No yelling");
    } else if(userInput.contains("!!")){
      System.out.println("Chill....");

    } else {
      System.out.println("You said:" + userInput + " \nOkay, thank you!");
    }
  }
  private static boolean isUpperCase(String userInput) {
    //convert str to char array
    char[] charArray = userInput.toCharArray();
    for(int i=0; i < charArray.length; i++) {
      //if characters are not upperCase, return false
      if(!Character.isUpperCase(charArray[i]))
        return false;
    }
    return true;

    }
}