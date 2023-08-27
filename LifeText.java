
public class LifeText extends Life {
	Keyboard kbd = Console.getInput();
	Screen scr = Console.getOutput();

	LifeText(int linhas, int colunas){
		super (linhas, colunas);
	}
	
	//
	// entrarDados
	//
	// parametros:
	//  entrada:
	//  saida:
	//
	// retorno:
	//
	public void entrarDados(){
		int x=0, y=0;
		while (x!=-1) {
			x=Keyboard.readInt("Forneca x: ");
			y=Keyboard.readInt("Forneca y: ");
			if (x != -1 && y != -1)
				getAmbiente()[x][y].setValorCelula(true); // Altera celula para Viva
		}
	}
	//
	// imprimirAmbiente
	//
	// parametros:
	//  entrada:
	//  saida:
	//
	// retorno:
	//
	void imprimirAmbiente() {
		for(int i=0; i < getAmbiente().length; i++){
			for (int j=0; j < getAmbiente()[i].length; j++){
				if(getAmbiente()[i][j].getValorCelula() == false){ // Se a celula for Morta
					scr.print("-");
				}
				else{                       // Se a celula for Viva
					scr.print("*");
				}
			}
			scr.print("\n");
		}
	}
	
	
}
