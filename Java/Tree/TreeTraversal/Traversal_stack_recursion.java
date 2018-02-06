package TreeTraversal;

import java.util.Stack;

public class Traversal_stack_recursion 
{
	
	public void traverse_inorder_recursion(Node root)//implement inorder traversal using recursion
	{
		if(root==null)
		{
			return;
		}
		traverse_inorder_recursion(root.left);
		System.out.print(root.data+" ");
		traverse_inorder_recursion(root.right);	
	}
	
	public void traverse_inorder_Stack(Node root)//implement inorder traversal using stack
	{
		Stack<Node> s=new Stack<Node>();
		Node curr=root;
		if(root==null)
		{
			return;
		}
		while(curr!=null)
		{
			s.push(curr);
			curr=curr.left;
		}
		while(s.isEmpty()==false)
		{
			curr=s.pop();
			System.out.print(curr.data+" ");
			if(curr.right!=null)
			{
				curr=curr.right;
				while(curr!=null)
				{
					s.push(curr);
					curr=curr.left;
				}
			}
		}
	System.out.println();
	}
	
	public void traverse_preorder_recursion(Node root)//implement preorder traversal using recursion
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		traverse_preorder_recursion(root.left);
		traverse_preorder_recursion(root.right);	
	}
	
	public void traverse_preorder_Stack(Node root)//implement preorder traversal using stack
	{
		Node curr=root;
		Stack<Node> s=new Stack<Node>();
		if(root==null)
		{
			return;
		}
		s.push(curr);
		while(s.isEmpty()==false)
		{
			curr=s.pop();
			System.out.print(curr.data+" ");
			if(curr.right!=null)
			{
				s.push(curr.right);
			}
			if(curr.left!=null)
			{
				s.push(curr.left);
			}
		}
		System.out.println();	
	}
	
	public void traverse_postorder_recursion(Node root)//implement postorder traversal using recursion
	{
		if(root== null)
		{
			return;
		}
		traverse_postorder_recursion(root.left);
		traverse_postorder_recursion(root.right);
		System.out.print(root.data+" ");
	}
	
	public void traverse_postorder_Stack(Node root)//implement postorder traversal using stack
	{
		Node curr=root;
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		if(root==null)
		{
			return;
		}
		s1.push(curr);
		while(s1.isEmpty()==false)
		{
			curr=s1.pop();
			s2.push(curr);
			if(curr.left!=null)
			{
				s1.push(curr.left);
			}
			if(curr.right!=null)
			{
				s1.push(curr.right);
			}	
		}
		while(!s2.isEmpty())
		{
			Node node=s2.pop();
			System.out.print(node.data+" ");
		}
	}
	
	
	

}
