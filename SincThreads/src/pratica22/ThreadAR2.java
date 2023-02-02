package pratica22;

public class ThreadAR2 implements Runnable {
	
	@Override
	public void run() {

		synchronized (new Object()) {

			App.contador++;
			System.out.println(Thread.currentThread().getName() + ": " + App.contador);

		}

		synchronized (new Object()) {

			App.contador--;
			System.out.println(Thread.currentThread().getName() + ": " + App.contador);

		}

	}

}
