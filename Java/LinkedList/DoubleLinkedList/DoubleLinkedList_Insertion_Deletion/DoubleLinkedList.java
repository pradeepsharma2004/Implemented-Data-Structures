package DoubleLinkedList_Insertion_Deletion;

import org.omg.Messaging.SyncScopeHelper;

public class DoubleLinkedList 
{
	Node head;
	int size=-1;
	public void insert_last(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.prev=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
			node.prev=n;
		}
		size++;
	}
	
	public void insert_begin(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.prev=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head.prev=node;
			head=node;
		}
		size++;
	}
	
	public void insert_after(int data,int index)
	{
		Node n=head;
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.prev=null;
		if(sizeOf()<index)
		{
			System.out.println("Linked list ");
		}
		else
		{
			if(index==sizeOf())
			{
				insert_last(data);
			}
			else
			{
				for(int i=1;i<=index;i++)
				{
					n=n.next;	
				}
				node.next=n.next;
				n.next.prev=node;
				node.prev=n;
				n.next=node;
				size++;
			}
		}
	}
	
	public void insert_before(int data, int index) 
	{
		Node n=head;
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.prev=null;
		if(sizeOf()<index)
		{
			System.out.println("Linked list UnderFlow");
		}
		else
		{
			for(int i=1;i<index+1;i++)
			{
				n=n.next;	
			}
			node.next=n;
			node.prev=n.prev;
			n.prev.next=node;
			n.prev=node;
			size++;
		}
		
	}
	
	public void delete_begin()
	{
		if(head==null)
		{
			System.out.println("No Elements To Delete In Linked List");
		}
		else if(head.next==null)
		{
			head=null;
			size--;
		}
		else
		{
			Node n= head;
			n.next.prev=null;
			head=n.next;
			size--;
		}
	}
	
	public void delete_end()
	{
		if(head==null)
		{
			System.out.println("No Elements To Delete In Linked List");
		}
		else if(head.next==null)
		{
			head=null;
			size--;
		}
		else
		{
			Node n= head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.prev.next=null;
			size--;
		}
	}
	
	public void delete_after(int index)
	{
		
			if(head==null)
			{
				System.out.println("No Elements To Delete In Linked List");
			}
			else if(head.next==null)
			{
				System.out.println("Linked List has:-"+index+"Elements");
			}
			else
			{
				Node n=head;
				for(int i=0;i<index;i++)
				{
					n=n.next;
				}
				if(n.next==null)
				{
					System.out.println("Linked List has "+index+" elements So cannot delete");
				}
				else if(n.next.next==null)
				{
					n.next=null;
					size--;
				}
				else
				{
					n.next.next.prev=n;
					n.next=n.next.next;
					size--;
				}
					
			}
		}
	
	public void delete_before(int index)
	{
		Node n=head;
		if(index>sizeOf())
		{
			System.out.println("Less Elements in LinkedList");
		}
		else if(index==1)
		{
			n.next.prev=null;
			head=n.next;
			size--;
		}
		else if(head==null)
		{
			System.out.println("No Elements In LinkedList");
		}
		else if(head.next==null || index==0)
		{
			System.out.println("No -1 Index");
		}
		else
		{
			for(int i=0;i<index;i++)
			{
				n=n.next;
			}
			n.prev=n.prev.prev;
			n.prev.prev.next=n;
			size--;
		}
	}
	
	public void show()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println("Size:--"+sizeOf());
	}
	public int sizeOf()
	{
		return size;	
	}


	

}