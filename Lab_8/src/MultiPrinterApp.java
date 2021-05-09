
public class MultiPrinterApp {
	public static void main(String[] args) {
		
		Runnable printerRunnable1 = new DatePrinter();
		Runnable printerRunnable2 = new DatePrinter();
		
		Thread printerThread1 = new Thread(printerRunnable1, "printerRunnable1");
		Thread printerThread2 = new Thread(printerRunnable2, "printerRunnable2");
		
		printerThread2.start();
		printerThread1.start();
		
		}

}
