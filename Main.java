import espacoDeEstados.*;
import estrategiasDeBusca.cega.*;
import estrategiasDeBusca.heuristica.*;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		//char[] cfgIni = {' ','2','3','1','4','6','7','5','8'};
		//char[] cfgIni = {'2','4','3','7','1','6','5',' ','8'};
		char[] cfgIni = {'2','3',' ','7','4','1','5','8','6'};
		//char[] cfgIni = {'7','2','3','4',' ','1','5','8','6'}; // OutOfMemory
		char[] cfgEndi = {'3','1','6','7','5',' ','4','2'};
		
		Puzzle8 puzzleInicial = new Puzzle8();
		puzzleInicial.setEstado(cfgIni);
		puzzleInicial.setCusto(0);
		puzzleInicial.setAvaliacao( puzzleInicial.heuristica(Puzzle8.TABULEIRO_ORGANIZADO) );
			
		Puzzle8 puzzleFinal = new Puzzle8();
		puzzleFinal.setEstado( cfgEndi );
		puzzleFinal.setCusto(0);
		puzzleFinal.setAvaliacao(0);
		
		//BuscaCega busca = new BuscaEmLargura();
		//BuscaCega busca = new BuscaEmProfundidade();
		//BuscaCega busca = new BuscaEmProfundidadeLimitada(null, null, 5);
		
		
		//BuscaInformada busca = new BestFirst();			
		//BuscaInformada busca = new AStar();
		//busca.setInicio(puzzleInicial);
		//busca.setObjetivo(puzzleFinal);
		//busca.buscar();
		for(Estado e : busca.getCaminhoSolucao()) {
			System.out.println(e);
		}

		System.exit(0);
	}

}
