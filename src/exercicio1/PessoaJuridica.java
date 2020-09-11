package exercicio1;

public class PessoaJuridica extends Pessoa {
		int cnpj;
		String atividade;
		
		int getCnpj() {
			return cnpj;
		};
		void setCnpj(int num) {
			cnpj = num;
		};
		String getAtividade() {
			return atividade;
		};
		void setAtividade(String ativ) {
			atividade = ativ;
		};

}
