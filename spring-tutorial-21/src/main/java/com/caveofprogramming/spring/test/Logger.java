package com.caveofprogramming.spring.test;

public class Logger {
	private FileHandler fileHandler;
	
	public Logger(FileHandler fileHandler) {
		this.fileHandler = fileHandler;
	}

	public void setFileHanlder(FileHandler fileHandler) {
		this.fileHandler = fileHandler;
	}
	
	public void getFileHandlerName() {
		fileHandler.getName();
	}
}
