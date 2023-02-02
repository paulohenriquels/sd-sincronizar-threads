package pratica22;

public class ThreadAR implements Runnable {

	@Override
	public void run() {

		synchronized (this) {

			App.contador++;
			System.out.println(Thread.currentThread().getName() + ": " + App.contador);

		}

		synchronized (this) {

			App.contador--;
			System.out.println(Thread.currentThread().getName() + ": " + App.contador);

		}

	}

}
