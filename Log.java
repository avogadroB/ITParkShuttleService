package DSLMiniProj;

public class Log {
	Vehicle v;
	int pickup;
	int drop;
	Log next;

	Log(Vehicle v,int pickup,int drop)
	{
		this.v=v;
		this.pickup=pickup;
		this.drop=drop;
		this.next=null;
	}
}
