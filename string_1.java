package Aula04;

public class string_1 { 
	public static void main(String[] args) {
	byte bytes [] = {65,66,67};
	String s = new String (bytes);
	System.out.println(s);
	
	String str = "HELLO World";
	String resultado = str.replace("L","w"); //substitui caracteres especificos, sendo o primeiro a origem, e o segundo o que vai substituir//
	System.out.println("The first world (HELLO World) is now" + resultado);
	
	String primeira= "Oi"; 
	String texto = primeira + " mundo";// "+" concatena objetos numa string
	System.out.println(texto + " = Concatenou a primeira sting(oi) com a atual (+ world)");
	
	int tres = 3;
	String resultadoFinal = 3 + "palavra" + tres; //tanto o numero quanto o objeto sai como string//
	System.out.println(resultadoFinal);
	
	//substring: metodo que extrai texto de string, e retorna uma nova string com o texto selecionado//
	String stri = "Hello World";
	String resultadoo = stri.substring(3,8); //estão da posição 3 até a posição 8 exclusive (sem o caractere da posição 8).//
	System.out.println(resultadoo);
	
	//Para converter todos os caracteres de uma string para minúsculo usa-se o método toLowerCase( ). //
	String st = stri.toLowerCase();
	System.out.println(st);
	
	//Para retirar espaços em branco do início e do fim = trim()//
	String nome = " Rafael Cavalcanti     ";
	String result = nome.trim( );
	System.out.println(result);
	
	//Para extrair um caractere de uma string usa-se o método charAt ( ).//
	String nombre = "Hola! Como estas?";
	char c = nombre.charAt(9);
	System.out.println("A 9 letra extraida é " + c);
	
	//Para comparar se duas strings são iguais, podemos usar o método equals da classe String.//
	String s1 = "Mademouseille";
	String s2 = "MADEMOUSEILLE";
	boolean b1 = s1.equals("Hello" + "If Hello is equals to -Mademouseille-"); //Ou a srting em si
	boolean b2 = s2.equals(s2 + "if -MADEMOUSEILLE- is equals to -MADEMOUSEILLE-"); //Ou o objeto em si
	System.out.println(b1 + " e " + b2);
	
	//Existe também o método equalsIgnoreCase que compara duas strings ignorando maiúsculas e minúsculas.
	boolean b3 = s1.equalsIgnoreCase(s2);
	boolean b4 = s1.equalsIgnoreCase("Azul");
	System.out.println("the first comparison is" + b3 + " and the second comparison is" + b4);
	
	//O tamanho de uma string, ou seja, o número de caracteres pode ser obtido pelo método length.
	String sv = "abc";
	int tamanho = sv.length();
	System.out.println("O tamanho eh" + tamanho);
	
	//buscar a posição de caracteres ou substrings em uma String pelo métodos indexOf
	String label = "Carrefour";
	int pos = label.indexOf("r");
	System.out.println("A primeira vez que vemos o 'r' é na posiçao: "+ pos);
	
	//buscam o índice do início da substring buscada.
	String LABEL = "Carrefour BomPreço";
	int posi = LABEL.lastIndexOf("B");
	System.out.println("A posição da letra B esta no lugar" + posi);
	
	}
}
