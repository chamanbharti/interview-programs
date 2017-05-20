package complexprogram;

public class FibbonaciExample4 {
	//First two number of series  
	 static int prev=0,next=1;  
	 static int sum=0;  
	 public static void main(String[] args)  
	 {  
	    
	  System.out.println("Printing Fibonacci series:");  
	    
	  //printing first two elements    
	  System.out.print(prev+" "+next);  
	  //number of elements to be printed  
	  int numberOfElements=10;  
	  // -2 because we have already printed 2 elements  
	  printFibonacciSeriers(numberOfElements-2);  
	 }  
	   
	 public static void printFibonacciSeriers(int numberOfElements)  
	 {  
	  if(numberOfElements==0)  
	   return;  
	  else  
	  {  
	   sum=prev+next;  
	   System.out.print(" "+sum);  
	   //prepare for next 2 terms  
	   prev=next;  
	   next=sum;  
	   printFibonacciSeriers(numberOfElements-1);  
	  }  
	    
	 }  
}
