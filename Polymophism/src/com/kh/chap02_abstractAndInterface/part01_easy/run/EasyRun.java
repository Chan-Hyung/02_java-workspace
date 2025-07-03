package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {
		// 추상클래스로 객체 생성 불가 (이유 : 미완성 클래스이기 때문에)
		//Sports s = new Sports(); // 객체 생성이 안될뿐이지 레퍼런스로는 사용 가능
		
		Sports s = new BasketBall();
		Sports[] arr = new Sports[2];
		
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		// 향상된 for each문
		for(Sports a : arr) {
			a.rule();
		}
		
		
		/*
		 * 동적바인딩 : 컴파일 시점에서는 정적바인딩으로 현재 레퍼런스의 자료형 클래스에 있는 메소드를 가리킴.
		 * 			 run시점 (실행시점)에서는 동적바인딩으로 각각의 자식 클래스에 오버라이딩 된 메소드가 있을 경우 그거 실행
		 */
		
		
		/*
		 * - 추상메소드
		 * 1) 미완성된 메소드로 몸통부({})가 구현되어 있지 않는 메소드
		 * 
		 * - 추상클래스
		 * 1)미완성된 클래스
		 * 2) 일반필드 + 일반메소드 [+추상메소드]
		 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야함
		 * 
		 * 즉, 추상메소드가 굳이 없어도 추상클래스로 만들 수 있다.
		 *  사용 하는 곳
		 *  > 개념적 : "단지 이 클래스가 미완성된 클래스다" 라는걸 부여할 목적
		 *  > 프로그래밍적 : 객체 생성이 불가하게끔 하고자 할 때
		 *  
		 *  
		 *  - 추상메소드가 존재하는 추상클래스를 쓰는 이유
		 *  1) 부모클래스에서 추상메소드가 존재할 경우
		 *     자식클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게 됨
		 *     
		 *     => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 메소드를 구현했으면 할 때
		 *  
		 *  
		 */
		
		
		
	}

}
