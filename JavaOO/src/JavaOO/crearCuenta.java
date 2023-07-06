package JavaOO;
public class crearCuenta {
	public static void main(String[] args) {
		Cuenta PrimeraCuenta= new Cuenta();
		PrimeraCuenta.setSaldo(1000);
		System.out.println("el saldo de la cuenta es de.........");
		System.out.println( PrimeraCuenta.getSaldo());
		PrimeraCuenta.setSaldo(100); 
        System.out.println(PrimeraCuenta.getSaldo());

		Cuenta segundaCuenta=new Cuenta();
		segundaCuenta.setSaldo( 54642.154);
		
		System.out.println("primera cuenta tiene " + PrimeraCuenta.getSaldo());
        System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

		/*System.out.println("El saldo de la ceunta es ....");
		System.out.println(segundaCuenta.saldo);
		if(PrimeraCuenta==segundaCuenta) {
			System.out.println("son el mismo Objeto "+PrimeraCuenta);
		}
		else {
			System.out.println("no son el mismo objeto"+PrimeraCuenta +"es diferente de "+segundaCuenta);
		}*/
		 Cuenta cuenta = new Cuenta();
		 Cliente cliente=new Cliente();
		 cliente.setNombre("Mareling");
		 cliente.setDocuemnto("564-201102-0001M");
		 cuenta.setTitular(cliente);
		 System.out.println(cliente.getNombre());
		 System.out.println(cuenta.getTitular().getNombre());
	}

}
