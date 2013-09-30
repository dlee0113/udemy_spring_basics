package com.caveofprogramming.spring.test;

public class Logger {

	private ConsoleOutput conOut;

	public void setConOut(ConsoleOutput conOut) {
		this.conOut = conOut;
	}
	
	public void writeConsole(String text) {
		conOut.write(text);
	}
}
