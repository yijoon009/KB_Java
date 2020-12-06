package sec05_exam01_state;

public class ThreadStateEx {

	public static void main(String[] args) {

			StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
			statePrintThread.start();
			
			
	}

}
