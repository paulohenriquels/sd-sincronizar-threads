package pratica24;

public class ThreadAR implements Runnable{
	
	@Override
	public void run() {
		
		int threadCont;
		
		synchronized (this) {
			
			App.contador++;
			threadCont = App.contador * 2; 			
		
		}
		
		double prod = threadCont * 50;
		double raiz = Math.sqrt(prod);
		System.out.println(Thread.currentThread().getName() + " escreve " + raiz);
		
		for (int i = 0; i < 50; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			threadCont = (int) (threadCont + (Math.random() * 20));
			System.out.println(Thread.currentThread().getName() + ": " + threadCont);
		}
		
	}

}
