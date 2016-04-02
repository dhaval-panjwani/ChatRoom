
public class User {
	private String Name;
	private static int AutoID=0;
	private int UserID;
	private int SentCount,ReceivedCount;
	private String MessageSent[]=new String[100];
	private String MessageReceived[]=new String[100];
	
	User()
	{
		SentCount=0;
		ReceivedCount=0;
		UserID=AutoID;
		++AutoID;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public void SentMessage(String m,String u)
	{
		MessageSent[SentCount]=m;
		++SentCount;
	}
	public void ReceivedMessage(String m,String u)
	{
		MessageReceived[ReceivedCount]=m;
		++ReceivedCount;
	}
	public void DisplayChat()
	{
		System.out.println("Messages received by "+Name+" are :");
		for(int i=0;i<ReceivedCount;++i)
		{
			System.out.println(MessageReceived[i]);
		}
		System.out.println("Messages sent by "+Name+" are : ");
		for(int i=0;i<SentCount;++i)
		{
			System.out.println(MessageSent[i]);
		}
	}
}
