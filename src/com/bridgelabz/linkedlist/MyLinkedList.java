package com.bridgelabz.linkedlist;

public class MyLinkedList<T> {
	public INode tail;
	public INode head;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		return this.head = head.getNext();
	}

	public <T> INode popLast() {
		INode tempNode = this.head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode findNode(MyNode myNode) {
		INode tempNode = this.head;
		INode temp = null;
		while (!tempNode.getNext().equals(tail)) {

			if (tempNode.getNext() == myNode) {
				System.out.println("Found node with key : " + myNode.getKey());
				temp = myNode;
			}
			return temp;
		}
		return temp;
	}

	/*
	 * Delete is used to delete specified node
	 */
	public INode delete(INode node) {
		INode tempNode = this.head;
		INode temp = null;
		while (!tempNode.getNext().equals(node)) {
			tempNode = tempNode.getNext();
			temp = tempNode;
		}
		temp.setNext(node.getNext());
		return temp.getNext();
	}

	public void size(INode node) {
		INode tempNode = this.head;
		int size = 1;
		while (!tempNode.getNext().equals(node)) {
			tempNode = tempNode.getNext();
			size = size + 1;
		}
		System.out.println(size + 1);

	}

	public INode searchAndInsert(MyNode myNode, INode keyToInsert) {
		INode tempNode = this.head;
		INode temp = null;
		INode tempInsert = keyToInsert;
		while (!tempNode.getNext().equals(tail)) {
			if (tempNode.getNext() == myNode) {
				System.out.println("Found node with key : " + myNode.getKey());
				temp = tempNode;
				break;
			}
		}
		keyToInsert.setNext(temp.getNext().getNext());
		temp.getNext().setNext(tempInsert);
		tempInsert.setKey((keyToInsert.getKey()));
		temp.getNext().setNext(keyToInsert);
		return tempInsert;

	}

	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}