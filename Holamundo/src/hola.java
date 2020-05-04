
public class hola {

	public static void main(String[] args) {
int j=0;
bucleprincipal: while (j<5) {
	for (int i = 0; i < 6; i++) {
		if (i ==4) { 
			break bucleprincipal;
		}
		System.out.println(i);
	}
	System.out.println("Después del bucle 1");
	j++;
}
System.out.println("Después del bucle 2");
	}

}
