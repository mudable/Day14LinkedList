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
		MyNode<Integer> myForthNode = new MyNode(40);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode node = myLinkedList.searchAndInsert(mySecondNode, myForthNode);
		myLinkedList.printNodes();
		Assert.assertEquals(node, myForthNode);
	}
}