package banco;

public class Conta {
	// Atributos
	
	int numConta;
	String nome;
	double saldo;
	double limite;
	
	//Criando o m�todo
	
	boolean saque(double valor) { // Verifica��o na regra boolean 
		this.saldo = this.saldo -= valor;{
			if(valor > this.saldo) { // se o valor do saque for maior que o saldo considerando apenas o valor sem o d�posito, ent�o retorna a mensagem "limite indisponivel
				System.out.println("Limite indisponivel.");
				return true;
			}
			else {
				  this.saldo = this.saldo - valor;
				  System.out.println("Voc� tem limite para saque.");
				  return true;
			   }
		   }
		}
				void deposito(double valor) { // executa o m�todo d�posito, somando o d�posito com o saldo e retorna ( isso ap�s subtrair o saque no else).  
					this.saldo = this.saldo += valor;
	 }
	}


