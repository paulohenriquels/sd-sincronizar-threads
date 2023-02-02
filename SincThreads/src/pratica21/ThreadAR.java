package pratica21;

public class ThreadAR implements Runnable{
	
	@Override
	public void run() {
		
		int v = (int) (Math.random() * 50);
		
		synchronized (this) {
			
			App.contador++;
			System.out.println(Thread.currentThread().getName() + ": " + App.contador);
			
		}
		
		System.out.println(Thread.currentThread().getName() + " escreve v: " + v);
	}

}
