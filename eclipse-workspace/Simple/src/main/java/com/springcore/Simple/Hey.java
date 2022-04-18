package com.springcore.Simple;

public class Hey {
private String hello;

public Hey() {
	super();
	// TODO Auto-generated constructor stub
}

public Hey(String hello) {
	super();
	this.hello = hello;
}

public String getHello() {
	return hello;
}

public void setHello(String hello) {
	this.hello = hello;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Hey [hello=" + hello + " ] ";
}
public void init()
{
	System.out.println("inside init method");
}
public void destroy() {
	System.out.println("inside destroy method");

	
}
}
