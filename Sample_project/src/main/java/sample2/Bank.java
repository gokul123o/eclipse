package sample2;

public class Bank {
	private int pin;
	void setter(int pin)
	{
		this.pin=pin;
	}
	void validate()
	{
		if(this.pin==1001)
		{
			System.out.println("valid pin");
		}
		else if(this.pin==1234)
		{
			System.out.println("valid pin");
		}
		else if(this.pin==1212)
		{
			System.out.println("valid pin");
		}
		else
		{
			System.out.println("invalid");
		}
	}
	void getter()
	{
		System.out.println(pin);
	}
	

}
