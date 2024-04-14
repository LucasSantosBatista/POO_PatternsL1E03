/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class CalculoImpostoBeloHorizonte implements CalculoImposto {
	@Override
	public double calcularImposto(double areaTotal, int idadeImovel, int numeroComodos, int numeroQuartos,
			double areaGaragem) {
		return areaTotal * 7 + numeroQuartos * 4;
	}
}