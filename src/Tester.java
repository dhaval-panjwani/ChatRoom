/*

Author: Dhaval Panjwani

*/


import java.util.Scanner;
public class Tester {
	public static void main(String args[])
	{
		int NoU;
		Scanner sc=new Scanner(System.in);
		String fl=sc.nextLine();
		String nou[]=fl.split(" ");
		NoU=nou.length;
		User U[]=new User[NoU];
		for(int i=0;i<NoU;i++)
		{
			U[i]=new User();
			U[i].setName(nou[i]);
		}
		int c=1;
		while(c==1)
		{
			String m=sc.nextLine();
			String message[]=m.split(":");
			String user[]=message[0].split(" ");
			if(message.length==1)
			{	
				if(!message[0].equals("end"))
				{
						for(int i=0;i<NoU;++i)
				{
				if(U[i].getName().equals(message[0]))
				{
					U[i].DisplayChat();
				}
				}
				}
				else
				{
				break;
				}
			}
			else
			{
			for(int i=0;i<NoU;++i)
			{
				if(U[i].getName().equals(user[0]))
				{
					U[i].SentMessage(message[1]+" to "+user[1], user[1]);
				}
				if(U[i].getName().equals(user[1]))
				{
					U[i].ReceivedMessage(message[1]+" from "+user[0], user[0]);
				}
			}
			}
		}
	}

}

