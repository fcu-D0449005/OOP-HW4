package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class NissanTiida {
	public	int i,j;
	private Scanner nissanTiida;
	public void tiida()
	{
		int i,j ;
		nissanTiida = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int console1 =  nissanTiida.nextInt();
		for(i=1;i<=console1 ;i++){
			for(j=1;j<=i;j++)
			{
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
