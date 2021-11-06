package com.bridgelabz.linkedlist;

import com.bridgelabz.linkedlist.*;

public class Stack {
	/*
	 * To create stack operations
	 */

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

	/*
	 * used to peak
	 */
	public INode peak() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.printNodes();
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public boolean isEmpty() {
		return myLinkedList.head == null;
	}

}