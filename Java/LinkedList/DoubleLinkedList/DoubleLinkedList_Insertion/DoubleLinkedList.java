package DoubleLinkedList;

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
	
	
	public void show()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public int sizeOf()
	{
		return size;	
	}


	

}
