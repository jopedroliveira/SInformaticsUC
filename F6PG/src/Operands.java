
import java.io.Serializable;

public class Operands implements Serializable
{
	private String a;

	
	public Operands(String a)
	{
		this.a = a;
	
	}

	
	
	public String toString(){
		String temp = "";
		temp = temp + a;
		return temp;
	}
}
