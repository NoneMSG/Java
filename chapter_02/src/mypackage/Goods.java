package mypackage;

public class Goods {
	public static int countOfGoods;
	
	public String name; // public 제한 없음
	protected int price;  // protected 같은 패키지+ 자식
	int countStock; //같은 패키지
	private int countSold; //한 클래스 내부에서만
	
	public Goods(){
		Goods.countOfGoods++; //클래스 필드 내에서는 클래스 이름 생략 가능
		//countOfGoods++;
	}
	
	public void setCountSold(int countSold){
		this.countSold = countSold;
	}
}

//package mypackage;
//
//public class Goods {
//	
//	
//	public String name; // public 제한 없음
//	protected int price;  // protected 같은 패키지+ 자식
//	int countStock; //같은 패키지
//	private int countSold; //한 클래스 내부에서만
//	
//	public void setCountSold(int countSold){
//		this.countSold = countSold;
//	}
//}


//package chapter_02;
//
//public class Goods {
//	String name;
//	int price; 
//	int countStock;
//	int countSold;
//}
