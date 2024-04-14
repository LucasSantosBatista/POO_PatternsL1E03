/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class CalculoImpostoPortoAlegre implements CalculoImposto {
	@Override
	public double calcularImposto(double areaTotal, int idadeImovel, int numeroComodos, int numeroQuartos,
			double areaGaragem) {
		if (areaGaragem > 0) {
			return areaTotal * 7.5 + areaGaragem * 2.5;
		} else {
			return areaTotal * 8;
		}
	}
}