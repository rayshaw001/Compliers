package ray.inter;

import ray.lexure.Word;
import ray.symbols.Type;

public class Id extends Expr{
	public int offset;		//œ‡∂‘µÿ÷∑
	public Id(Word id,Type p,int b)
	{
		super(id,p);
		offset = b;
	}
}
