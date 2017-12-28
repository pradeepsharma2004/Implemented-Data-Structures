package LinkedList;

public class Runner 
{

	public static void main(String[] args) 
	{
		LList ll=new LList();
		ll.insertAtEnd(45);
		ll.insertAtEnd(46);
		ll.insertAtEnd(47);
		ll.insertAtEnd(48);
		ll.insertAtEnd(49);
		ll.insertAtEnd(50);
		ll.insertAtStart(8);
		ll.insertAtStart(7);
		ll.insertAtAnyLocation(0, 6);
		ll.insertAtAnyLocation(5, 96);
		ll.deleteAt(6);
		ll.deleteAt(0);
		ll.show();
	}

}
