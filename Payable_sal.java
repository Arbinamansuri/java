import java.util.Scanner;
class Payable_sal
{
	public static void main(String arg[])	
	{
	    double gs,it,pt,pf,netSalary;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter salary");
                   gs=sc.nextDouble();
	    System.out.println("HRA %");
                   it=sc.nextDouble();
	    System.out.println("special allowance %");
                   pt=sc.nextDouble();
	     System.out.println("PF deducion %");
	pf=sc.nextDouble();
	     pf=pf*(gs/100);
	     it=it*(gs/100);
	     pt=pt*(gs/100);
	     netSalary=gs-it-pt-pf;
	     System.out.println("Net Salary is="+netSalary);
                   }
}
public class emp

{

public static void main(string args[]){

scanner sc = new scanner(system.in);

system.out.println("Enter the name of employee = ");

string name = in.next();

system.out.println("Enter the basic salary = ");

int sal = in.nextint();

double  hra, sa, pf;

hra = 50*sal;

sa = 0.10*sal;

pf = 17*sal;

system.out.println("Gross salary"+gp);

system.out.println("Net salary"+np);

}
}
