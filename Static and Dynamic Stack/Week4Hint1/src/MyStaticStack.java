
/**
* ADT MyStack: Private Part<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyStaticStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private int [] items;
	private int numItems;
	private int maxItems;
	
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	

	public MyStaticStack(int m){
		this.maxItems = m;
		this.items = new int[this.maxItems];
		this.numItems = 0;
		
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){
		 if (numItems==0 ) {
		        return true;
		    }
		    return false;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
	//-------------------------------------------------------------------
	
	public int pop(){
	 if(!isEmpty()) {
		numItems --; 
		return items[numItems];
	}
        else {
        	return -1;
       
        }


        }

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	//-------------------------------------------------------------------

	public void push(int element){
		
		if (numItems<maxItems) 
		{
			items[numItems]=element;
			numItems++;
		}
		else 
			System.out.println("Error Stack is OverFlow!!");

	}
	
			
		
	
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------
		
	public void print(){
		if(!isEmpty()) {
			 for(int i = numItems - 1; i >= 0; i--)
			System.out.print("["+items[i]+"]");
			}
			else
				System.out.println("[]");
			}
			
	}


