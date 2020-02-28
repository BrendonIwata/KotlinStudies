package br.com.iwata.software.model

class Pessoa (nome : String?, idade : Int?) {
	
	constructor () : this(null, null);
	
	var nome : String? = nome;
	var idade : Int? = idade;
}