package Queue;
public class MainHospital {
	
	public static void main(String[] args) {
		 QueueHP hospital = new QueueHP();

	      hospital.imprimirSenha("Jorge");
	       hospital.imprimirSenha("Roberto");
	      hospital.imprimirSenha("Natália");

	        while (!hospital.Pacientes.isEmpty()) {
	            hospital.exibirFila();
	             hospital.exibirPrimeiro();
	             hospital.exibirQuantidade();
	            hospital.Proximo();
	            
	            System.out.println("\n");
	        }

	        System.out.println("Não há mais pacientes.");
		

	}

}
