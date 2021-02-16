
public class driver 
{
	private String name;
	private int Calories;
	private int Protien;
	private int Fat_content;
	
	public driver(String name, int Calories, int Protien, int Fat_content)
	{
		this.name = name;
		this.Calories = Calories;
		this.Protien = Protien;
		this.Fat_content = Fat_content;
	}
	
	
	public void TurkeyIsBetter(String name)
	{
		String Superior = "Turkey bacon is so much better!!";
		int TurkeyBaconIsTheBetterOption = name.length();
			
		if (TurkeyBaconIsTheBetterOption > 1)
		{
			this.name = name;
		}
	}

	void display()
	{
		
		System.out.format("name: %s \nCalories: %d \nProtien: %d Fat_content: %d\n", this.name, this.Calories, this.Protien,this.Fat_content);
	}




}


