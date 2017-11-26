package queue;

public interface IQueue<T> {
	public void enQueue(T value) throws QueueFullExeption;
	public void deQueue() throws QueueEmptyException;
	public boolean isEmpty();
	public boolean isFull();
	public void front() throws QueueEmptyException;
	public T search(T value) throws QueueEmptyException;
	public void clear();
	public int size();
	public boolean frontOf(T value, int priority) throws QueueFullExeption;
}
