package ray.inter;

import ray.lexure.Token;

public class Not extends Logical{
	public Not(Token tok,Expr x2)
	{
		super(tok,x2,x2);
	}
	
	public void jumping(int t,int f)
	{
		expr2.jumping(t, f);
	}
	
	public String toString()
	{
		return op.toString() + " " +expr2.toString();
	}
	
}
