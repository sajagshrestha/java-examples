//thread 1 class
class Thread1 extends Thread{
	//override run method
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println("good morning");
		}
	}
}
//thread 2 class
class Thread2 extends Thread{
	public void run(){
		while(true){
			try{
				Thread.sleep(2000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println("good afternoon");
		}
	}
}
//main class
class Greetings{
	public static void main(String args[]){
		//create thread
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		//start thread
		t1.start();
		t2.start();
	}
}