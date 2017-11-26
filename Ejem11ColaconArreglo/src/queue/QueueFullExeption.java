package queue;

public class QueueFullExeption extends Exception {
	public QueueFullExeption(){}
	public QueueFullExeption(String causa){
		super (causa);
		
	}
	public QueueFullExeption(Throwable causa){
		super (causa);
	}
}
