package Week5;

public class Lab_3_10 {
	public static void main(String[] args)
	{
		double[][] scores = {{3.0, 3.1},
							{3.2, 3.3},
							{3.4, 3.5},
							{3.6, 3.7}
							};
		
		double sum = 0;
		for (int i = 0; i < scores.length; i++)
			for(int j = 0; j < scores[i].length; j++)
				sum += scores[i][j];
		
		double sum2 = 0;
	
		for (double[] k : scores)//행 타입
			for (double m : k)
				sum2 += m;
		
		System.out.printf("%.1f\n", sum/8);
		
		int row = scores.length;
		int col = scores[0].length;
		System.out.printf("4년간의 평균 학점은 %.1f 입니다", sum/(row*col));
	}
}
