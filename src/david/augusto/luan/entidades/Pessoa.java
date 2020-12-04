package david.augusto.luan.entidades;

public class Pessoa {

	private String nome;
	private Integer idade;

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}
}
