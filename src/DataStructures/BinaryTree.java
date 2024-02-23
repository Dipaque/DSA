package DataStructures;

import java.util.*;

public class BinaryTree {
	Nod1 root;
	Scanner  sc=new Scanner(System.in);
	public Nod1 insert(int data) {
		Nod1 a=new Nod1();
		if(data==-1) {
			return null;
		}
		a.data=data;
		if(root==null) {
			root=a;
		}
		int l=sc.nextInt();
		a.left=insert(l);
		int r=sc.nextInt();
		a.right=insert(r);
		return a;
	}
	public void levelOrderInsert(int data) {
		Nod1 a=new Nod1();
		if(data==-1) {
			return;
		}
		a.data=data;
		if(root==null) {
			root=a;
			return;
		}
		Queue<Nod1>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Nod1 n=q.poll();
			if(n.left==null) {
				
				n.left=a;
				return;
			}
			else {
				q.add(n.left);
			}
			if(n.right==null) {
				n.right=a;
				return;
			}
			else {
				q.add(n.right);
			}
		}
	}
	public void levelOrderTraversal() {
		if(root==null)
			return ;
		Queue<Nod1>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Nod1 node=q.poll();
			System.out.print(node.data+" ");
			if(node.left!=null)
				q.add(node.left);
			if(node.right!=null)
				q.add(node.right);
		}
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
	public int diameter(Nod1 root) {
		int leftheight=0,rightheight=0;
		leftheight=height(root.left);
		rightheight=height(root.right);
		int maxHeight=leftheight+rightheight;
		return maxHeight+1;
				
	}
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }
    void printCurrentLevel(Nod1 root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
	public Nod1 preorder(Nod1 root ) {
		if(root==null) {
			return null;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		return root;
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
	public Nod1 delete(Nod1 root,int data){
	    Nod1 temp=root;
	    if(root==null) {
	        return null;
	    }
	    if(data==root.data) {
	    	if(root.left!=null) {
	    		root.data=root.left.data;
	    		root.left=delete(root.left,root.data);
	    	}
	    	else if(root.right!=null) {
	    		root.data=root.right.data;
	    		root.right=delete(root.right,root.data);
	    	}
	    	else {
	        if(root.left==null){
	        return root.right;
	        }
	        else if(root.right==null){
	          return root.left;
	        
	        }
	    	}
	    }
	  root.left=delete(root.left,data);
	    root.right=delete(root.right,data);
	    return root;
	}
}
