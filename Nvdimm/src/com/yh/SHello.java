package com.yh;

public class SHello {
	
	public native void sayHello();
	
	static {
		System.out.println(System.getProperty("java.library.path"));
		System.load("/root/Desktop/eclipse_workspace/Haha/src/MyJni.so");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SHello s = new SHello();
		
		s.sayHello();

	}

}
