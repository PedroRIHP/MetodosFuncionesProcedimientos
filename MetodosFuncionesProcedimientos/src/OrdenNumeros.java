import java.util.Scanner;

public class OrdenNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner (System.in);
		int x = 0 ;
		int y = 0 ;
		int z = 0 ;
		System.out.println("mete los 3 numeros de un jalon");
		x = lector.nextInt();
		y = lector.nextInt();
		z = lector.nextInt();
	
		orden(x,y,z);
		System.out.println(orden(x,y,z));
		lector.close();
	}
	
	public static String orden(int x, int y, int z) {
		int a = 0 ;
		int b = 0 ;	
		int c = 0 ;		
		if (x<=y && x<=z) {
			a = x;
			if (y < z) {
				b = y;
				c = z;
			}else {
				b = z;
				c = y;
			}
		}else if (y<=z && y<=x) {
			a = y;
			if (x<z) {
				b = x;
				c = z;
			}else {
				b = z;
				c = x;
			}
		}else if (z<=x && z<=y) {
			a = z;
			if (x<y) {
				b = x;
				c = y;
			}else {
				b = y;
				c = x;
			}
		
		}
		return " de menor a mayor " + a + ", " + b +", " + c +
		       "\n de mayor a menor " + c + ", " + b +", " + a ;
	}

}
