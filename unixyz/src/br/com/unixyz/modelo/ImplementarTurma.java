package br.com.unixyz.modelo;

public class ImplementarTurma {

	private String codigo;
	private String nome;
	private String perido;
	private String Aluno;
	private String Professor;
	private String Curso;
	
	
		
	public ImplementarTurma() {
		super();
	}
	public ImplementarTurma(String codigo, String nome, String perido, String aluno, String professor, String curso) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.perido = perido;
		Aluno = aluno;
		Professor = professor;
		Curso = curso;
	}
	@Override
	public String toString() {
		return "ImplementarTurma [codigo=" + codigo + ", nome=" + nome + ", perido=" + perido + ", Aluno=" + Aluno
				+ ", Professor=" + Professor + ", Curso=" + Curso + ", getCodigo()=" + getCodigo() + ", getNome()="
				+ getNome() + ", getPerido()=" + getPerido() + ", getAluno()=" + getAluno() + ", getProfessor()="
				+ getProfessor() + ", getCurso()=" + getCurso() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPerido() {
		return perido;
	}
	public void setPerido(String perido) {
		this.perido = perido;
	}
	public String getAluno() {
		return Aluno;
	}
	public void setAluno(String aluno) {
		Aluno = aluno;
	}
	public String getProfessor() {
		return Professor;
	}
	public void setProfessor(String professor) {
		Professor = professor;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	
		
	}
	
	
	
	
	
	
}


