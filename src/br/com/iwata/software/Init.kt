package br.com.iwata.software

import br.com.iwata.software.model.Pessoa
	
fun main (args : Array<String>) {
	var pessoa = Pessoa();
	
	println("o nome � ${pessoa.nome} e a idade � ${pessoa.idade}");
}