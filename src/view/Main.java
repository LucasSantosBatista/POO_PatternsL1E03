/**
 * 
 */
package view;

import model.CalculoImpostoBeloHorizonte;
import model.CalculoImpostoCuritiba;
import model.CalculoImpostoPortoAlegre;
import model.CalculoImpostoSaoPaulo;
import model.Cidade;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
//Classe view para apresentar a aplicação do Strategy
public class Main {
	public static void main(String[] args) {
		Cidade saoPaulo = new Cidade("São Paulo", new CalculoImpostoSaoPaulo());
		Cidade beloHorizonte = new Cidade("Belo Horizonte", new CalculoImpostoBeloHorizonte());
		Cidade portoAlegre = new Cidade("Porto Alegre", new CalculoImpostoPortoAlegre());
		Cidade curitiba = new Cidade("Curitiba", new CalculoImpostoCuritiba());

		double impostoSP = saoPaulo.calcularImposto(100, 40, 4, 0, 0);
		double impostoBH = beloHorizonte.calcularImposto(100, 30, 0, 5, 0);
		double impostoPOA = portoAlegre.calcularImposto(100, 25, 3, 0, 50);
		double impostoCTBA = curitiba.calcularImposto(100, 60, 4, 3, 0);

		System.out.println("Imposto em São Paulo: R$" + impostoSP);
		System.out.println("Imposto em Belo Horizonte: R$" + impostoBH);
		System.out.println("Imposto em Porto Alegre: R$" + impostoPOA);
		System.out.println("Imposto em Curitiba: R$" + impostoCTBA);
	}
}
