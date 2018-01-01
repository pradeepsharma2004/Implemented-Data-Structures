public class DynamicStack 
{
	int capacity=2;
	int top=0;
	int stack[]=new int[capacity];//Dynamic Stack Using Array
	public void push(int data)throws Exception
	{
		if(size()==capacity)
		{
			expand();
		}
			stack[top]=data;	
			top=top+1;
	}
	private void expand() 
	{
		int length=size();
		int newStack[]=new int[capacity*2];
		for(int i=0;i<=length-1;i++)
		{
			newStack[i]=stack[i];
		}
		stack=newStack;
		capacity*=2;
	}
	public int pop()
	{
		int data=0;
		if(top==0)
		{
			System.out.println("Stack Is Empty");
		}
		else
		{
			top-=1;
			data=stack[top];
			stack[top]=0;
			shrink();
		}
		return data;
		
		
		
	}
	private void shrink() {
		int length=size();
		if(length<=0.25*capacity){
			capacity/=2;
			int newStack[]=new int[capacity];
			for(int i=0;i<length;i++)
			{
				newStack[i]=stack[i];
			}
			stack=newStack;
			
		}
	}
	public int peek()
	{
		int data=0;
		if(top==0)
		{
			System.out.println("Empty Stack");		
		}
		else{
			data =stack[top-1];
		}
		
		return data;		
	}
	public int size()
	{
		return top;
	}
	public String isEmpty(){
		if(top==0){
			return "Stack is Empty";
		}
		else{
			return "Stack is Not Empty";	
		}
		
	}
	public void show(){
		for (int i :stack) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
