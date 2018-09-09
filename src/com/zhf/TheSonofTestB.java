package com.zhf;


public class TheSonofTestB extends TestB {

	private  static String tag = "TheSonofTestB";
	//��̬����
	private static int  staticVarA = initVar("staticVarA");
	
	//��̬�����
	static{
		initVar("static init block ");
	}
	//��ͨ����
	private  int normalA = initVar("normalA");
	
	// ��ͨ�����
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

