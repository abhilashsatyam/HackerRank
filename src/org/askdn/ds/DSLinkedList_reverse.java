package org.askdn.ds;

import java.util.Stack;

public class DSLinkedList_reverse {
 
	void ReversePrint(Node head) {
       Stack<Integer> stack = new Stack<Integer>();
       Node current = head;
       if(current==null)
   {
    // System.out.println("The LinkedList is empty");
   }
  else
  {
   while(current!=null)
   {
     stack.push(current.data);
     current = current.next;
   }
  
  while(!stack.isEmpty())
   {
      System.out.println(stack.pop());
   }
  }
}


}
