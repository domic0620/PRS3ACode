package app;

import comm.TCPConnection;

public class Application implements TCPConnection.OnProcessListener {

	private TCPConnection connection;

	public Application() {
		connection = new TCPConnection();
		connection.setListener(this);
	}

	public void init() {
		connection.start();
	}

	@Override
	public void onFinish() {
		System.out.println("El proceso finalizó");
	}

	@Override
	public void onUpdate(int value) {
		System.out.println("El contador va por: " + value);
	}

}
