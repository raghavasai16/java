package TryCatchExceptions;

class CurrencyNotMatchException extends Exception
{
	public CurrencyNotMatchException(String msg)
	{
		super(msg);
	}
}
class CurrencyAdd{
	private String Currency;
	private int amount;
	public CurrencyAdd(String Currency,int amount)
	{
		this.Currency=Currency;
		this.amount=amount;
	}
	
	public void addAmount(CurrencyAdd that) throws CurrencyNotMatchException
	{
		if(!this.Currency.equals(that.Currency))
		{
			throw new CurrencyNotMatchException("Currency not matches"+this.Currency+" "+that.Currency);
			
		}
		else
		{
			this.amount=this.amount+that.amount;
		}
	}
	
	public String toString()
	{
		return  this.Currency + " "+this.amount;
	}
}
public class tryRunner {

	public static void main(String[] args) throws CurrencyNotMatchException {
		// TODO Auto-generated method stub
		CurrencyAdd amount1= new CurrencyAdd("USD",90);
		CurrencyAdd amount2= new CurrencyAdd("EUR",70);
		amount1.addAmount(amount2);
		System.out.println(amount1.toString());
		

	}

}
