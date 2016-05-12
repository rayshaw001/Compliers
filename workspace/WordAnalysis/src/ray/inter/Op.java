package ray.inter;

import ray.lexure.Token;
import ray.symbols.Type;

public class Op extends Expr{
	public Op(Token tok,Type p)
	{
		super(tok,p);
	}
	
	public Expr reduce()
	{
		Expr x= gen();
		Temp t = new Temp(type);
		emit(t.toString() + " = " + x.toString());
		return t;
	}
}
