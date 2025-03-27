package Queue;
import java.util.LinkedList;
import java.util.Queue;

	public class QueueHP {
		
	   private int Senhas;
	    public Queue<String> Pacientes;
	
	 
	    public QueueHP() {
	    	Pacientes = new LinkedList<>();
	        Senhas = 1;
	    }
	 
	    public void imprimirSenha(String nome) {
	       String senha = Senhas + " :" + nome;
	       Pacientes.add(senha);
	        Senhas++;
	       System.out.println("Paciente " + senha);
	    }
	
	    public void Proximo() {
	        if (Pacientes.isEmpty()) {
	            System.out.println("Não há mais pacientes na fila.");
	        }
	        else {
	            String pacienteChamado = Pacientes.poll();
	            System.out.println("Chamando: " + pacienteChamado);
	        }
	    }
	 
	    public void exibirFila() {
	        if (Pacientes.isEmpty()) {
	            System.out.println("Fila vazia.");
	        } 
	        else {
	            System.out.println("Fila atual: " + Pacientes);
	        }
	    }
	   
	    public void exibirPrimeiro() {
	        if (Pacientes.isEmpty()) {
	            System.out.println("Não há mais pacientes na fila.");
	        }
	        else {
	            System.out.println("Primeiro na fila: " + Pacientes.peek());
	        }
	    }
	    
	    public void exibirQuantidade() {
	        System.out.println("Total de pacientes na fila: " + Pacientes.size());
	    }
}
