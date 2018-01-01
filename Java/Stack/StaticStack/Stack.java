public class Stack
{
	int top=0;
	int stack[]=new int[10];//Fixed Size Stack Using Array 
	public void push(int data)throws Exception
	{
		if(top==10)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			stack[top]=data;	
			top=top+1;
		}
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
		}
		return data;
		
		
		
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
		
	}

}
