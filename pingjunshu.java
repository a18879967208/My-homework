package ��ҵ;

import java.util.Scanner;

public class ��ƽ���� {

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
			    	 System.out.println("ƽ����="+(double)sum/conme);    	 
			     }
           
	}

}
