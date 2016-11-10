import java.util.Scanner;
public class MinComMult {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Ingrese el primer numero");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scan.nextInt();
        
        int min = Math.min(num1, num2);
		int mcd=0;
        int mcm = 0;
      
        for (int i=1; i<=min; i++) {
            
            if (num1%i==0 && num2%i==0) {
                
                int mcd2 = i;
           
                mcm = (num1*num2)/mcd2;
            }
        }
	
		
	
		  
		
       
        System.out.println("El M.C.M. entre "+num1+" y "+num2+" es: "+mcm);
		
    }
     
}