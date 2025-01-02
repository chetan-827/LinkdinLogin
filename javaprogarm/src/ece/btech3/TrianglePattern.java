package ece.btech3;

public class TrianglePattern {

	public static void main(String[] args) {
		// Right angle triangle
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) { // if we replace 'rows' instead of 'i' we get square  
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		// pyramid triangle
		int rows1 = 5;
		for (int i = 1; i <= rows1; i++) {
			// print leading spaces
			for (int j = i; j < rows1; j++) {
				System.out.print(" ");
			}
			// print stars from the current line
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Inverted right angle triangle
		
		int r=5;
		for(int i=r;i>=1;i--) {		// we can write like this also (int i = 1; i <= r; i++)
			for(int j=1;j<=i;j++) { // (int j=i; j<=r; j++)
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Diamond pattern
		int n=5;
		
		for(int i=1; i<=n;i++) {
			// print leading spaces
			for(int j=i; j<n;j++) {
				System.out.print(" ");
			}
			// print stars
			for(int k=1; k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();// move to the next line
		}
		
		// lower half of diamond
		
		for(int i=n-1;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			// print stars
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		
		
		// Hollowsquare
		
		int size=5;
		
		for(int i=1; i<=size;i++) {
			for(int j=1;j<=size; j++) {
				if(i==1|| i==size||j==1||j==size) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
