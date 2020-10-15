
public class Calcul {
public int Sum(int a, int b) {
return a+b;	
}
public int multiplication(int a, int b) {
	return a*b;
}
public int puissance(int a, int b) {
	int puissance=1;
	for(int i=1;i<=b;i++){
	puissance=a*a;
	}
	return puissance;
}
}
