package DoubleLinkedList_Insertion_Deletion;

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
		
		ob.delete_begin();
		ob.delete_begin();
		
		
		ob.delete_end();
		ob.delete_end();
		
		ob.delete_after(5);
		ob.delete_after(6);
		ob.delete_after(6);
		
		ob.delete_before(17);
		ob.delete_before(1);
		ob.delete_before(5);
	
		
		
		
		
		
		
		
		
		ob.show();
		
		
		 
		
		

	}

}
