import java.util.*;

public class lo{



	public static void main(String[] args) {

	

		Scanner src=new Scanner(System.in);

		System.out.println("Enter the string : ");

		String str=src.nextLine();

		int a1[]=new int[256];

		for(int i=0;i<256;i++)

			a1[i]=0;

		for(int i=0;i<str.length();i++)

		{

			a1[str.charAt(i)]++;

		}

		for(int i=0;i<256;i++)

		{

			if(a1[i]!=0)

				System.out.println((char)i+" "+a1[i]);

		}

	}



}