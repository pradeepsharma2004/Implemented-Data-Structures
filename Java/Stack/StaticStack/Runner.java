public class Runner
{
	public static void main(String []args) throws Exception
	{
		Stack s= new Stack();
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.push(15);
		s.push(16);
		s.push(17);
		s.push(18);
		s.push(19);
		s.push(19);
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.push(45);
		System.out.println("Stack Size Is:"+s.size());
		s.push(78);
		System.out.println(s.isEmpty());
		s.show();
		
		
	}

}
