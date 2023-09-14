import java.util.Scanner;

public class Contador extends ParametrosInvalidosException {
	public static void main(String[] args) {
		try {

		
       
		for(int contar = 12 ; contar <=30; contar ++) {
			
	
			

		Scanner contScanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = contScanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = contScanner.nextInt();
		
		
			System.out.println("Primeiro parâmetro" + parametroUm);
			System.out.println("Segundo parâmetro" + parametroDois);
			contScanner.close();
		}
		
			
		} 
		catch (ParametrosInvalidos e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");


			// TODO: handle exception
		}
	

        
	}
}

    
		
		//try {
			//chamando o método contendo a lógica de contagem
			//contar(parametroUm, parametroDois);
		//}
        
        //catch (ImputMismatchExeception e) {
			//System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        //}
		
	//}
	//static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		//int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	//}
//}
  
