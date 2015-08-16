package org.askdn.ds.LinkedList;

public class DSLinkedList_insert_at_specific {

	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 

	Node InsertNth(Node head, int data, int position) {
	   //Create a new Node
	    Node newNode = new Node();
	    newNode.data = data;
	    newNode.next = null;
	    
	    Node current = head;
	    if(head == null)
	    {
	       head = newNode;
	       return head;
	    }
	    else if(position == 0)
	    {
	       newNode.next = head;
	       head = newNode;
	        return head;
	    } else
	      {
	    for(int i=1;i<position;i++)
	    {
	        current = current.next;    
	    }
	    newNode.next = current.next;
	    current.next = newNode;
	     return head;
	    
	    }
	     // is head updated ? 
	}
}
