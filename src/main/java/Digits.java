import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num){
		boolean a = true;
		int b = num;
		while(a){
			if(b > 0){
				digitList.add(0,b%10);
				b = b/10;
			}else{a = false;}
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
		for(int i = 0; i < digitList.size(); i++){
			if(digitList.get(i) >= digitList.get(i+1)){return(false);}
		}
		return(true);
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
