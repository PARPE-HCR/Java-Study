package 과제;

import java.util.Scanner;

public class java_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int[] NumArray = null;
		NumArray = new int[5];
		int max = NumArray[0];
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("양수 5개를 입력하세요");
		
		for(i=0;i<NumArray.length;i++)
		{
			NumArray[i] = scanner.nextInt();
			if(max < NumArray[i])
			{
				max = NumArray[i];
			}
		}
		System.out.printf("가장 큰 수는 %d 입니다",max);
		
		
		
		
	}

}
