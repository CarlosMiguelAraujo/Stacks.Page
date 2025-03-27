package MZ;
import java.util.Stack;

public class Page {
	
		// Criando as pilhas 
		 private Stack<String> backStack;
		  private Stack<String> forwardStack;
		 private String currentPage;
		    
		    public Page() {
		    	backStack = new Stack<>(); 	
		    	forwardStack = new Stack<>();
		    	currentPage = ""; //
		    }
		    
		    public void acessarPagina(String url) {
		        if (!currentPage.isEmpty()) {
		        	backStack.push(currentPage); // Adiciona a página na pilha back "voltar"
		        }
		        currentPage = url;
		        forwardStack.clear(); //Reseta a pilha
		        exibirEstado();
		    }
		    
		    public void voltar() {
		        if (!backStack.isEmpty()) {
		        	forwardStack.push(currentPage); // Adiciona a página na pilha forward "Avançar"
		        	currentPage = backStack.pop(); // Atualiza a página
		        }
		        exibirEstado();
		    }
		    
		    public void avancar() {
		        if (!forwardStack.isEmpty()) {
		        	backStack.push(currentPage); 
		        	currentPage = forwardStack.pop();
		        }
		        exibirEstado();
		    }
		    // Exibindo os resultados
		    public void exibirEstado() {
		        System.out.println("Página atual: " + (currentPage.isEmpty() ? "Nenhuma" : currentPage));
		         System.out.println("Página anterior: " + backStack);  
		          System.out.println("Página adjacente : " + forwardStack);
		           System.out.println("\n");
		    }
		    
		    public static void main(String[] args) {
		    	Page page = new Page();
		        
		    	page.acessarPagina("milanote.com");
		         page.acessarPagina("w3Schools.com");
		        page.acessarPagina("Youtube.com");
		        
		        page.voltar();
		         page.voltar();
		        page.avancar();
		    }
   
}

	
	
	

	

	
		          
		          

 
		
		
	

