
public class Incrementer implements Runnable {
	
	public volatile SharedObject count;
	private int id;
	public Object mutex;
	
	public Incrementer(SharedObject c,int i,Object m){
		this.count = c;
		this.id = i;
		this.mutex = m;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			synchronized(this.mutex){
				if(this.count.counter < 10000){
					this.count.counter++;
					System.out.println("#" + this.id + " incremented count to " + this.count.counter);
				} else {
					break;
				}
			}	
		}
	}

}
