import java.util.Scanner;
public class BasicHRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        double basic= sc.nextInt();
        char grade= sc.next().charAt(0);
            
        double hra = (basic*20/100.0);
        double da  = (basic*50/100.0);
        double pf =  (basic*11/100.0);
        double allow;
        
        if(grade == 'A'){
            allow=1700.0;
        } else if(grade == 'B'){
            allow=1500.0;
        }else{
            allow=1300.0;
        }
        
       double  totalSalary=  basic + hra + da + allow - pf;
        System.out.print(Math.round(totalSalary));
        

	}

}