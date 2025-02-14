/*Hockey 
Bob loves playing hockey. One day, as he was watching a hockey 
match, he was writing the players' current positions on a piece of paper. 
To simplify the situation he depicted it as a string consisting of zeros and ones.
A jero corresponds to players of one team, a one corresponds to players of another team.
If there are at least 7 players of some team standing one after another, then the situation 
is considered dangerous. 
For example, the situation 0100110111111101 is dangerous and 1110111011101 is not. 
You are given the current situation. Determine whether it is dangerous or not. 

INPUT 
One Line containing a non-empty string 5 consisting of characters "0" and "1" */
class EyCode
{
public static void main(String[]args)
{
	String str = "010011111110";

	int cnt1=0;
	int cnt0= 0;
	for (int i=0;i<str.length();i++)
	{
		char ch= str.charAt(i);
		if (ch=='1')
		{
			cnt1++;

		}
		else if(ch=='0')
			{
				cnt0++;
			}
			else {
				cnt1 = 0;
				cnt0 = 0;
			}
			if (cnt1>=7 || cnt0>=7)
			{
				break;
			}
		}

		System.out.println(cnt1>=7 || cnt0>=7 ? "YES":"NO");		
	}

}
//new logic using boolean 
/*String str = "01001111110";
boolean check0 = str.contains("0000000000");
boolean check1 = str.contains("1111111111");
System.out.println(check0 || check1 ?"YES":"NO");
