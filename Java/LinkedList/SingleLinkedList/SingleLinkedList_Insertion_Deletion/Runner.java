package SingleLinkedList_Insertion_Deletion;

public class Runner 
{

	public static void main(String[] args) 
	{
		SingleLinkedList ll=new SingleLinkedList();
		ll.insert_end(11);
		ll.insert_end(12);
		ll.insert_end(13);
		ll.insert_end(14);
		
		ll.insert_start(7);
		ll.insert_start(6);
		ll.insert_start(5);
		ll.insert_start(4);
		
		ll.insert_before(4, 10);
		ll.insert_before(4, 9);
		ll.insert_before(15, 9);
		ll.insert_before(-17,177);
        ll.insert_before(10,17);
        
        ll.insert_after(9,15);
        ll.insert_after(3, 8);
        ll.insert_after(-77, 8);
        
        ll.delete_end();
        ll.delete_end();
        
        
        ll.delete_start();
        ll.delete_start();

        ll.delete_before(4);
        ll.delete_before(40);
        
        ll.delete_after(6);
        ll.delete_after(0);
        ll.delete_after(4);
        ll.delete_after(40);
		
        ll.delete_at(5);
        ll.delete_at(0);
        ll.delete_at(2);
		ll.show();
	}

}
