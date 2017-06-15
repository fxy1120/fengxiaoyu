package day01;

public class Producter implements Runnable{
	private ShareResource resource=null;
	public Producter(ShareResource resource){
		this.resource=resource;
	}
	public void run(){
		for(int i=0;i<50;i++){
			if(i%2==0){
				resource.push("郭德纲","周立波");
			}else{
				resource.push("凤姐","春哥");
			}
		}
	}

}
