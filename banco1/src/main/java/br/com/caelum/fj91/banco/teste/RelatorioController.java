package br.com.caelum.fj91.banco.teste;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.fj91.banco.modelo.Conta;
import br.com.caelum.fj91.banco.persistencia.Dao;

public class RelatorioController {

	/**
	 * Exibir contas abertas do 1 e do 2 semestre
	 * 
	 * @param ano
	 * @return
	 */
	public List<Conta> contasAbertas(int ano) {
		Dao<Conta> dao = new Dao<Conta>();

		List<Conta> contas = dao.listaTodos();
		List<Conta> contasSemestre1 = null;
		List<Conta> contasSemestre2 = null;

		for (Conta conta : contas) {
			if (conta.getDataAbertura().get(Calendar.YEAR) == ano) {
				if (conta.getDataAbertura().get(Calendar.MONTH) < Calendar.JUNE) {
					contasSemestre1.add(conta);
				} else {
					contasSemestre2.add(conta);
				}
			}
		}

		// List<Conta> contas = dao.contasPorAno(ano);

		return null;
	}
}
