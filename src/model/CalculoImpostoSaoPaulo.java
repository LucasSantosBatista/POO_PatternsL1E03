/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class CalculoImpostoSaoPaulo implements CalculoImposto {
	@Override
	public double calcularImposto(double areaTotal, int idadeImovel, int numeroComodos, int numeroQuartos,
			double areaGaragem) {
		return areaTotal * 10 + numeroComodos * 2;
	}
}
