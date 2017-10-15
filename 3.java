

import java.util.*;



public class cwf {



	public static void main(String[] args) {



		Scanner src=new Scanner(System.in);

		System.out.println("Enter a string: ");

		String str=src.nextLine();

		String[] word=str.split(" ");

		final Treemap<String, Integer> mm=new Treemap1<String, Integer>();

		for(String w:word)

		{

			if(!mm.containsKey(w))

				mm.put(w,1);

			else

				mm.put(w,mm.get(w)+1);

		}

		Comparator <String> comp=new Comparator<String> ()

		{

			public int compare(String a,String b) {

				if(mm.get(b)==(mm.get(a)) || mm.get(b)>(mm.get(a)))

     					return 1;

				else

						return -1;

			    }

		};

		Treemap<String, Integer> ma=new Treemap1<String, Integer>(comp);

		ma.putAll(mm); 

		for(mm.Entry<String,Integer> entry: ma.entrySet())

		{

			System.out.println(entry.getKey()+" : "+entry.getValue());

		}

	}



}