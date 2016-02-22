
//only method need to submit in hackers rank two linked list sorted array is provided
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
-------------------------------------------------------------------------------------- same code in python
  def MergeLists(headA, headB):
    # O(1) space complexity

    if headA == None and headB == None: return None
    if headA != None and headB == None: return headA
    if headA == None and headB != None: return headB

    if headA.data < headB.data:
        headA.next = MergeLists(headA.next, headB)
        return headA
    else:
        headB.next = MergeLists(headA, headB.next)
        return headB
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


-------------------------------------------------------------------------------------- same code in python
def FindMergeNode(headA, headB):
    curA = headA
    curB = headB
    while not curA == curB:
        if curA.next is None:
            curA = headB
        else:
            curA = curA.next
        if curB.next is None:
            curB = headA
        else:
            curB = curB.next
    return curA.data
 */

/*----------------Merge list
 * from math import factorial as f
for cas in xrange(input()):
    a, b = map(int, raw_input().strip().split())
    print f(a + b) / f(a) / f(b) % (10**9+7)*/
