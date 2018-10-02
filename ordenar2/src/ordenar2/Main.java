package ordenar2;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[]= {5,3,4,2,11,35,13,67,89};
		inserccion o = new inserccion();
		o.inserccion(arreglo);
		
		for (int i=0 ; i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
	}

}
