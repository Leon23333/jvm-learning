package com.xu.sof;

/**
 * VM Args: -Xss128k
 * @author Leon
 *
 */
public class JavaVMStackSOF {
	private int stackLength = 1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}
	
	public static void main(String[] args) throws Throwable {
		JavaVMStackSOF sof = new JavaVMStackSOF();
		try {
			sof.stackLeak();
		} catch (Throwable e) {
			System.out.println("stack length:"+sof.stackLength);
			throw e;
		}
	}
}
