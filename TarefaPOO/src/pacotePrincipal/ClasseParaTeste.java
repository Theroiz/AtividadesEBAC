package pacotePrincipal;

public class ClasseParaTeste {
	public static void main(String[]args)
	{
		PessoaFisica pf1 = new PessoaFisica("carlos exemplo",29438520);
		PessoaFisica pf2 = new PessoaFisica("rodrigo exemplo",51259320);
		PessoaJuridica pj1 = new PessoaJuridica("empresa exemplo1",192394021);
		pf1.imprimirDados();
		pf2.imprimirDados();
		pj1.imprimirDados();
	}
}
