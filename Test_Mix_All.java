import java.util.*;
public class Test_Mix_All {

	public static void main(String[] args) 
	{
		int num=0;
		String str=null,str1=null;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for value ");		
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the id,name,address ");
		
		for(int i=0;i<n;i++)
		{
			num = Integer.parseInt(sc.nextLine());
			str = sc.nextLine();
			str1 = sc.nextLine();
			ABC abc = new ABC();
			abc.findData(num,str,str1);
			abc.printData();
		}		
	//	ABC abc = new ABC();
//		abc.findData(num,str,str1);
//		abc.printData();
	}

}
class ABC
{
	int num2;
	String str,str2;
	void findData(int num1,String str1,String str11)
	{
		num2 = num1;
		str = str1;
		str2 = str11;
	}
	void printData()
	{
		System.out.println("ID is: "+num2+" Name is: "+str+" Address : "+str2);
	}
}
