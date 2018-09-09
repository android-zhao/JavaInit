package com.zhf;


public class TheSonofTestB extends TestB {

	private  static String tag = "TheSonofTestB";
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
	
	public TheSonofTestB(){
		System.out.println(initVar("constructor"));
	}
	static int initVar(String str){
		
		System.out.println(tag +" "+str);
	
		return 2019;
	}
}

