package negocio;


public class Diretor extends Funcionario{

	public float adicional;
	
	@Override
	public void exibir() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return String.format(
				"%s: %s\n" +
				"Adicional: %.2f\n",
				"M".equals(this.getSexo()) ? "Diretor" : "Diretora",
				super.toString(),
				this.getAdicional()
			);
	}
	
	
	
	
	public float getAdicional() {
		return adicional;
	}

	public void setAdicional(float adicional) {
		this.adicional = adicional;
	}
}
