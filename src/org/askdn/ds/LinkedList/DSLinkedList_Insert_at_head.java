package org.askdn.ds.LinkedList;

public class DSLinkedList_Insert_at_head {

	/*
	  Insert Node at the beginning of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	// This is a "method-only" submission. 
	// You only need to complete this method. 

	Node Insert(Node head,int x) {
	    Node newNode = new Node();
	    newNode.data = x;
	    newNode.next = null;
	    
	    if(head == null)
	      {
	        head = newNode;
	    }
	    else
	     {
	       
	        newNode.next = head;
	        head = newNode;
	    }
	    return head;
	    
	}

}
