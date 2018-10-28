package com;

import java.util.function.Function;

/**
 * 
 * @author nag-training
 * 
 *         proxy / around-execute pattern
 *
 */

// OO style

class Nexwave {
	public void getJavaTraining() {
		System.out.println(" Training in Java");
	}

	public void getJsTraining() {
		System.out.println(" Training in JS");
	}
}

class Security {
	public void doSec() {
		System.out.println("Sec..");
	}
}

class Logger {
	public void doLog() {
		System.out.println("Log...");
	}
}

class NexwaveProxy extends Nexwave {

	Security sec = new Security();
	Logger logger = new Logger();

	@Override
	public void getJavaTraining() {
		sec.doSec();
		logger.doLog();
		super.getJavaTraining();
		logger.doLog();
	}

	@Override
	public void getJsTraining() {
		sec.doSec();
		logger.doLog();
		super.getJsTraining();
		logger.doLog();
	}
}

//------------------------------------------------------

//------------------------------------------------------

public class Q4 {

	public static int executeSquareSolution(int value) {

		long start = System.currentTimeMillis();
		int result = 0;
		try {
			// Perform computation
			result = value * value;
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("duration : " + duration);
		return result;
	}

	public static int executeCubeSolution(int value) {

		long start = System.currentTimeMillis();
		int result = 0;
		try {
			// Perform computation
			result = value * value * value;
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("duration : " + duration);
		return result;
	}

	// solution: FUnctional - style

	public static int executeWithDuration(Function<Integer, Integer> computation, int value) {

		long start = System.currentTimeMillis();
		int result = 0;
		try {
			// Perform computation
			result = computation.apply(value);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("duration : " + duration);
		return result;

	}

	public static void main(String[] args) {

		NexwaveProxy nexwaveProxy = new NexwaveProxy();
		nexwaveProxy.getJavaTraining();

		// ------------------------------------

		System.out.println(executeSquareSolution(2));
		System.out.println(executeCubeSolution(2));

		// ------------------------------------

		Function<Integer, Integer> sqSoln = x -> x * x;
		Function<Integer, Integer> cubeSoln = x -> x * x;
		System.out.println(executeWithDuration(sqSoln, 2));
		System.out.println(executeWithDuration(cubeSoln, 2));

		// -------------------------------------------

	}

}
