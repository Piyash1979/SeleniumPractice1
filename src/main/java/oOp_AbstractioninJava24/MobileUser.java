package oOp_AbstractioninJava24;

public abstract class MobileUser {
	
	//its a fully abstract class, it has no abstract method

	

		void call() { 	// this is a non abstract method, it has implementation

			System.out.println("This is Call method");
		}

		//after adding Call() method,it is not a fully abstract method, it has abstract & non Abstract method

		abstract void sendMessage(); // this is a fully abstract method

	}


