import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * ADT MyStack: Private Part<br>. 
 * The class implements all the operations available in MyStack<br>
 */
public class MyDynamicStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	//TO-COMPLETE
	private MyNode head;



	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	

	public MyDynamicStack(){
		//TO-COMPLETE
		this.head = null;


	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){
		if (head==null ) {
			return true;
		}
		else
			return false;
	}


	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
	//-------------------------------------------------------------------

	public int pop(){
		if(head!=null) {
			MyNode previous = head;
			head = head.getNext();
			return previous.getInfo();
		}
		else 	
			return -1;

	}




	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to the top of MyStack: push
	//-------------------------------------------------------------------

	public void push(int element){
		//TO-COMPLETE
		head = new MyNode(element, head);

	}


	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------

	public void print(){
		//TO-COMPLETE
		MyNode ref = head;
		if(ref!=null) {  
			while (ref != null) {
				System.out.print("["+ref.getInfo()+"]");
				ref = ref.getNext();
			}
		}else
			System.out.println("[]");

	}
}







