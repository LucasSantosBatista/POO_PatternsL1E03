/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Cidade {
	private String nome;
	private CalculoImposto calculoImposto;

	public Cidade(String nome, CalculoImposto calculoImposto) {
		this.nome = nome;
		this.calculoImposto = calculoImposto;
	}

	public double calcularImposto(double areaTotal, int idadeImovel, int numeroComodos, int numeroQuartos,
			double areaGaragem) {
		return calculoImposto.calcularImposto(areaTotal, idadeImovel, numeroComodos, numeroQuartos, areaGaragem);
	}

	public String getNome() {
		return nome;
	}
}







