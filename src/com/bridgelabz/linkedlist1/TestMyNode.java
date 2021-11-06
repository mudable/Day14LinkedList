package com.bridgelabz.linkedlist1;

import org.junit.jupiter.api.Test;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
import com.bridgelabz.linkedlist.MyNode;
import junit.framework.Assert;

class TestMyNode {
	@Test
	public void given3NumbersWhereLinkedListIsSearchedAndAddressIsMatchedForTheSearchedElement() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printNodes();
		INode node = myLinkedList.findNode(mySecondNode);
		Assert.assertEquals(node, mySecondNode);
	}
}