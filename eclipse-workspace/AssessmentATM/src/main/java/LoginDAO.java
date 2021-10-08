
public class LoginDAO {

	public int arr[][] = { {123456789, 1234, 800, 200}, {987654321, 4321, 1230, 150}};
	public int atmamount = 1500;
	public int atmarr[] = {10, 30, 30, 20};
	public int cred(member m)
	{
		int flag=0;
		int accno = Integer.parseInt(m.getAccno());
		int pin = Integer.parseInt(m.getPin());
		
		for(int i =0; i<2;i++)
		{
			if( accno == arr[i][0] && pin == arr[i][1])
			{
				flag =1;
			}
				
		}
		return flag;
	}
}
