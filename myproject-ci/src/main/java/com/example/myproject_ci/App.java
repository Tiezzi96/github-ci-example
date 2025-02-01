package com.example.myproject_ci;

/**
 * Hello world!
 *
 */
public class App {

	public String sayHello(String name) {
		if (name == null) {
			return "Hello";
		} else {
			return "Hello " + name;
		}
	}

	public String sayHello() {
		// TODO Auto-generated method stub
		return sayHello(null);
	}
}
