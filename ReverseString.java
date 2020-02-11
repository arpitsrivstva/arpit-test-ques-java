//   Java Program to Reverse a String using Recursion

package Exam;
class ReverseString
{ 
 
 void reverse(String str) 
 { 
     if ((str==null)||(str.length() <= 1)) 
        System.out.println(str); 
     else
     { 
         System.out.print(str.charAt(str.length()-1)); 
         reverse(str.substring(0,str.length()-1)); 
     } 
 } 
   
//main function//
 public static void main(String[] args)  
 { 
     String str = "Aditya Kolhatkar"; 
     ReverseString obj = new ReverseString(); 
     obj.reverse(str); 
 }     
} 