import java.util.concurrent.atomic.AtomicInteger;

public class IncrementerStarter {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object mutex = new Object();
		SharedObject s = new SharedObject();
		Incrementer i1 = new Incrementer(s,0,mutex);
		Incrementer i2 = new Incrementer(s,1,mutex);
		Thread tI1 = new Thread(i1);
		Thread tI2 = new Thread(i2);
		tI1.start();
		tI2.start();
	}

}
