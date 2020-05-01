//package exercise11;
//
//import java.util.*;
//
//// [11-11] ������ SutdaCardŬ������ HashSet�� �����ϰ� ����ϴ� �����̴�.
//// HashSet�� �ߺ��� ī�尡 ������� �ʵ��� SutdaCard��  hashCode()�� �˸°� �������̵��Ͻÿ�.
//// [Hint] StringŬ������ hashCode()�� ����϶�. 
//
//class SutdaCard {
//	int num;
//	boolean isKwang;
//
//	SutdaCard() {
//		this(1, true);
//	}
//
//	SutdaCard(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//
//	public boolean equals(Object obj) {
//		if (obj instanceof SutdaCard) {
//			SutdaCard c = (SutdaCard) obj;
//			return num == c.num && isKwang == c.isKwang;
//		} else {
//			return false;
//		}
//	}
//
//	public String toString() {
//		return num + (isKwang ? "K" : "");
//	}
//	
//	 public int hashCode() {
//		 return Objects.hash(num, isKwang);
////		 return toString().hashCode();
//	 }
//}
//
//class Exercise11_11 {
//	public static void main(String[] args) {
//		SutdaCard c1 = new SutdaCard(3, true);
//		SutdaCard c2 = new SutdaCard(3, true);
//		SutdaCard c3 = new SutdaCard(1, true);
//		
//		HashSet set = new HashSet();
//		set.add(c1);
//		set.add(c2);
//		set.add(c3);
//		
//		System.out.println(set);
//	}
//}