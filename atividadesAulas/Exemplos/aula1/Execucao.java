package br.edu.ifs.itabaiana.poo.aula1;

import java.util.Date;

import teste.Teste;

public class Execucao {

	public static void main(String[] args) {
      /*  Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("888.888.888-88");
        pessoa1.setDataNascimento(new Date());
        pessoa1.setDataRenovacaoCNH(new Date());
        pessoa1.setDoadorOrgaos(true);
        pessoa1.setNome("João das Candongas");*/
		
		Pessoa pessoa1 = new Pessoa("888.888.888-88",new Date(),null ,"João das Candongas", true);
	
        System.out.println("CPF: "+pessoa1.getCpf());
        System.out.println("Dt. Nascimento: " + pessoa1.getDataNascimento());
        System.out.println("Dt. Renovação CNH:" +pessoa1.getDataRenovacaoCNH());
        System.out.println("Doador de órgãos: " + pessoa1.isDoadorOrgaos());
        System.out.println("Nome:" + pessoa1.getNome());
        
        System.out.println(pessoa1.toString());
        
        System.out.println(pessoa1.doadorOrgaos);
        
        PessoaFisica pf = new PessoaFisica();
        System.out.println(pf.toString());
        
        ContaCorrente c = new ContaCorrente();
        
        Teste t = new Teste();
        
        int f = t.codigo;
        
	}

}
