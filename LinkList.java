import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class LinkList {
	public static  Node insert(Node head,int data)
	{
  	//Complete this method
		Node newNode=new Node(data);
		Node currentNode=head;
		if(head == null)
		{
			head=newNode;	
		}
		else
		{
			while(currentNode.next!=null)
			{
				currentNode = currentNode.next;
			}
			currentNode.next=newNode;
		}
		return head;
	}
    public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
              //display(head);
          }
          display(head);

   }
}
/*
public static Node insert(Node head,int data)
{
//Complete this method
    if(head == null)
    {
        head = new Node(data);
    }
    else
    {
        Node currentNode = head;
        while(currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(data);
    }
    return head;
}*/