package JavaOO;

public class testMetodos {
	public static void main(String[] args) {
		
		Cuenta miCuenta =new Cuenta();
		miCuenta.setSaldo(300); 
		miCuenta.depositar(200);
		miCuenta.retirar(0);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaJimena= new Cuenta();
		cuentaJimena.depositar(1000);		
		System.out.println(cuentaJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
		
		boolean puedeTransferir=cuentaJimena.transferir(200, miCuenta);
		if(puedeTransferir) {
			System.out.println("trasnferencia exitosa");
		}
		
		else {
			System.out.println("Error en la Transferancia");
		}
		
		
		System.out.println(miCuenta.getSaldo());
		System.out.println(cuentaJimena.getSaldo());
	}

}
