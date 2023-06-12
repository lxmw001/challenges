public class PascalPiramid {
	/*
	
	https://en.wikipedia.org/wiki/Pascal%27s_triangle
	
	
	Pascal's triangle
			1
		   1 1
		  1 2 1 // 2
		 1 3 3 1
		1 4 6 4 1
	   1 5 10 10 5 1 // 5
	 1 6 15 20 15 6 1
	1 7 21 35 35 21 7 1
	 
	
	*/
	
	public static int[]  PascalPiramid(int n) {
		int[] piramid = new int[n + 1];
		piramid[0] = 1;
		if(n > 0 ) {
		    int[] previous = PascalPiramid(n-1);
		    piramid[n] = 1;
		    
		    for(int i = 0; i < n - 1; i++) {
		        piramid[i+1] = previous[i] + previous[i + 1];
		    }
		}
		
		return piramid;
	}
	
	
	public static void main(String[] args) {
		
		int[] result = PascalPiramid(2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] +  " ");
		}
		
		
		result = PascalPiramid(5);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] +  " ");
		}
	}
}