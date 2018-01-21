package LinkedList;

public class LList 
{
	Node head;//head Node
	
	public void insertAtEnd(int data)//function to add values at the end of the linkedlist
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null){
			head=node;
			
		}
		else{
			Node n=head;
			while(n.next!=null){
				n=n.next;	
			}
			n.next=node;
		}
		
	}
	public void insertAtStart(int data)//function to add values at the first of the linkedlist
	{
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	public void insertAtAnyLocation(int index,int data)//function to add values at the any location of the linkedlist
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		Node n=head;
		if(index==0){
			insertAtStart(data);	
		}
		else{
			
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
			
		}
		node.next=n.next;
		n.next=node;
		}
	}
	public void deleteAt(int index)//function to delete at any location
	{
		Node n=head;
		Node n1=null;
		if(index==0){
			head=n.next;
		}
		else
		{
			for(int i=0;i<index-1;i++){
				n=n.next;
				
			}
			n1=n.next;
			n.next=n1.next;
			
		}
		
		
		
	}
	public void show()//function to print linkedlist
	{
		Node node=head;
		while(node.next!=null){
			System.out.println(node.data);
			node=node.next;
			
		}
		System.out.println(node.data);
	}

}
