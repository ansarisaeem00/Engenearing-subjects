import java.util.*;

public class leftrecurs {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String  left,right,alpha="",beta="";
		String eps="\u0395";
		eps=eps.toLowerCase();
			
		System.out.println("Enter left product");
		left = sc.next();
		
		System.out.println("Enter right product");
		right = sc.next();

		System.out.println("The productions is "+left + "->" + right);
			
		if (left.charAt(0) == right.charAt(0)) 
		{
			System.out.println("Grammar is left recursive\n\n\n");
			
			char temp[]=new char[15];
			temp=right.toCharArray(); 
			int a=0;
			
			for(int i=1;i<temp.length;i++)
			{
				if(temp[i]!='|' && a==0)
				{
					alpha+=temp[i];
				}
				else
				{
					a=1;
					if(temp[i]!='|')
					{
						beta+=temp[i];
					}
				}
			}
			System.out.println("Grammar after elimintaing the left recursion");
			
			//formula /method / step to eliminate left recursion from the grammar
			System.out.println(temp[0] + " -> " + beta+temp[0]+"'");
			System.out.println(temp[0]+"'"+ "-> " + eps+" | "+alpha+temp[0]+"'");
		}
		else
		{
			System.out.println("Grammar is not left recursion");
		}
	}
}
/*
OUTPUT :- 

Enter left product
A
Enter right product
Aa|b
The productions is A->Aa|b
Grammar is left recursive



Grammar after elimintaing the left recursion
A -> bA'
A'-> ε | aA'

*/
