
/**
 * The class contains the Divide and Conquer-based Algorithms we are using. 
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
	// 1. recursiveDisplayElements --> Displays all elements of a MyList  
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, this recursive algorithm displays its elements by screen (if any).
	 * @param m: The MyList we want to display its elements.	  
	 */	
	public void recursiveDisplayElements(MyList<Integer> m){

	
	    int scenario = 0;

	    if (m==null || m.length() ==0 ) {
	        scenario = 1;}
	    else
	        scenario = 2;

	    switch (scenario) {

	   
	    case 1:
	        System.out.println();
	        break;
	    case 2:
	    	   int e = m.getElement(0);
		        System.out.println(e);
		        m.removeElement(0);
		        recursiveDisplayElements(m);
		        m.addElement(0, e);

	    }

	}


	//-------------------------------------------------------------------
	// 2. smallerMyList --> Filters all elements in MyList smaller than e
	//-------------------------------------------------------------------	
	/**
	 * The function filters all elements of MyList being smaller than 'e'  
	 * @param m: The MyList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyList to.
	 * @return: The new MyList containing just the elements being smaller than 'e'  
	 */	
	public MyList<Integer> smallerMyList(MyList<Integer> m, int e){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;
		int scenario = 0; 
		
		   
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		if(m.length()==0)
			scenario=1;
		else
			scenario=2;
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
						
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
		case 1 :
			res=new MyDynamicList();
			break;
		case 2 :
			int e0=m.getElement(0);
	
			m.getElement(0);
			m.removeElement(0);
			res=smallerMyList(m,e);
			res.addElement(0, e0);
			m.addElement(0, e0);
			if(e<=e0) {
				res.removeElement(0);
				
			}
		
			
			
			break;
			
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;	
	}

	//-------------------------------------------------------------------
	// 3. biggerMyList --> Filters all elements in MyList bigger than e
	//-------------------------------------------------------------------	
	/**
	 * The function filters all elements of MyList being bigger than 'e'  
	 * @param m: The MyList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyList to.
	 * @return: The new MyList containing just the elements being bigger or equal than 'e'  
	 */	
	public MyList<Integer> biggerEqualMyList(MyList<Integer> m, int e){
		//-----------------------------
				//Output Variable --> InitialValue
				//-----------------------------
				MyList<Integer> res = null;
				int scenario = 0; 
				
				   
				//-----------------------------
				//SET OF OPS
				//-----------------------------
				if(m.length()==0)
					scenario=1;
				else
					scenario=2;
				//-----------------------------
				// I. SCENARIO IDENTIFICATION
				//-----------------------------
								
				
				//-----------------------------
				// II. SCENARIO IMPLEMENTATION 
				//-----------------------------
				switch(scenario){	
				case 1 :
					res=new MyDynamicList();
					break;
				case 2 :
					int e0=m.getElement(0);
			
					m.getElement(0);
					m.removeElement(0);
					res=biggerEqualMyList(m,e);
					res.addElement(0, e0);
					m.addElement(0, e0);
					if(e>e0) {
						res.removeElement(0);
					}
				
					
					
					break;
					
				}
				
				//-----------------------------
				//Output Variable --> Return FinalValue
				//-----------------------------		
				return res;
	}
		
	//-------------------------------------------------------------------
	// 3. concatenate --> It concatenates 2 MyList   
	//-------------------------------------------------------------------	
	/**
	 * The function concatenates the content of 2 MyList.   
	 * @param m1: The first MyList.
	 * @param m2: The second MyList.
	 * @return: The new MyList resulting of concatenate the other 2 MyList
	 */	
	public MyList<Integer> concatenate(MyList<Integer> m1, MyList<Integer> m2){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		
		MyList<Integer> res = null;
		
		
		
		
		//-----------------------------
		//SET OF OPS
		//-----------------------------
		
		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
	
	        
		if(m1.length()==0)
			scenario=1;
		else if (m2.length()==0)
			scenario=2;
		else
				scenario = 3;	
		
				
	
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
			int e0=0;
			int size;
		switch(scenario){	
		case 1 :
			res=new MyDynamicList();
			 size = m2.length() - 1;
			while (size >= 0){
				int e = m2.getElement(size);
				res.addElement(0, e); 
				size--;
			}
			break;
		case 2 :
			res= new MyDynamicList ();
			 size = m1.length() - 1;
				while (size >= 0){	
					int e = m1.getElement(size);	
					res.addElement(0, e); 
					size--;
				}
			
			break;
			
		case 3: 
			e0 = m1.getElement(0);
			m1.removeElement(0);
			res = concatenate(m1, m2);	
			res.addElement(0, e0);
			m1.addElement(0, e0);
			
			break;							
		
	}	
	
return res;
}
			
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
	
	
	
	//-------------------------------------------------------------------
	// 4. quickSort --> Sort a MyList using the method quick sort
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyList, it computes a new sorted list using the method Quick Sort.
	 * @param m: The MyList we want to sort.
	 * @return: The new MyList being sorted.	  	  
	 */	  
	public MyList<Integer> quickSort(MyList<Integer> m){
		//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyList<Integer> res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		//Rule 1. MyList m is empty
				if (m.length() == 0||m==null) 
					scenario = 1;
				else{
					//Rule 2. MyList m contains one element
					if (m.length() == 1)
						scenario = 2;
					//Rule 3. MyList m contains more than one element	
					else
						scenario = 3;
				}
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
			
		switch(scenario){	
		case 1 :
			res=new MyDynamicList();
			break;
		case 2:
			res=new MyDynamicList();
			res.addElement(0, m.getElement(0));
			
			break;
		case 3:
			int pivot=m.getElement(0);
			m.removeElement(0);
			MyList<Integer> l =new MyDynamicList();
			MyList<Integer> r =new MyDynamicList();
			l=smallerMyList(m,pivot);
			r=biggerEqualMyList(m,pivot);
			l = quickSort(l);
			r=quickSort(r);	
			r.addElement(0, pivot);
			m.addElement(0, pivot);
			res = concatenate(l,r);
			
		
		break;
}
		
		return res;
		
}
	}
