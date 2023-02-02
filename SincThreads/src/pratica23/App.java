package pratica23;

public class App {

	static int contador = 0;

	static void imprime() {
		
		synchronized (App.class) {

			contador++;
			System.out.println(Thread.currentThread().getName() + ": " + contador);

		}

	}

	public static void main(String[] args) {

		ThreadAR tar = new ThreadAR();

		Thread t0 = new Thread(tar);
		Thread t1 = new Thread(tar);
		Thread t2 = new Thread(tar);
		Thread t3 = new Thread(tar);
		Thread t4 = new Thread(tar);

		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
