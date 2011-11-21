package com.example.singleton;

public class JavaSingelton {

	private static final class SingletonHolder {
		static final JavaSingelton singleton = new JavaSingelton();
	}

	private JavaSingelton() {
	}

	public static JavaSingelton getInstance() {
		return SingletonHolder.singleton;
	}

}
