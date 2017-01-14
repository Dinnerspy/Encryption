/*
* Nicholas Ouellette 3556762
*cs1073 Assignment 8, question 1 
* created November 10 2016
*
*purpose: Encrypt passwords 
*input: Strings
*output: Encrypted password as string
*
*/

import java.util.Scanner;

public class Encryption {

    
    public static void main(String[] args) {
        String UserKey, UserPassword, UserAnswer;
        

        System.out.println("Welcome to the Encrypter Admin.\nPlease enter a Encryption key.");
        Scanner myscanner = new Scanner(System.in);
        UserKey = myscanner.nextLine();
        while (!UserKey.matches("[a-zA-Z]+")) {

            System.out.println("Invalid text, alphabets only. Try agian.\n");
            UserKey = myscanner.nextLine();
        }

        System.out.println("\n\nWelcome to the Encrypter client.\nPlease enter the password"
                + " you whis to encrypt.");
        UserPassword = myscanner.nextLine();
         while(UserPassword.equalsIgnoreCase(UserKey)){
        
        System.out.println("Invalid text, Can not use the key. Try agian.\n");
            UserPassword = myscanner.nextLine();
        
        }
        while (!UserPassword.matches("[a-zA-Z]+")) {

            System.out.println("Invalid text, alphabets only. Try agian.\n");
            UserPassword = myscanner.nextLine();
             while(UserPassword.equalsIgnoreCase(UserKey)){
        
        System.out.println("Invalid text, Can not use the key. Try agian.\n");
            UserPassword = myscanner.nextLine();
        
        }
        }
        EncryptionCreater Password = new EncryptionCreater(UserKey,UserPassword);
        Password.EncryptABCS();
        System.out.println("Continue(y/n)? ");
        UserAnswer = myscanner.nextLine();
        //only take y or n
         while (!UserAnswer.equalsIgnoreCase("y")&& !UserAnswer.equalsIgnoreCase("n")) {

            System.out.println("Invalid text, y or n only. Try agian.\n");
            UserAnswer = myscanner.nextLine();
        }
         
         //runs untill user is done
       while (UserAnswer.equalsIgnoreCase("Y")){
           
           Password.reset();
           
           
           System.out.println("Please enter the password"
                + " you whis to encrypt.");
        UserPassword = myscanner.nextLine();
        while(UserPassword.equalsIgnoreCase(UserKey)){
        
        System.out.println("Invalid text, Can not use the key. Try agian.\n");
            UserPassword = myscanner.nextLine();
        
        }
        while (!UserPassword.matches("[a-zA-Z]+")) {
            System.out.println("Invalid text, alphabets only. Try agian.\n");
            UserPassword = myscanner.nextLine();
            
             while(UserPassword.equalsIgnoreCase(UserKey)){
        
        System.out.println("Invalid text, Can not use the key. Try agian.\n");
            UserPassword = myscanner.nextLine();
        
        }
        }
           Password.setCleanPass(UserPassword);
           Password.EncryptABCS();
        System.out.println("Continue(y/n)? ");
        UserAnswer = myscanner.nextLine();
       }

    }

}
