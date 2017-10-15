import java.util.*;

class rs{

   public static void main(string args[])

   {      

          System.out.println("Enter the string\n");

          Scanner src=new Scanner(System.in);

         string str=src.nextLine();

         string[] word=str.split("\\s");

         for(int i=0;i<word.length();i++)

      {

           string s1=new string(" ");

           int n=word[i].length();

           for(int j=n-1;j>-1;j--)

            {

               s1+=str.charAt(j);

            }

             System.out.print(s1);

     }

    }

}