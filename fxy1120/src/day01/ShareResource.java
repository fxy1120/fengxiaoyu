package day01;

public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty=true;
	synchronized public void push(String name,String gender){
		try{
			while(!isEmpty){
				this.wait();
			}
				this.name=name;
				Thread.sleep(10);
				this.gender=gender;
				isEmpty=false;
				this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	synchronized public void pop(){
		try{
			while(isEmpty){
				this.wait();
			}
			Thread.sleep(10);
			System.out.println(this.name+","+this.gender);
			isEmpty=true;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
