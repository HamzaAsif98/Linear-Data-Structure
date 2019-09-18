package paspaper;

public class function {
		   
	
		   int value; 
		 	 	  
		   void set_val(int n) 
		   {       this.value=n;  
		   }  
		   int get_val() 
		   {       return this.value; 	 
		   } 
		 	 
		   public static void function1() {      
			   function n = new function(); 
		      n.set_val(8);  
		      function2(n); 
		      System.out.println("n = " + n.get_val()); 
		   }    
		   public static void function2(function n) { 
		      n.set_val(2);    
		      return; 
		   }     
		   public static void main (String[] args) { 
			 	function1(); 
		   } } 

