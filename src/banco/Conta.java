package banco;

public class Conta {
	// Atributos
	
	int numConta;
	String nome;
	double saldo;
	double limite;
	
	//Criando o método
	
	boolean saque(double valor) { // Verificação na regra boolean 
		this.saldo = this.saldo -= valor;{
			if(valor > this.saldo) { // se o valor do saque for maior que o saldo considerando apenas o valor sem o déposito, então retorna a mensagem "limite indisponivel
				System.out.println("Limite indisponivel.");
				return true;
			}
			else {
				  this.saldo = this.saldo - valor;
				  System.out.println("Você tem limite para saque.");
				  return true;
			   }
		   }
		}
				void deposito(double valor) { // executa o método déposito, somando o déposito com o saldo e retorna ( isso após subtrair o saque no else).  
					this.saldo = this.saldo += valor;
	 }
	}


