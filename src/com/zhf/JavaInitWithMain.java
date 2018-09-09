package com.zhf;



public class JavaInitWithMain {
	
	private  static String tag = "JavaInitWithMain";
	//静态变量
	private static int  staticVarA = initVar("staticVarA");
	
	//静态代码块
	static{
		initVar("static init block ");
	}
	//普通变量
	private  int normalA = initVar("normalA");
	
	// 普通代码块
	{
		initVar("normal init block");
	}
	
	private static TestB nB = new TestB();
	
	private TestB nb2 = new TestB();
	
	public JavaInitWithMain(){
		System.out.println(initVar("constructor"));
	}
	static int initVar(String str){
		
		System.out.println(tag +" "+str);
	
		return 2020;
	}
	

	public static void main(String[] args) {
		System.out.println("-------main method-------");
		System.out.println("do nothing");

	}

}

