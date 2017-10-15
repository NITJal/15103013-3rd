import java.util.*;

public class cs{



	public static void main(String[] args) {

		Scanner src=new Scanner(System.in);

		String str=new String();

		System.out.println("Enter a string:");

		str=src.nextLine();

		String s1=new String();

	    int l=0;

	    while(p!=str.length())

		{

			s1+=str.substring(1, str.length());

			s1+=str.substring(0,1);

			str=s1;

			s1="";

			System.out.println(str);

			l++;

		}

	}



}