package comm;

public class TCPConnection extends Thread{

	int contador = 0;
	
	private OnProcessListener listener;
	
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			contador++;
			listener.onUpdate(contador);
		}
		listener.onFinish();
	}
	
	public void setListener(OnProcessListener listener) {
		this.listener = listener;
	}
	
	public interface OnProcessListener{
		public void onFinish();
		public void onUpdate(int value);
	}
	
}
