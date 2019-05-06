package forStarEx01;

public class Main {
	public static void main(String[] args) {
		//Q8
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Q9
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Q10
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j<i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Q11
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=1; j--) {
				if(j>i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Q12
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=0; j<9-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		//Q13
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<5-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=4; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		//Q14
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<5; j++) {
					if(j<i) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=9; j>=5; j--) {
					if(j>i+1) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		//Q15
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=5; j>=1; j--) {
					if(j>i) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=5; j<=9; j++) {
					if(j<i) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		//Q16
		for(int i=4; i>=0; i--) {
			for(int j=0; j<9-i; j++) {
				if(j < i) System.out.print(" ");
				else System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
		//Q17
		for(int i=0; i<5; i++) {
			for(int j=0; j<9-i; j++) {
				if(j < i) System.out.print(" ");
				else System.out.print("*");
			}
		System.out.println();
		}
		System.out.println();
		//Q18		
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<9; j++) {
					if(4-i <= j && j <= 4+i) System.out.print("*");
					else System.out.print(" ");
				}  
			System.out.println();
			}
			else {
				for(int j=0; j<9; j++) {
					if(i-4 <= j && j <= 12-i) System.out.print("*");
					else System.out.print(" ");
				}
			System.out.println();
			}
		}
		System.out.println();
		//Q19		
		for(int i=0;i<9;i++) {
			if(i<5) {
				for(int j=0;j<11;j++) {
					if(5-i<=j && j<=5+i) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=0;j<11;j++) {
					if(i-3<=j && j<=13-i) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		//Q20
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0;j<11;j++) {
					if(i+1<=j && j<=9-i) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j=0;j<11;j++) {
					if(9-i<=j && j<=i+1) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
		//Q21
		for(int i=0; i<9;i++) {
			if(i<5) {
				for(int j=0;j<9;j++) {
					if(i<=j && j<=8-i) System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println();
			}
			else {
				for(int j=0; j<9; j++) {
					if(8-i<=j && j<=i)  System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
