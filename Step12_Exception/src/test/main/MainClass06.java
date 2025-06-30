package test.main;

import test.mypac.myUtil;

public class MainClass06 {
	public static void main(String[] args) {
		myUtil.draw();
		try {
			myUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
