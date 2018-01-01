public class Runner
 {

	public static void main(String[] args) throws Exception
	{
		DynamicStack ds=new DynamicStack();
		ds.push(10);
		ds.push(11);
		ds.show();
		ds.push(12);
		ds.show();
		ds.push(13);
		ds.show();
		ds.push(14);
		ds.show();
		ds.pop();
		ds.show();
		ds.pop();
		ds.show();
		ds.pop();
		ds.show();
		ds.pop();
		ds.show();
	}

}
