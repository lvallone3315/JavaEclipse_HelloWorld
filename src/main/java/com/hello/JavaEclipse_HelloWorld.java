//   Initial Java program to trial CI/CD pipeline

package com.hello;

public class JavaEclipse_HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(echo("Hello World in Java on Eclipse IDE!"));
		System.out.println(echo("  2nd print!"));
        System.out.println(echo("----------\n\n\n\nBelow the line\n\n-------"));
	}
	
	// adding a method for junit testing
	public static String echo(String message) {
		return(message);
	}

}
