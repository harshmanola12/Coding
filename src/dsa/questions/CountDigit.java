package dsa.questions;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountDigit {
	public static void main(String[] args) {

//		try (Scanner sc = new Scanner(System.in)) {
//			int number = sc.nextInt();
//			int h =countDigit(number);
//			System.out.println("Digit  "+h);
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		finally{
//			System.exit(0);
//			System.gc();
//		}
//		System.exit(0);
//		System.out.println("Hello");
		sumMapValue();
	}

	private static int countDigit(int n) {
		int i = 0;
		while (n > 0) {
			n = n / 10;
			i++;
		}
		return i;
	}
	private static void sumMapValue() {
		HashMap<Integer,Integer> hp = new HashMap();
		hp.put(1,78);
		hp.put(2,77);
		hp.put(1,87);
		hp.put(2,67);
		hp.put(3,76);
		System.out.println(hp);
//		Set<Entry<Integer, Integer>> g = hp.entrySet();
//		int index =0;
//		for(Entry<Integer, Integer> h :g) {
//			int k = h.getKey();
//			int v = h.getValue();
//			
//			System.out.println(k);
//			System.out.println(v);
//		}
		
		
	}
}
