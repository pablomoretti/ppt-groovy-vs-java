package com.example.singleton;

public class JavaSingleton {

	private static final class SingletonHolder {
		static final JavaSingleton singleton = new JavaSingleton();
	}

	private JavaSingleton() {
	}

	public static JavaSingleton getInstance() {
		return SingletonHolder.singleton;
	}

}
