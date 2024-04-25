package DSLMiniProj;

public class Landmarks 
{
	String name;
	String area;
	Seater2 s2;
	Seater4 s4;
	Seater6 s6;
	Landmarks(String name, String area, Seater2 s2, Seater4 s4, Seater6 s6 ) 
	{
		this.s2=s2;
		this.s4=s4; 
		this.s6=s6;
		this.name = name;
		this.area = area;
	}
	
	/*
	 * 0=Wakad
	 * 1=Esquare
	 * 2=Wipro
	 * 3=IBM
	 * 4=Infosys
	 * 5=TCS
	 * numbering convention follows as seater number, landmark number
	 * */
	
}