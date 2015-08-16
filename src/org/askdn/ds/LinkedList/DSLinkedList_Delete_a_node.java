package org.askdn.ds.LinkedList;

public class DSLinkedList_Delete_a_node {

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

	Node Delete(Node head, int position)
	{
	    Node current = head;
	    if(head == null)
	        return null;
	    if(position == 0)
	    {
	      head = head.next;
	      return head;
	    }
	    else {
	        for(int i =1; i<position; i++)
	        {
	            current = current.next;
	        }
	        current.next = current.next.next;
	        return head;
	        
	    }
	    
	}
}
