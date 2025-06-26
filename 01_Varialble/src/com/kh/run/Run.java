package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Printf;
import com.kh.variable.D_Casting;

public class Run {
	public static void main(String[] args) {
		// 클래스명 별칭 = new 클래스명();
		A_Variable a = new A_Variable();
		//a.printVariable();
		//a.declareVariable();
		B_KeyboardInput b = new B_KeyboardInput();
		//b.InputTest1();
		//b.InputTest2();
		//b.InputTest3();
		//b.InputTest4();
		//b.CharAtTest5();
		C_Printf c = new C_Printf();
		//c.printfTest();
		
		D_Casting d = new D_Casting();
		//d.autoCasting();
		//d.forcecasting();
		d.calScore();
	}
}
