package queue;

import java.lang.reflect.Array;
import java.util.Iterator;
import node.Node;

public class Queue<T extends Comparable<T>> implements Iterable<T>, IQueue<T> {
	private Node<T> sentinel = null;
	private Node<T> sentinelF = null;
	private Class<T> type = null;
	private int front = -1;
	private int back   = 0;
	private int count  = 0;	
	
	public Queue(){
		sentinel = new Node<T>();
		sentinel.setIndex(-1);
		sentinelF = new Node<T>();
		sentinel.setIndex(-1);
	}
	
	public Queue(T value){
		Node<T> tmp = new Node<T>(value);
		tmp.setIndex(0);
		sentinel.setNext(tmp);
	}
	
	@Override
	public void enQueue(T value) throws QueueFullExeption {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.out.println("Esta iena goe");
		}
		sentinel.setNext(new Node<T>(value));
		count++;
	}

	@Override
	public void deQueue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("SSS echale algo goe");
		}
		sentinel.setBack(null);
		count--;
		while(sentinel.getNext() != null) {
		sentinel = sentinel.getNext();
		}
		sentinel.setValue(null);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (sentinel.getNext()==null) {
			return true;
		}else
			return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (sentinel.getNext()!=null) {
			sentinel = sentinel.getNext();
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void front() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())throw new QueueEmptyException("sss echale algo goe");
		System.out.println(sentinel.getNext().getValue());
	}

	@Override
	public T search(T value) throws QueueEmptyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		while(sentinel.getNext() != null) {
		sentinel = sentinel.getNext();
		sentinel.getNext().setBack(null);
		count--;
		}

	}
	//ESTE NO
	@Override
	public boolean frontOf(T value, int priority) throws QueueFullExeption {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		while(sentinel.getNext() != null) {
			sentinel = sentinel.getNext();
			count++;
		}
		return count-1;
		
	}

}
