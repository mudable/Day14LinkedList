package com.bridgelabz.linkedlist;

public interface INode<T> {
	T getKey();

	public void setKey(T key);

	INode<T> getNext();

public	void setNext(INode<T> next);
}