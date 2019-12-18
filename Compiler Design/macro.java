import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class macro
{
public static void main(String args[])throws IOException
{
int MDTC=1;
int MNTC=1;
int index=1;
int macroindex=0;
String arg[]=new String[10];
String mname[]=new String[10];
String MNT [][]=new String[10][10];
String MDT [][]=new String[10][10];
String output =new Scanner(new File("File1.txt")).useDelimiter("\\Z").next();
String result[]=output.split("\n");
String result1[]=output.split("[,\\s\\?]");
for(int k=0;k<result1.length;k++)
{
if(result1[k].equals("MACRO")||result1[k].equals("macro"))
{
mname[macroindex]=result1[k+2];
macroindex++;
}
}
System.out.println("\nMACRO NAME TABLE\n—————————————–");
System.out.println("VALUE OF MDTC\tMNTC\tNAME");
for(int k=0;k<macroindex;k++)
{
System.out.println("\t"+MDTC+"\t"+MNTC+"\t"+mname[k]);
MNTC=MNTC+1;
}

}
}
