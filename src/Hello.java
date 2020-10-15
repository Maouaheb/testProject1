import java.util.Scanner;

public class Hello {
public static void main(String[] args) {
	Scanner scanner1=new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a=scanner1.nextInt();
    Scanner scanner2=new Scanner(System.in);
    System.out.print("Enter second number: ");
    int b=scanner2.nextInt();
    Calcul calcul=new Calcul();
    System.out.println("résultat d'addition de "+a+" + "+b+" = "+calcul.Sum(a, b));
    System.out.println("résultat multiplication de "+a+" * "+b+" = "+calcul.multiplication(a, b));

    
	
}
}
