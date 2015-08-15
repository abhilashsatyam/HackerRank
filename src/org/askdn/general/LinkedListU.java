package org.askdn.general;

// ASKDN Project - Ashish Krishnan Developer Networks
// This is an Implementation of LinkedList without using Generics
// You can Freely Download and use
class Node {
    // reference to the next node in the chain,
    // or null if there isn't one.
    Node next;
    // data carried by this node.
    // could be of any type you need.
    Object data;

    // Node constructor
    public Node(Object dataValue) {
        this.next = null;
        this.data = dataValue;
    }

    // another Node constructor if we want to
    // specify the node to point to.
    public Node(Object dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }

    // these methods should be self-explanatory
    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }
}

public class LinkedListU
{
	Node head;
	static int listcount=0;
	public LinkedListU() {
		// TODO Auto-generated constructor stub
	
		head = new Node(null);
	}
	
	void add(Object data){
		Node currentNode = head;
		Node newNode = new Node(data);
		if(listcount == 0)
		{
			currentNode.setNext(newNode);
			listcount++;
		}
		else
		{
			while(currentNode.next != null)
			{
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
			listcount++;
		}
		
	}
	
	void add(Object data, int position){
		Node currentNode = head;
		Node newNode = new Node(data);
		
			for(int i = 1; i<position && currentNode.getNext()!= null; i++)
			{
				currentNode = currentNode.getNext();
				}
			newNode = currentNode.getNext();
			newNode.next = currentNode.next;
			listcount++;
		
	}
	Object get(int index)
	{
		Node currentNode = head;
		for(int i =1 ; i<=index; i++)
		{
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
		
	}
	void reverse(Node n)
	{
		Node temp;
		if(n.getNext() == null)
		{
			head=n;
			return;
		}
		reverse(n.getNext());
		temp = n.getNext();
		temp.next = n;
		n.next=null;
		
	}
    int nthNode(Node head, int k)
	{
		if(head == null)
		{
			return 0;
		}
		int i = nthNode(head.next, k)+1;
		if(i == k)
		{
			System.out.println(head.data);
		}
		
		return 1;
		
	}
	void remove(int index)
	{
		Node currentNode = head;
		for(int i=1; i<index; i++)
		{
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(currentNode.getNext().next);
		listcount--;
	}
	
	public static void main(String[] args) {
		
		
		LinkedListU object = new LinkedListU();
	
		object.add(5);
		object.add(6);
		object.add(7);
		object.add(8);
		object.add(9);
		
		object.nthNode(object.head, 1);
		
		//object.reverse(object.head);
		
		
		System.out.print("[*]["+listcount+"]");
		for(int i = 0; i<=listcount;i++)
		{
			System.out.print(" -> "+object.get(i));
		}
	}
	
}