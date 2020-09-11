package exercicio1;

public class Conta{
	String Cliente;
	int nrConta;
	double Saldo;
	
	String getCliente() {
		return Cliente;
	};
	void setCliente(String nomecliente) {
		this.Cliente = nomecliente ;
	};
	int getNrConta() {
		return nrConta;
	};
	double getSaldo() {
		return Saldo;
	};
	
	void sacar(double valor) {
		Saldo = (Saldo - valor);
		
	};
	void debitar(double valor) {
		Saldo = (Saldo - valor);
	};
	double temSaldo() {
		return Saldo;
	};
	void depositar(double valor) {
		Saldo = (Saldo + valor);
	};
			
	
	void transferir() {
		//não consegui fazer
	};
	
	void abrirConta() {
		//não consegui fazer
	};
	
}
