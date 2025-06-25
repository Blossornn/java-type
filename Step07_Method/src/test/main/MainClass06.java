package test.main;

import test.mypac.ZZangGu;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * ZZangGu 객체를 3개 생성해서 배열에 담은 다음 반복문 돌면서 
		 * 배열에 담긴 ZZangGu 객체의 dance() 메소드를 모두 호출 해보세요
		 * */
		ZZangGu zg1 = new ZZangGu();
		ZZangGu zg2 = new ZZangGu();
		ZZangGu zg3 = new ZZangGu();
		ZZangGu[] zg = {zg1,zg2,zg3};
		
		for(int i=0; i<zg.length; i++) {
			zg[i].dance();
		}
		System.out.println("-------------");
		for(ZZangGu tmp : zg) {
			tmp.dance();
		}
	}
}
