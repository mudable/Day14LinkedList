package com.bridgelabz.linkedlist1;

import com.bridgelabz.linkedlist.*;
import junit.framework.Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestStackTest {
	@Test
	public void test() {
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
}
