package labThreepkg;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lab3ArraysAndMethodsLab {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //
 // Copyright (c) 2023 Promineo Tech
 // Author:  Promineo Tech Academic Team
 // Subject: Arrays & Methods
 // Java Week 03 Lab
 //

// this comments out the entire array section.   
//         //
//         // Arrays:
//         //
//         
//         // 1. Create an array with the following values 1, 5, 2, 8, 13, 6
//int [] numberArray = { 1, 5, 2, 8, 13, 6};
//System.out.println(Arrays.toString(numberArray));
//         
//         // 2. Print out the first element in the array
//System.out.println(numberArray[0]);
//         
//         // 3. Print out the last element in the array without using the number 5
//System.out.println(numberArray[numberArray.length - 1]);      
//         
//         // 4. Print out the element in the array at position 6, what happens?
////System.out.println(numberArray[6]); // exception "index 6 out of bounds"
//         
//         // 5. Print out the element in the array at position -1, what happens?
////System.out.println(numberArray[-1]); // exception "index -1 out of bounds"
//             
//         // 6. Write a traditional for loop that prints out each element in the array
//for(int i=0; i<numberArray.length; i++) {
//  System.out.println(numberArray[i]);
//}
//
//         // 7. Write an enhanced for loop that prints out each element in the array
//
////for(int numbers : numberArray) {
////  System.out.println(numbers);
////}
//
//         // 8. Create a new variable called sum, write a loop that adds 
//         //          each element in the array to the sum
//
////int sum = 5;
////for(int j=0; j<numberArray.length; j++) {
////   numberArray[j] += sum;
////  System.out.println(numberArray[j]);
////}
//System.out.println();
//         // 9. Create a new variable called average and assign the average value of the array to it
//
// double sum2 = IntStream.of(numberArray).sum();
// double average = sum2 / numberArray.length;
//System.out.println(average);
//         
//System.out.println();
//         // 10. Write an enhanced for loop that prints out each number in the array 
//         //          only if the number is odd
//for(int numbers : numberArray) {
//  if(numbers % 2 != 0) {
//    System.out.println(numbers);
//  }
//}
//System.out.println();
//         
//         // 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
//String [] nameArray = {"Sam", "Sally", "Thomas", "Robert"};
//for (int y=0; y<nameArray.length; y++) {
//System.out.println(nameArray[y]);
//}
//System.out.println();
//
//
//         // 12. Calculate the sum of all the letters in the new array
//int totalCount = 0;
//for (String s : nameArray) {
//  totalCount += s.length();
//}
//System.out.println(totalCount);
//System.out.println();

    
    
    
  
    
          //         
          // Methods:
          //         
          
         // 13. Write and test a method that takes a String name and prints out a greeting. 
         //          This method returns nothing.
String name = "Caitlyn";
createGreetingOne(name);
System.out.println();
         // 14. Write and test a method that takes a String name and  
         //          returns a greeting.  Do not print in the method.
String newGreeting = createGreeting(name);
System.out.println(newGreeting);

         // Compare method 13 and method 14:  
         //      a. Analyze the difference between these two methods.
         //      b. What do you find?      13 CALLS THE METHOD WHERE THE METHOD PRINTS THE GREETING AUTOMATICALLY, NO RETURN STATEMENT
                                        // 14 RETURNS THE STATEMENT THAT IS THEN USED WHEN SYSTEM PRINTING IN THE MAIN METHOD

         //      c. How are they different? THEY PRINT THE SAME THING ESSENTIALLY, BUT FROM DIFFFERENT PLACES IN THE CODE
        
         
         // 15. Write and test a method that takes a String and an int and 
         //          returns true if the number of letters in the string is greater than the int
String word =  "Toodle Time";
int number = 5;
System.out.println("Method 15: " + isEqual(word, number));


         // 16. Write and test a method that takes an array of string and a string and 
         //          returns true if the string passed in exists in the array
String[] stringArray = {"Toodle", "Booger", "Beanie", "Pippy"};         
String singleName = "Silly";    
System.out.println("Method 16: " + existsInArray(stringArray, singleName));

         // 17. Write and test a method that takes an array of int and 
         //          returns the smallest number in the array
int[] intArray = {-2, 5, 6, 8, 51, -300, 625, 79, 102, -1};
int smallestInt = smallestIntArray(intArray);
System.out.println("Method 17: " + smallestInt);
         
         // 18. Write and test a method that takes an array of double and 
         //          returns the average
 double[] doubleArray = {55.68, 79.57, 28.00, 38.47, 93.76};
 double averageDouble = averageOfDouble(doubleArray);
 System.out.println("Method 18: " + averageDouble);


         // 19. Write and test a method that takes an array of Strings and 
         //          returns an array of int where each element
         //          matches the length of the string at that position
String[] arrayOfStrings = {"String", "AlsoString", "Ilovetoodie", "andIlovebeanie", "Ilovepippytoo"};
convertWordsToIntegers(arrayOfStrings);
System.out.println("Method 19: " + Arrays.toString(convertWordsToIntegers(arrayOfStrings)));
                 
         // 20. Write and test a method that takes an array of strings and 
         //          returns true if the sum of letters for all strings with an even amount of letters
         //          is greater than the sum of those with an odd amount of letters.
System.out.println("Method 20: " + evenAndOddStrings(arrayOfStrings));
String[] secondStrings = {"Leaky", "iphones", "Bean"}; //false string test! it works!!
System.out.println("Method 20: " + evenAndOddStrings(secondStrings));   

         // 21. Write and test a method that takes a string and 
         //          returns true if the string is a palindrome

String testString = "Dood";
isPalindrome(testString);
System.out.println("Method 21: " + isPalindrome(testString));




         
}
     

     
     // Method 13:
public static void createGreetingOne(String str) {
  String greeting = "Method 13: Hello " + str;
  System.out.println(greeting);
}


     // Method 14:
  public static String createGreeting(String str) {
    String greeting = "Method 14: Hello " + str ;
    return greeting;
  }
     
     // Method 15:
public static boolean isEqual(String str, int num) {
  if (str.length() > num) {
    return true;
} else {
  return false;
}
} 

     // Method 16:
public static boolean existsInArray(String[] str, String str2) {
  for (int i = 0; i < str.length; i++) {
   if( str2 == str[i]) {
     return true;
   } 
  }
  return false;
}
//this code works because it will loop through the entire array and if it doesn't find
//a match, it gets to the end of the loop and prints false. no need for an else statement
     
     // Method 17: still not super sure how this works..

public static int smallestIntArray(int[] num) {
  int smallest = num[0];
for(int i= 0; i<num.length; i++) {
  if(num[i] < smallest) {
    smallest = num[i];
  }
}
return smallest;
}


     // Method 18:
public static double averageOfDouble(double[] num) {
 double sum = 0;
 for(double values : num) {
   sum+=values;
 }
 double average = sum / num.length;
 return average; 
}
     
     // Method 19:
public static int[] convertWordsToIntegers(String[]str) {
  int[] num = new int[str.length];
  for (int i = 0; i< str.length; i++) {
    num[i] = str[i].length();
  }
  return num;
}
     
     // Method 20:
public static boolean evenAndOddStrings (String[]str) {
  int[] num = new int[str.length];
  int evenSum = 0;
  int oddSum = 0;
  for (int i = 0; i< str.length; i++) {
    num[i] = str[i].length();
  }
  for (int j = 0; j< num.length;j++) {
   if (num[j] % 2 == 0) {
      evenSum += num[j];
   } else if (num[j] %2 != 0){
     oddSum += num[j];
   }
}
if (evenSum > oddSum) {
  return true;
}
return false;
}    
     
     // Method 21: 

//starting at each end of the string this method will iterate down one letter from the top, and up one letter from the end, checking for each letter to match, then continuing
//if it makes it to the middle of the word without a mismatch, then the string is a palindrome
public static boolean isPalindrome (String str) {
  String str2 = str.toLowerCase(); //makes the string all lowercase so the capital letters dont through a false
  int i = 0;
  int j = str2.length()-1; // this is just declaring i and j variables to use below
    while (i < j) { // while i (set to the first letter of the string) is less than j (set to the last letter of the string)...
      if(str2.charAt(i) != str2.charAt(j)) { //if the first letter checked does not equal the last letter checked, and each letter between after that, then the method will return false
         return false;
    }
      i++; //iterate up 1 character at a time
      j--; //iterate down 1 character at a time, comparing each letter to each other
  }
  return true; //if you get through the entire string and meet in the middle, then it MUST be a palindrome because each opposing letter matched.
}






   

 
  }


