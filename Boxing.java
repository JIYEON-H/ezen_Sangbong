package work01;

import java.util.Scanner;
public class Boxing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요. > ");
		
		double weight = sc.nextDouble();
		
		if(0<weight) {
			if(weight<=50.80) {
				System.out.println("Flyweight");
			}else if(weight<=61.23) {
				System.out.println("Lightweight");
			}else if(weight<=72.57) {
				System.out.println("Middleweight");
			}else if(weight<=88.45) {
				System.out.println("Cruiserweight");
			}else if(88.45<weight) {
				System.out.println("Heavyweight");
			}
		}
		sc.close();
	}
	
}
