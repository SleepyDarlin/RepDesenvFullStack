package exercicio1;
import java.util.Calendar;


public class PessoaFisica extends Pessoa {
		int cpf;
		Calendar dtNascimento;
		String genero;
		
		int getCpf() {
			return cpf;
		};
		void setcpf(int x) {
			cpf = x;
		};
		
		Calendar getDtNascimento() {
			return dtNascimento;
		};
		void setDtNascimento(Calendar x ) {
			dtNascimento = x;
			
		};
		String getGenero() {
			return genero;
		};
		void setGenero(String gen) {
			genero = gen;
		};
		void getIdade() {
			//não consegui fazer
		};

}
