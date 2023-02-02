package pratica2;

public class ThreadAR implements Runnable{
	
	@Override
	public synchronized void run() {
		
		App.contador++;
		System.out.println(Thread.currentThread().getName() + ": " + App.contador);
		
	}

}
