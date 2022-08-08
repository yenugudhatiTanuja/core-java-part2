package corejavapart2;

/*interface call
{
	void callback(int param);
}
class Client implements call
{

	@Override
	public void callback(int p) {
		// TODO Auto-generated method stub
		System.out.println("call----->"+p);
	}
	
}*/
public class ExInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Call c=new Client();
        c.callback(423);
	}

}
