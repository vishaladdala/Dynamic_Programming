import java.util.Scanner;

public class recursive_staircase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int steps = sc.nextInt();
		
		
		System.out.print(countSteps(steps));
		
		

	}
	
	
	public static int countSteps(int n) {
		if(n < 0) {
			return 0;	
		}
		
		if(n == 0) {
			return 1;
		}
		
		int[] paths = new int[n+1];
		paths[0] = 0;
		paths[1] = 1;
		paths[2] = 2;
		
		
		for(int i = 3; i<=n; i++)
		{
			paths[i] = paths[i-1] + paths[i-2] + paths[i-3];
		}
		
		return paths[n];
		
		
	}

}
