package com.bridgelabz.linkedlist;

import com.bridgelabz.linkedlist.*;

public class Stack {
	public MyLinkedList myLinkedList = new MyLinkedList();

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printNodes();
	}
}
