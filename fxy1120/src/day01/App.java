package day01;

public class App {
public static void main(String[] args) {
	ShareResource resource=new ShareResource();
	new Thread(new Producter(resource)).start();
	new Thread(new Consumer(resource)).start();
}
}
