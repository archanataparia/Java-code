
// two linked list sorted array is provided
/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

/*Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
    if((headA==null)&&(headB==null))return null;
    if((headA!=null)&&(headB==null))return headA;
    if((headA == null)&&(headB!=null))return headB;
    if(headA.data <= headB.data)
        headA.next = MergeLists(headA.next, headB);
    else 
       {  Node temp = headB;
                headB = headB.next;
                temp.next = headA;
                headA = temp;
                headA.next = MergeLists(headA.next, headB);
       }
return headA;
}

 ---------------------------------------------------------------------------------------------------
 second program-Find Merge Point of Two Lists
 ---------------------------------------------------------------------------------------------------
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
/*
int FindMergeNode(Node headA, Node headB) {
    Node cNodeA=headA;
    Node cNodeB=headB;
    while (cNodeA!=cNodeB)
    {
        if(cNodeA.next==null)cNodeA=headB;
        else cNodeA=cNodeA.next;
        if(cNodeB.next==null)cNodeB=headA;
        else cNodeB=cNodeB.next; 
    }
    return cNodeA.data;

}

