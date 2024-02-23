package DataStructures;

public class Tree {
	Nod1 root;
	//BINARY SEARCH TREE 
	public void insert(int data) {
		Nod1 a=new Nod1();
		a.data=data;
		if(root==null) {
			root=a;
		}
		else {
			Nod1 temp=root;
			Nod1 temp1=null;;
			while(temp!=null) {
				if(temp.data<a.data) {
				temp1=temp;
				temp=temp.right;
				}
				else {
					temp1=temp;
					temp=temp.left;
				}
			}
			if(temp1.data<a.data) {
				temp1.right=a;
			}
			else {
				temp1.left=a;
			}
			//System.out.print("Inserted");
		}
	}
	public void preorder(Nod1 root ) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	public void postorder(Nod1 root ) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public void inorder(Nod1 root ) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	public void search(Nod1 root,int key) {
		Nod1 temp=root;
		if(root==null){
			return;
		}
		if(key==root.data) {
			System.out.println("found");
			return;
		}
		
		search(root.left,key);
		search(root.right,key);
	
	
	}
	public int  height(Nod1 root) {
		if(root==null) {
			return 0;
		}
		int leftheight=0,rightheight=0,h=0;
		if(root.left!=null) {
		leftheight=height(root.left);
		}
		if(root.right!=null) {
			rightheight=height(root.right);
		}
		if(leftheight>rightheight) {
			 h=leftheight+1;
		}
		else {
			 h=rightheight+1;
		}
		return h;
	}
	public void LCA(Nod1 root,int left,int right) {
		if(left<=root.data && right>=root.data) {
			System.out.println(root.data);
			return ;
		}
		if(left>root.data && right>root.data) {
			LCA(root.right,left,right);
		}
		if(left<root.data && right<root.data) {
			LCA(root.left,left,right);
		}
		
	}
	public Nod1  delete(Nod1 root,int key) {
		if(root==null) {
			return root;
		}
		if(key<root.data) {
			root.left=delete(root.left,key);
		}
		else if(key>root.data) {
			root.right=delete(root.right,key);
		}
		else {
			if(root.right==null) {
				return root.left;
			}
			else if(root.left==null) {
				return root.right;
			}
			else {
			root.data=minVal(root.right);
			root.right=delete(root.right,root.data);
			}
		}
		return root;
	}
	public int minVal(Nod1 root) {
		int min=root.data;
		while(root!=null) {
			min=root.left.data;
			root=root.left;
		}
		return min;
	}
}
