package Exam;


public class Print {    
    public static void main(String[] args) {    
            
         
        int a = 0, b = 0;    
            
 
        String str = "Aditya-Kolhatkar";    
            
         
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
                
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                   
                a++;    
            }    
            
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                  
                b++;    
            }    
        }    
        System.out.println("Number of vowels: " + a);    
        System.out.println("Number of consonants: " + b);    
    }    
}   