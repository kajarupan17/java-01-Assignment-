
//swap two numbers  without temporary variable 

import java.*; 
  
class question8
 { 
  
    public static void main(String a[]) 
    { 
        int n1 = 10; 
        int n2 = 5; 
		
        n1 = n1 + n2; 
        n2 = n1 - n2; 
        n1 = n1 - n2; 
        System.out.println("After swaping:" + " n1 = " + n1 + ", n2 = " + n2); 
    } 
 } 