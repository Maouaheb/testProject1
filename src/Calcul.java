
public class Calcul {
public int Sum(int a, int b) {
return a+b;	
}
public int multiplication(int a, int b) {
	return a*b;
}
public int puissance(int a, int b) {
	int puissance=a;
	for(int i=1;i<b;i++){
	puissance=puissance*a;
	}
	return puissance;
}
}
