import java.util.*;
import java.io.*;
class NodeB{
    NodeB left,right;
    int data;
    NodeB(int data){
        this.data=data;
        left=right=null;
    }
}
class BinarySearchTree {
	public static int getHeight(NodeB root){
		int height=0;
		if (root == null) return height;
		return Math.max(getHeight(root.left), getHeight(root.right)+1);
		
	    }
	public static NodeB insert(NodeB root,int data){
        if(root==null){
            return new NodeB(data);
        }
        else{
            NodeB cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            NodeB root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
           int height=getHeight(root);
            System.out.println(height);
           }	

}
