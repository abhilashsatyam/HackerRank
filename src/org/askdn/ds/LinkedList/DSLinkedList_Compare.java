package org.askdn.ds.LinkedList;

public class DSLinkedList_Compare {
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	   while((headA!=null) || (headB!=null))
	   {
	       if(headA==null || headB==null)
	        return 0;
	       else
	           {
	        if(headA.data != headB.data)
	           return 0;
	       }
	       headA = headA.next;
	       headB = headB.next;
	       
	   }
	    
	    
	    
	    return 1;
	}

}
