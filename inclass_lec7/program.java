import java.util.* ;
public class program {

	public static void main(String[] args) { int N ;
	System.out.print("please enter the number of tyres:");
	Scanner input=new Scanner(System.in) ;
	N=input.nextInt();
	switch(N)
	{ 
		case 2:bike obj=new bike() ;
	obj.display() ;break ;
	case 4:car obj1=new car() ;
	obj1.display() ;break ;
	default: vehicle obj3=new vehicle() ;
	obj3.display() ;
	}
	}

}