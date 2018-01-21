package DoubleLinkedList;

public class Runner {

	public static void main(String[] args) 
	{
		DoubleLinkedList ob=new DoubleLinkedList();
		ob.insert_last(10);
		ob.insert_last(11);
		ob.insert_last(12);
		ob.insert_last(13);
	

		ob.insert_begin(7);
		ob.insert_begin(6);
		ob.insert_begin(5);
		ob.insert_begin(4);
 		
		
		ob.insert_after(9, 3);
		ob.insert_before(8, 4);
		
		ob.insert_after(14, 9);
		ob.insert_after(16, 10);
		ob.insert_before(15, 11);
		
		
		
		
		
		ob.show();
		
		
		 
		
		

	}

}
