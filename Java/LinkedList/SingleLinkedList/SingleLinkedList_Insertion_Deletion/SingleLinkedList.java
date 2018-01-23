package SingleLinkedList_Insertion_Deletion;

public class SingleLinkedList 
{
	int size=-1;
	Node head;//head Node
	
	public void insert_end(int data)//function to add values at the end of the linkedlist
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
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
		}
		size++;
	}
	
    public void insert_start(int data)//function to add values at the first of the linkedlist
	{
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
		size++;
	}
	
	public void insert_before(int index,int data)//function to add values at before of any location of the linkedlist
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		Node n=head;
		if(index==0 || head==null || index<0)
		{
			System.out.println("Invalid Location To Add Element");
		}
		else if(index>sizeOf())
		{
			System.out.println("Index is Not Present");
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
			size++;
		}
		
	}

	public void insert_after(int index,int data)
	{
		Node node=new Node();;
		node.data=data;
		if(head==null || index<0)
		{
			System.out.println("Invalid Index");
		}
		else if(index>sizeOf())
		{
			System.out.println("Index Is Not Present");
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
				n.next=node;
				node.next=null;
			}
			else
			{
				node.next=n.next;
				n.next=node;
			}
			size++;
		}
	}

	public void delete_start()
	{
		if(head==null)
		{
			System.out.println("Linked List UnderFlow");
		}
		else
		{
			head=head.next;
			size--;
		}
	}
	public void delete_end()
	{
		if(head==null)
		{
			System.out.println("Linked List Is Underflow");
		}
		else if(head.next==null)
		{
			head=null;
			size--;
		}
		else
		{
			Node n=head;
			while(n.next.next!=null)
			{
				n=n.next;
			}
			n.next=null;
			size--;
		}
		
	}
	public void delete_after(int index)
	{
			if(index<=0 ||head==null)
			{
				System.out.println("Linked List UnderFlow");
			}
			else if(index>=sizeOf())
			{
				System.out.println("Invalid Index");
			}
			else
			{
				Node n=head;
				for(int i=0;i<index;i++)
				{
					n=n.next;
				}
				n.next=n.next.next;
	            size--;	
			}
	}
	public void delete_before(int index)
	{
		if(index<=0 ||head==null)
		{
			System.out.println("Linked List UnderFlow");
		}
		else if(index>sizeOf())
		{
			System.out.println("Invalid Index");
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-2;i++)
			{
				n=n.next;
			}
			n.next=n.next.next;
            size--;	
		}	
	}
	public void delete_at(int index)//function to delete at any location
	{
		Node n=head;
		Node n1=null;
		if(index==0)
		{
			head=n.next;
			size--;
		}
		else if(index>sizeOf() || index<0)
		{
			System.out.println("Invalid Index");
		}
		else
		{
			for(int i=0;i<index-1;i++){
				n=n.next;			
			}
			n1=n.next;
			n.next=n1.next;
			size--;
		}
		
		
		
	}
	public int sizeOf()
	{
		return size;
	}
	
	public void show()//function to print linkedlist
	{
		Node node=head;
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;	
		}
		System.out.println("Size:- "+sizeOf());
	}
 
}
