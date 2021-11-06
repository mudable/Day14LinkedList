package com.bridgelabz.linkedlist1;

import com.bridgelabz.linkedlist.*;
import junit.framework.Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestStackTest {
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNotes() {
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		Stack myStack = new Stack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}

	@Test
	public void given3NumbersInStackWhenPopedTillEmptyShouldReturnTrue() {
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		Stack myStack = new Stack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		while (!myStack.isEmpty() == true) {
			myStack.peak();
			myStack.pop();
		}
		Assert.assertTrue(myStack.isEmpty());
	}

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveFirstAddedNotes() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		Stack myStack = new Stack();
		myStack.enqueu(myFirstNode);
		myStack.enqueu(mySecondNode);
		myStack.enqueu(myThirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myFirstNode, peak);
	}

	@Test
	public void given3NumbersWhenAddedToStackAndDequeuedShouldReturnTheSecondElement() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		Stack myStack = new Stack();
		myStack.enqueu(myFirstNode);
		myStack.enqueu(mySecondNode);
		myStack.enqueu(myThirdNode);
		myStack.printStack();
		INode pop = myStack.dequeue();
		myStack.printStack();
		Assert.assertEquals(mySecondNode, pop);
	}
}