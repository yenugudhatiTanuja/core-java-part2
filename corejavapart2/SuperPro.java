package corejavapart2;
class Rectlen
{
	int l,br;
	Rectlen(int l,int br)
	{
		this.l=l;
		this.br=br;
	}
	void display()
	{
		System.out.println("length of rectangle is"+(l*br));
	}
	
}
class ParaRect extends Rectlen
{
	int l,br;
	ParaRect(int l,int br)
	{
		super(2,2);
		this.l=l;
		this.br=br;
	}
	void display()
	{
		super.display();
		System.out.println("parameter of rectangle "+(2*(super.l+br)));
	}
}
public class SuperPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ParaRect d=new ParaRect(3,4);
     d.display();
	}

}
