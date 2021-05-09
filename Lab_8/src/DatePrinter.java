import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable {
	public void printDate (String currentThread) {

		for (int counter = 0; counter < 10; counter++) {

			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println(currentThread + "-> Date Printer " + formatter.format(date));  
		}
		
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		printDate(currentThread.getName());		
	}

}
