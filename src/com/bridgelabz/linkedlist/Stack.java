package com.bridgelabz.linkedlist;

import com.bridgelabz.linkedlist.*;

public class Stack {
	private MyLinkedList myLinkedList;

	/*
	 * Constructor
	 */
	public Stack() {
		this.myLinkedList = new MyLinkedList();
	}

	/*
	 * used to push nodes
	 */
	public void push(INode myNode) {
		myLinkedList.add(myNode);

	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printNodes();
	}

	public void enqueu(INode myNode) {
		myLinkedList.append(myNode);
	}

}
