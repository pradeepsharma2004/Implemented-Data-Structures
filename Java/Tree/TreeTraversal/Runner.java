package TreeTraversal;

public class Runner {

	public static void main(String[] args) 
	{
		Traversal_stack_recursion tsr=new Traversal_stack_recursion();

		Node node=new Node(15);
		node.left=new Node(20);
		node.right=new Node(25);
		node.left.left=new Node(30);
		node.left.right=new Node(35);
		node.left.left.left=new Node(40);
		node.left.left.right=new Node(45);
		
		System.out.println("traverse_inorder_recursion:-");
		tsr.traverse_inorder_recursion(node);
		System.out.println();
		System.out.println("traverse_inorder_stack:-");
		tsr.traverse_inorder_Stack(node);
		
		System.out.println("traverse_preorder_recursion:-");
		tsr.traverse_preorder_recursion(node);
		System.out.println();
		System.out.println("traverse_preorder_stack:-");
		tsr.traverse_preorder_Stack(node);
		
		System.out.println("traverse_postorder_recursion:-");
		tsr.traverse_postorder_recursion(node);
		System.out.println();
		System.out.println("traverse_postorder_stack:-");
		tsr.traverse_postorder_Stack(node);

	}

}
