package br.com.iwata.software

fun main (args : Array<String>) {
	checarValorExistenteSet();
	filterEmLista();
}

fun nullCheck () : Int? {
	var x : Int?;
	var y : Int?;
	
	x = null;
	y = null;
	
	println("$x e $y");
	
	return x;
}

fun loop () {
	var lista : Array<String> = arrayOf("brendon", "pablo", "marcia");
	
	for (item in lista) {
		println("o item � $item");
	}
	
	for (index in lista.indices) {
		println("o indice � $index o item deste index � ${lista[index]}");
	}
}

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

fun ranges () {
	val x = 12;
	val y = 10;
	
	if (x in 1..y+1) {
		println("esta dentro do range");
	} else {
		println("nao esta dentro do range");
	}
}

fun rangesOfArray () {
	var lista = arrayOf("a", "b", "c");
	
	if (-1 !in 0..lista.lastIndex) {
		println("-1 est� fora do range");
	}
	
	if (lista.size !in lista.indices) {
		println("o tamanho da lista est� fora da lista de indices tamb�m");
	}
}

fun iterarSobreRange () {
	println("------iterando sobre ranges normalmente---------")
	for (x in 1..5) {
		println(x);
	}
}

fun iterandoSobreRangeComProgressao () {
	println("------iterando sobre ranges de 2 em 2---------")
	//pulando de 2 em 2
	for (x in 1..10 step 2) {
		println(x);
	}
	println("------itera��o reversa sobre ranges de 3 em 3---------")
	//pulando de 3 em 3 com uma forma diferente de dizer o inicio
	for (x in 10 downTo 0 step 3) {
		println(x);
	}
}

fun checarValorExistenteSet () {
	var lista = setOf("banana", "mam�o", "abacaxi");
	
	when {
		"banana" in lista -> println("tem uma banana nesse caralho");
		"mam�o" in lista -> println("tem um mam�o nesse caralho");
		"abacaxi" in lista -> println("tem um abacaxi nesse caralho");
	}
}

fun filterEmLista () {
	var lista = listOf("bunda", "banana", "mam�o", "abacaxi", "ma��", "buceta");
	
	lista
		.filter { it.startsWith("b") }
		.sortedBy { it }
		.map { it.toUpperCase() }
		.forEach{ println(it) }
	
}

