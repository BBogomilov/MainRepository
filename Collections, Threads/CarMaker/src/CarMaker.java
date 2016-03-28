package homework_Threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CarMaker {
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		ArrayList<Runnable> list = new ArrayList<Runnable>();
		long start=System.currentTimeMillis();
		list.add(new EngineMaker());
		list.add(new FrameMaker());
		list.add(new SeatMaker());
		list.add(new SeatMaker());
		list.add(new SeatMaker());
		list.add(new SeatMaker());
		list.add(new SeatMaker());
		list.add(new TyreMaker());
		list.add(new TyreMaker());
		list.add(new TyreMaker());
		list.add(new TyreMaker());
		
		ArrayList<Future> results = new ArrayList<>();
		for(Runnable r : list) {
			results.add(service.submit(r));
		}
		for(Future result : results) {
				result.get();
			}
		System.out.println("Car made" + " for " + (System.currentTimeMillis() - start));
		
	
	}
	
	private static class TyreMaker implements Runnable {
		
		@Override
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Tyre made!");
		}
	}
	private static class SeatMaker implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Seat made!");
		}
		
	}
	private static class EngineMaker implements Runnable {

		@Override
		public void run() {
			try {
			Thread.sleep(7000);
			}
			catch(InterruptedException e){
			}
			System.out.println("Engine made!");
		}
		
	}
	private static class FrameMaker implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Frame made!");
		}
		
	}
}
