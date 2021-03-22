package estudo.de.p3.de.abella.ex1;

public class Conta {
	
	private String titular;
	private int agencia;
	private int conta;
	private double saldo;
	private double limite;
	private double valorLimite;
	
	public void sacar(double valor) {
		if(valor < saldo) {
			saldo = (saldo - valor);
			System.out.printf("Saque de", valor,"efetuado com sucesso");
			System.out.printf("Seu saldo atual é de", saldo);
		}
	}
	
	public void depositar(double valor) {
		if(valor != 0) {
			
			saldo = (saldo + valor);
			System.out.printf("depósito no valor de", valor,"efetuado com sucesso");
			System.out.printf("Seu saldo atual é de", saldo);
		}
		
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	public Conta(String titular, int agencia, int conta) {
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	
	}
	


}
