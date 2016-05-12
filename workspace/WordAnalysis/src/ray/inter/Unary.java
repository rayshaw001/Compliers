package ray.inter;

import ray.lexure.Token;
import ray.symbols.Type;

public class Unary extends Op{
	Expr expr;
	public Unary(Token tok,Expr x)	//处理单目减法，对！的处理见not
	{
		super(tok,null);
		expr = x;
		//Expr.type
		type = Type.max(Type.Int,expr.type);
		if(type == null) 
		{
			error("type error");
		}
	}
	
	public Expr gen()
	{
		return new Unary(op,expr.reduce());
	}
	
	public String toString()
	{
		return op.toString() + " " + expr.toString();
	}
	
}
