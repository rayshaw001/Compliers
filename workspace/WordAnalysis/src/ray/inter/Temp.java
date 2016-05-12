package ray.inter;

import ray.lexure.Word;
import ray.symbols.Type;

public class Temp extends Expr{
	static int count = 0;
	int number = 0;
	
	public Temp(Type p)
	{
		super(Word.temp,p);
		number = ++count;
	}
	public String toString()
	{
		return "t" + number;
	}
}
