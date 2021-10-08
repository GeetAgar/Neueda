
public class BalanceDAO {

	public int cred(member m)
	{
		int balance= 0;
		int accno = Integer.parseInt(m.getAccno());
			LoginDAO l = new LoginDAO();
		
		for(int i =0; i<2;i++)
		{
			if( accno == l.arr[i][0])
			{
				balance = l.arr[i][2];
			}
				
		}
		return balance;
	}
	
}
