package corejavapart2;
class ReadVal
{
	int x;
	ReadVal(int x)
	{
		this.x=x;
	}
	/*ReadVal(int i)
	{
		x=i;
	}*/
	
}
public class ConPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ReadVal t1=new ReadVal(10);
     ReadVal t2=new ReadVal(20);
     System.out.println(t1.x+ " and "+t2.x);
	}

}
