package JavaOO;

public class Cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}

		return false;

	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}

		return false;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double nuevoSaldo) {
		this.saldo = nuevoSaldo;
	}

	public void setAgencia(int nuevaAgencia) {
		if (nuevaAgencia > 0) {
			this.agencia = nuevaAgencia;
		} else {
			System.out.println("no estan perimitdos valores negativos");
		}

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int nuevoNumero) {
		if (nuevoNumero > 0) {
			this.numero = nuevoNumero;
		} else {
			System.out.println("no estan perimitdos valores negativos");
		}

	}
public void setTitular(Cliente titular) {
	this.titular = titular;
}
	public Cliente getTitular() {
		return titular;
	}
}
