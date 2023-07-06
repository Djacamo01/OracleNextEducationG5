package JavaOO;

public class testreferencia {
	public static void main(String[] args) {
		
		Cliente Donald= new Cliente();
		Donald.setNombre( "Donald Miguel Jacamo Estrada");
		Donald.setDocuemnto("888-140104-1000V");
		Donald.setTelefono("+505 8665 8094");
		
		Cuenta cuentaDonald=new Cuenta();
		cuentaDonald.setAgencia(02);
		cuentaDonald.setNumero(2472);
		cuentaDonald.setSaldo(500);
		cuentaDonald.setTitular(Donald);
		System.out.println(cuentaDonald.getTitular().getNombre()+" "+ cuentaDonald.getTitular().getDocuemnto() + " " + cuentaDonald.getTitular().getTelefono());

		System.out.println(cuentaDonald.getAgencia()+" "+ cuentaDonald.getNumero());

		
		
	}
}
