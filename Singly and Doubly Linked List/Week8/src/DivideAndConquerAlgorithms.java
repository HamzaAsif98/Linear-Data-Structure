
/**
 * The class contains the Divide and Conquer-nd Algorithms we are using. 
 */
public class DivideAndConquerAlgorithms {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public DivideAndConquerAlgorithms(){}
		
	//-------------------------------------------------------------------
	// 0. iterativeDisplayElements --> Displays all elements of a MyList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, this iterative algorithm displays its elements by screen (if any).
	 * @param m: The MyList we want to display its elements.	  
	 */	
	public void iterativeDisplayElements(MyList<Integer> m){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. MyList is empty
		if (m.length() == 0) 
			scenario = 1;
		//Rule 2. MyList is non-empty
		else
			scenario = 2;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty
		case 1: 
			//1. We print the empty message
			System.out.println("Empty MyList");
			
			break;
			
		//Rule 2. MyList is non-empty
		case 2: 
			//1. We print the initial message
			int size = m.length();
			System.out.println("MyList Contains the following " + size + " items: ");
			
			//2. We traverse the items
			for (int i = 0; i < size; i++)
				System.out.println("Item " + i + ": " + m.getElement(i));
			
			break;
	
		}
		
	}

	//-------------------------------------------------------------------
	// 1. maxInt --> Computes the maximum item of MyList 
	//-------------------------------------------------------------------	
	/**
	 * The function computes the maximum item of m (-1 if m is empty). 
	 * @param m: The MyList we want to compute its maximum item.
	 * @return: The maximum item of MyList	  
	 */	
	public int maxInt(MyList<Integer> m){
		
		int res;
		if (m.length()!=0) {
			
			int e=m.getElement(0);
			m.removeElement(0);
			res=maxInt(m);
			m.addElement(0, e);
			if(e>res) 
				res=e;
				return res;
			
		}else 
			return -1;
		
		
	}
			
		
		

	
		

	//-------------------------------------------------------------------
	// 2. isReverse --> Computes if MyList is sorted in decreasing order 
	//-------------------------------------------------------------------	
	/**
	 * The function computes whether m is sorted in decreasing order or not.  
	 * @param m: The MyList we want to check.
	 * @return: Whether m is sorted in decreasing order or not.  
	 */	
	public boolean isReverse(MyList<Integer> m){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		boolean res = true;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. MyList is empty or contains just one element
		if (m.length()<=1) 
			scenario = 1;
		//Rule 2. MyList has more than one element
		else
			scenario = 2;
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyList is empty or contains just one element
		case 1: 
			//1. We assign res to true
			res = true;
			
			break;
			
		//Rule 2. MyList has more than one element
		case 2: 
			//1. We get the first two elements of MyList
			int e0 = m.getElement(0);
			int e1 = m.getElement(1);
			
			//2. If the first one is smaller than the second, we keep testing the rest of MyList
			if (e0 >= e1){
				//2.1. We remove the first element from MyList
				m.removeElement(0);
				
				//2.2. We recursively solve the smaller problem
				res = isReverse(m);
				
				//2.3. We also add elem0 back to m1, so as to not to modify its original state
				m.addElement(0, e0);
			}
			//3. If the first one is bigger than the second one, we can conclude MyList is not sorted
			else
				res = false;
			
			break;
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}

	//-------------------------------------------------------------------
	// 3. getNumAppearances --> Computes the amount of times that integer appears in MyList  
	//-------------------------------------------------------------------	
	/**
	 * The function computes the amount of times that the integer n appears in m.   
	 * @param m: The MyList we want to use.
	 * @param n: The number we want to compute its appearances for.
	 * @return: The amount of appearances of n into m  
	 */	
	public int getNumAppearances(MyList<Integer> m, int n){
		
		
	
		int scene=0;
		int res=0;

		
	if (m.length()<1) {
		scene=1;
	}else
		scene=2;
	switch(scene){	
	case 1 : 
		res=0;
		break;
	case 2 :
		int e0=m.getElement(0);
		m.removeElement(0);
		res=getNumAppearances(m,n);
		m.addElement(0, e0);
		if(e0==n)
			return res+1;
		else 
			return res;	
		}
		
	
	
	
		
		return res;
		
	}
	
	//-------------------------------------------------------------------
	// 4. power --> Computes the m-est power of n
	//-------------------------------------------------------------------	
	/**
	 * The function computes n to the power of m.
	 * @param n: The n number.
	 * @param m: The power of n we want to compute
	 * @return: n to the power of m.  
	 */	

	public int power(int n, int m){

		if(m==0) {
			return 1;
			}else
			return n*power(n,m-1);
		
		}
		
	
	
	//-------------------------------------------------------------------
	// 5. lucas --> Computes the n-est term of the Lucas series
	//-------------------------------------------------------------------	
	/**
	 * The function computes the n-est term of the Lucas series
	 * @param n: The n-est term of the series we want to compute
	 * @return: The term being computed 
	 */	
	public int lucas(int n){
		 if( n == 0 ) return 2;
		    if( n == 1 ) return 1;
		    return lucas(n-1) + lucas(n-2);
	}
		
	

	//-------------------------------------------------------------------
	// 6. drawImage --> Prints a pattern of a given length
	//-------------------------------------------------------------------	
	/**
	 * The function prints prints a pattern of a given length.
	 * *
	 * **
	 * ***
	 * ... 
	 * @param n: The length of the desired pattern
	 */	
	public void drawImage(int n){
				
		if(n >= 0) {
	        drawImage(n-1);
	            for(int i = 0; i < n; i++) {
	                System.out.print("*");
	            }
	            System.out.println(); 
	        }
	    }
		
}
