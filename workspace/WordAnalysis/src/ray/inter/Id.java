package ray.inter;

import ray.lexure.Word;
import ray.symbols.Type;

public class Id extends Expr{
	public int offset;		//��Ե�ַ
	public Id(Word id,Type p,int b)
	{
		super(id,p);
		offset = b;
	}
}
