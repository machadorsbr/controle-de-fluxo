public class ParametrosInvalidosException {
	public static void main(String[] args){
		try {
		int Parametro = contar ();
		System.out.println(Parametro);

		} 
		catch (ParametrosInvalidosException e) {
			System.out.println("jhjjknjb");
			// TODO: handle exception
		}
	}
		
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if((parametroUm > parametroDois));
		throw new ParametrosInvalidosException ();
		
		int contagem = parametroDois - parametroUm;

		for(int contar = 12 ; contar >=30; contar ++){
			System.out.println("parâmetro dois é menor que parametro um" + contagem + parametroDois);
			
		}
		//realizar o for para imprimir os números com base na variável contagem
	}

    
}
