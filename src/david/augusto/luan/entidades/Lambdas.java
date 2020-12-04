package david.augusto.luan.entidades;

public class Lambdas {

	public static void main(String[] args) {

		// Funções Lambda com Threads
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// Thread e um processo que trabalha como um subsistema,
				// sendo uma forma de um processo se autodividir em duas ou mais tarefas.
				System.out.println("Thread com classer interna!");
			}
		};
		new Thread(runnable).start();
	}
}