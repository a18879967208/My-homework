package 作业;

import java.util.Scanner;

public class 求平均数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
			int number=in.nextInt();
			int sum=0;
			int conme=0;
				while ( number!=-1 )
				{
					
					sum=sum+number;
					conme=conme+1;
					number =in.nextInt();
				}
			     if 	( conme>0 )
			     {
			    	 System.out.println("平均数="+(double)sum/conme);    	 
			     }
           
	}

}
