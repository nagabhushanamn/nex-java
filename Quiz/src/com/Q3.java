package com;

import java.io.FileWriter;
import java.util.function.Consumer;

public class Q3 {

	public static void writeInFile(String log) {
		try {
			FileWriter out = new FileWriter("log.txt");
			out.write(log);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// function-1 : who can log in console
		Consumer<String> consoleLogger = log -> System.out.println(log);
		// function-2 : who can log in file
		Consumer<String> fileLogger = Q3::writeInFile;

		// compose function1 & function-2 ==> new-function
		Consumer<String> logger = consoleLogger.andThen(fileLogger);

		logger.accept("session started");

	}

}
