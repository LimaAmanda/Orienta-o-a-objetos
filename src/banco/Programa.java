package banco;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta amanda; // Amanda é um novo objeto da classe conta
		amanda = new Conta(); // Instanciando o objeto amanda 
		amanda.nome = "Amanda Lima";
		amanda.saldo = 2020120; // Atribuindo 2020120 ao atributo saldo.
		amanda.limite = 2000;
		amanda.numConta = 001;
		amanda.saque(100); // Atribuindo 100 como valor parâmetro do método saque, que esta na classe conta.
		amanda.deposito(8000); // Atribuindo 800 como valor parâmetro do mêtodo déposito que está na classe conta.
		
		
		
		System.out.println(amanda.nome + " " + amanda.saldo); // Cálculo para verificar o saldo para saber o saldo do objeto Amanda.
		
		
		
		

	}

}
