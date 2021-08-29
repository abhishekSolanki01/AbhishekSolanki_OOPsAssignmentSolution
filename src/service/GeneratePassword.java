package service;

import java.util.Random;

public class GeneratePassword {
    public char[] generatePassword(){
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";

      Random random = new Random();
      
       char [] password = new char [8];
    //   for(int i=0; i<8; i++){
    //       password[i] = capitalCaseLetters.charAt(random.nextInt(25));
    //   }

    for(int i=0; i<2; i++){
        password[(4*i)] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())); //;+ lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())); //+ specialCharacters.charAt(random.nextInt(specialCharacters.length())) +  numbers.charAt(random.nextInt(numbers.length()))  + capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())) + lowerCaseLetters.charAt(random.nextInt(25)) + specialCharacters.charAt(random.nextInt(specialCharacters.length())); //+  numbers.charAt(random.nextInt(numbers.length())); // + (numbers.charAt(random.nextInt(25))) ;
        password[1+(4*i)] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[2+(4*i)] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3+(4*i)] = numbers.charAt(random.nextInt(numbers.length())); 
    }

       //char c = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
    //    char c1 = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())); //;+ lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())); //+ specialCharacters.charAt(random.nextInt(specialCharacters.length())) +  numbers.charAt(random.nextInt(numbers.length()))  + capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())) + lowerCaseLetters.charAt(random.nextInt(25)) + specialCharacters.charAt(random.nextInt(specialCharacters.length())); //+  numbers.charAt(random.nextInt(numbers.length())); // + (numbers.charAt(random.nextInt(25))) ;
    //    char c2 = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
    //    char c3 = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
    //    char c4 = numbers.charAt(random.nextInt(numbers.length())); 
    //    String s = password.toString();
    //   System.out.println(password);
      return password;
    }

}
