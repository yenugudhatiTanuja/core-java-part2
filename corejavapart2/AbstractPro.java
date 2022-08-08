package corejavapart2;
abstract class Myclass
{
	abstract void calculate(double x);
}
class Square extends Myclass
{

	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("square is "+(x*x));
	}
	
}
class Squareroot extends Myclass
{

	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("square root is "+(Math.sqrt(x)));
	}
	
}
public class AbstractPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Square d=new Square();
        d.calculate(5);
        Squareroot f=new Squareroot();
        f.calculate(5);
     //  Myclass b=new Myclass();
     //  b.calculate(3);
        Myclass b;
        b=d;
        d.calculate(8);
	}

}
