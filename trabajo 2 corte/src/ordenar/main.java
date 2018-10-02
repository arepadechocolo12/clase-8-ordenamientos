package ordenar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[]= {5,3,4,2};
		OrdenamientoBurbuja o = new OrdenamientoBurbuja();
		o.OrdenamientoBurbuja(arreglo);
		
		for (int i=0 ; i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
	
	}

}
