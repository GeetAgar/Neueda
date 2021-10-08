
public class WithdrawlDAO {
	
	public int check(member m, String am)
	{
		int flag =0;
		int accno = Integer.parseInt(m.getAccno());
		LoginDAO l = new LoginDAO();
		int ab=0;
		
		for (int i =0; i<2; i++)
		{
			if(accno == l.arr[i][0])
			{
				ab = l.arr[i][2]-l.arr[i][3];
			}
		}
		int a = Integer.parseInt(am);
		if(a <= ab && a<=l.atmamount)
		{
			flag = 1;
		}	
		return flag;
	}

	public int[] withdraw(member m, String am)
	{
		LoginDAO l = new LoginDAO();
		int amount = Integer.parseInt(am);
		int accno = Integer.parseInt(m.getAccno());
		for(int i =0; i< 2; i++)
		{
			if(accno == l.arr[i][0])
			{
			l.arr[i][3] = l.arr[i][3] - amount;
			}
		}
		int[] euro = {50, 20, 10, 5 };
		int[] count = { 0, 0, 0, 0 };
		l.atmamount = l.atmamount - amount;

		for (int i = 0; i < euro.length; i++) {
			if (euro[i] < amount || euro[i] == amount)
			{
				int c = amount / euro[i];
				if(c <= l.atmarr[i])
				{
				count[i] = amount / euro[i];
				amount = amount % euro[i];
				}
				else
				{
					count[i] = l.atmarr[i];
					amount = amount - ((euro[i]) * (count[i]));
					l.atmarr[i] =0;
				}
			}
		}
		for(int i =0; i< euro.length; i++)
		{
			l.atmarr[i] = l.atmarr[i] - count[i];
		}
		
		return count;
	}		
}
