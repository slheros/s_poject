package cn.test;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.sun.corba.se.impl.orbutil.closure.Future;

public class TestFuture {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			Thread th = Thread.currentThread();
			th.setName("Ö÷Ïß³Ì");
			System.out.println(th.getName());
		}
		
	}
	
	
	private Future futureThread1() {
		new ThreadPoolExecutor(51, 51, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
	return null;	
	}
}
