/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author HASSAN
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         
     MyNumber   x =  () -> Math.PI;   
        
        System.out.println("NUmber is: "+x.getValue());  
        
        
Number2  isPrime =  (n)->{int d = 2;while(++d < n)if(n % d == 0)return false;return true; };
System.out.println("IsPrime: "+isPrime.test(17));
        
Number2  isEven =  (n) -> (n % 2 == 0); 
  System.out.println("isEven: "+isEven.test(490));    

  Number3 factorial  = (n) -> { int y  =1; for(int i = 1; i <= n; ++i) y *= i; return y;};
  
  System.out.println("factorial: "+factorial.test(5)); 
  
  MyString  r  =  (s)->{String a = ""; int i= 0;for(i = s.length() -1; i >= 0; i-- )a += s.charAt(i);return a;};
  
    System.out.println("Reverse: "+r.reverse("Welcome to java lambdas!")); 
  
    System.out.println("Reverse Array: "+Arrays.toString(reaverArray("java","JavaScript","PHP","CPP","Mango"))); 
  
 Generic<String>  rv  =  (s) ->{String a = ""; int i= 0;for(i = s.length() -1; i >= 0; i-- )a += s.charAt(i);return a;};  
   System.out.println("Reverse: "+rv.compute("Welcome to java lambdas!"));  

 Generic<Integer>  factorial2  =  (n) -> { int y  =1; for(int i = 1; i <= n; ++i) y *= i; return y;};
   System.out.println("factorial2: "+factorial2.compute(10));  
    
   String in  =  "Welcome to java lambdas ";
        System.out.println("Original: "+in);
       
        System.out.println("Computed: "+cow((c) -> c.toUpperCase(), in));
        String    ts  =  cow(Lambda::reverse2, in); //method reference
       System.out.println("Computed: "+ts);
        
       
       
        System.out.println("Pattern:L: "+Pattern.CASE_INSENSITIVE);      
        
    }//end method main 
    
    
    private static String reverse2(String s){
    String r  =  "";
    for(int i=   s.length() - 1; i >= 0; --i)
        r += s.charAt(i);
    return r;
    }
   
private static String  cow(Generic<String>  g, String s){
return  g.compute(s);
}    
    
    
private static String[] reaverArray(String...array){
for(int i = 0 ; i < (array.length - (i+1)); ++i){
   String temp = array[array.length - (i+1)];
   array[array.length - (i+1)]  = array[i];
   array[i] = temp;
}
return array;
}    
    

private void methodRefdemo(){

}//end mrthod

    
}//end class 


interface  Generic<T>{

T  compute(T  a);
}

interface   MyString{

String reverse(String x);
}

interface   MyNumber{

double getValue();
}

interface   Number3{

    int test(int n);

}

interface   Number2{

    boolean test(int n);

}