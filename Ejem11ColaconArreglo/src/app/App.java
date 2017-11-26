package app;


import queue.Queue;
import node.Node;

public class App {
	
	public static void main(String[] args) {
	Queue<String> names = new Queue<String>();
	try{
		//----------Añadir----------
		names.enQueue("Tu cola");
		names.enQueue("Tu mama");
		names.enQueue("Tu papa");
		//names.enQueue("Tu perro");
		//names.enQueue("Tu decendencia");
		
		
		//----------Imprimir----------
		names.front();
		
		
		//----------Borrar----------
		//names.deQueue();
		
		//names.clear();
		
		
		//----------Tamaño----------
		System.out.println(names.size());
	} catch (Exception e){
		e.printStackTrace();
		}
	}
}
