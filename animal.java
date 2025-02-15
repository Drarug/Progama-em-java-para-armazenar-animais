package animais;

public class animal {
public String nome;
public float comprimento;
public int Numero_de_Patas;
public String cor;
public String ambiente;
public float Velocidade_Media;

public animal ( String name, float compri, int number, String color, String ambi, float velo) {
 nome = name;
 comprimento = compri ;
 Numero_de_Patas = number;
 cor = color;
 ambiente = ambi;
 Velocidade_Media = velo;
}
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Float getComprimento() {
	return comprimento;
}

public void setComprimento(float comprimento) {
	this.comprimento = comprimento;
}

public int getNumero_de_Patas() {
	return Numero_de_Patas;
}

public void setNumero_de_Patas(int numero_de_Patas) {
	Numero_de_Patas = numero_de_Patas;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getAmbiente() {
	return ambiente;
}

public void setAmbiente(String ambiente) {
	this.ambiente = ambiente;
}

public Float getVelocidade_Media() {
	return Velocidade_Media;
}

public void setVelocidade_Media(float velocidade_Media) {
	Velocidade_Media = velocidade_Media;
}
public void dados() {
	System.out.println("Nome = "+ getNome());
	System.out.println("comprimento = "+ getComprimento() + "M");
	System.out.println("Numero de patas = "+ getNumero_de_Patas());
	System.out.println("Cor = "+ getCor());
	System.out.println("Ambiente = "+ getAmbiente());
	System.out.println("Velocidade Media = "+ getVelocidade_Media() + "m/s");
}
}


