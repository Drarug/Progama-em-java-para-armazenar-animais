package animais;
 
public class peixe extends animal {
public String caracteristicas;
	public peixe(String name, float compri, int number, String color, String ambi, float velo, String carac) {
		super(name, compri, number, color, ambi, velo);
		caracteristicas = carac ;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public void dados() {
		System.out.println("Nome = "+ getNome());
		System.out.println("comprimento = "+ getComprimento()+ "cm");
		System.out.println("Numero de patas = "+ getNumero_de_Patas());
		System.out.println("Cor = "+ getCor());
		System.out.println("Ambiente = "+ getAmbiente());
		System.out.println("Velocidade Media = "+ getVelocidade_Media()+"m/s");
		System.out.println("Caracteristicas = "+ getCaracteristicas());
	}
	
}
