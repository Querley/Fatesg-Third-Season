package n1.activities.a1.pessoaExec.application;
import n1.activities.a1.pessoaExec.models.Pessoa;
import n1.activities.a1.pessoaExec.services.PessoaService;

public class Main {

public static void main(String[] args) {
	PessoaService pessoaService = new PessoaService();
	Pessoa p = pessoaService.createPessoa();
	pessoaService.verifyAgeRange(p);
	pessoaService.verifyBMI(p);
}

}
