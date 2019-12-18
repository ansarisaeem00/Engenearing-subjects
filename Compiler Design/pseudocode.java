import java.io.*; 
import java.lang.*; 

class Mot
{ 
    //static int n=0,LOC=0,locn=0,stmt=0,i;
    public static void main(String args[]) throws Exception 
		{  
			String s; 
			String program[]=new String[100];
			String label[]=new String[100];
			String mneop[]=new String[10];
			// int[] LOC=new int[15]; 
			int N=0,n=0,j,i,k=0;
			
			System.out.println("Assembly lang program :\n--------------------------");
			
			//code for file  opening and printing the program  line by line 
			FileReader fr=new FileReader("program1.asm"); 
			BufferedReader br=new BufferedReader(fr); 
			while((s = br.readLine()) != null)
			{
				program[N++]=s;
				System.out.println(s); 
			    //System.out.println(N);
			} 
			
			fr.close(); // closing the file
			
			FileReader labels=new FileReader("label1.txt"); 
			BufferedReader buff=new BufferedReader(labels); 
			
			while((s=buff.readLine())!= null)
			{
				label[n++]=s;
			   System.out.println();
			} 
			
			labels.close();
			
		System.out.println("\n\n Machine Opcode Table :--\n \nMnemonic opcode | LENGTH(in bytes) | Instruction Format");
		System.out.println("-------------------------------------------------------------------------");	
			for(i=0;i<N;i++)
		    {
			//char codearr[]=new char[15];
			//codearr=program[i].toCharArray();
			for(j=0;j<n;j++)
			{       
				if(program[i].startsWith("END"))
						return;
						
				if(program[i].startsWith("USING"))
					break;	
					
				if(program[i].startsWith(label[j]))
					break;
									   
		        else if(j==n-1)
		        {
					for(String l:program[i].split("\\s"))
					{
						mneop[k++]=l;
						System.out.println(l+"\t\t| 4 \t\t   | 001");
						break; 
					}
					break;
				}
		}
    }
}
}

/*ST 2,TEMP
FOUR DC F '4'
FIVE DC F '5'
TEMP DS '1'F
END






 Machine Opcode Table :--
 
Mnemonic opcode | LENGTH(in bytes) | Instruction Format
-------------------------------------------------------------------------
L		| 4 		   | 001
A		| 4 		   | 001
ST		| 4 		   | 001


------------------
(program exited with code: 0)
Press return to continue

*/
