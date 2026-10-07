package 과제;

public class Java_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] myCh = {'+' ,'-','*','/'};
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<(i+1)*2;j++)
			{
				System.out.print(myCh[i]);
			}
			System.out.println("");
		}
	}

}
