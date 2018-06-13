package br.com.k21.sistemavendas;

public class CalculadoraComissao {

	private double valorInformado;

	public CalculadoraComissao(double valorVenda) {
		this.valorInformado = valorVenda;
	}

	private static final double VALOR_LIMITE_COMISSAO = 10000;
	private static final double PERCENTUAL_FAIXA_1 = 0.05;
	private static final double PERCENTUAL_FAIXA_2 = 0.06;

	public static double calcular(double valorVenda) {
		double valorComissao = 0;

		if (valorVenda <= VALOR_LIMITE_COMISSAO) {
			valorComissao = valorVenda * PERCENTUAL_FAIXA_1;
		} else {
			valorComissao = valorVenda * PERCENTUAL_FAIXA_2;
		}

		valorComissao = arredondarParaBaixo(valorComissao);

		return valorComissao;
	}

	public double getValorComissao() {
		double valorComissao = calcular(valorInformado);
		return valorComissao;
	}

	private static double arredondarParaBaixo(double valorComissao) {
		valorComissao = (valorComissao * 100);
		valorComissao = Math.floor(valorComissao);
		valorComissao = valorComissao / 100.0;
		return valorComissao;
	}

}
