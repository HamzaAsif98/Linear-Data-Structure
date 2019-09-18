
public class MyDoubleDynamicStack<T> implements MyStack<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicStack(){
		head=null;
		tail=null;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
		// TO-COMPLETE
		if (head==null ) {
			return true;
		}else 
			return false;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: first
	//-------------------------------------------------------------------
	public T first(){
		return head.getInfo();

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element){

		MyDoubleLinkedNode newnode= new MyDoubleLinkedNode (null,element,null);
		if(isEmpty()) {
			head=newnode;
			tail=newnode;
		}else {
			head.setLeft(newnode);
			newnode.setRight(head);
			head=head.getLeft();
		}
		head.setLeft(null);
	}
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){
		MyDoubleLinkedNode temp=head;
		if(isEmpty()) {
		System.out.println("is Empty");
		}
		else if (head==tail) {
			head=null;
			tail=null;
		}
		else {
		head=head.getRight();
		head.setLeft(null);
		temp.setRight(null);
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyStack: last
	//-------------------------------------------------------------------
	public T last(){
		return tail.getInfo();
		// TO-COMPLETE
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyStack: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){
		MyDoubleLinkedNode newnode= new MyDoubleLinkedNode (null,element,null);
		if(isEmpty()) {
			System.out.println("This stack is Empty");
		}else {
			tail.setRight(newnode);
			newnode.setLeft(tail);
			tail=tail.getRight();
			}
	tail.setRight(null);
	
			
	}


	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){
		
		MyDoubleLinkedNode temp=tail;
		if(isEmpty()) {
		System.out.println("is Empty");
		}
		else if (head==tail) {
			head=null;
			tail=null;
		}
		else {
		tail=tail.getLeft();
		tail.setLeft(null);
		temp.setRight(null);
		}
	}
}


