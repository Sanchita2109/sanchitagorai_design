package calc;
import java.io.*;
public class calculator {

	public static void main(String[] args)throws IOException
	{
		int a,b,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 integer nos : ");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter 1 for addition \n 2 for substraction \n 3 for multiplication \n 4 for division : ");
		n=Integer.parseInt(br.readLine());
		func ob = new func();
		if(n==1)
		{
			ob.add(a,b);
			ob.display();
		}
		if(n==2)
		{
			ob.sub(a,b);
			ob.display();
		}
		if(n==3)
		{
			ob.mul(a,b);
			ob.display();
		}
		if(n==4)
		{
			ob.div(a,b);
			ob.display();
		}

	}

}
