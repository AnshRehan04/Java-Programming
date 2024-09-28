// class myThread extends Thread{
//     int[] arr={2,4,6,8};
// public void run(){
//     for(int i=0;i<4;i++){
//         arr[i]=arr[i]*2;
//     }

//     for(int i=0;i<4;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// }


// public class Basics{
//     public static void main(String[] args) {
//         Thread t1=new Thread();
//         t1.currentThread();
//     }
// }




// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class
public class Multithread {
	public static void main(String[] args)
	{
		int n = 2; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
		}
	}
}

