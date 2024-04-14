/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
//Implementação padrão para cidades que não possuem regras adicionais de cálculo
public class CalculoImpostoPadrao implements CalculoImposto {
	@Override
	public double calcularImposto(double areaTotal, int idadeImovel, int numeroComodos, int numeroQuartos,
			double areaGaragem) {
		return 0; // Implementação padrão (sem regras adicionais)
	}
}
