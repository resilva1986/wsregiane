package br.com.unixyz.implementacao;

public class ImplementarTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Turma turma = new Turma(
				1,
				"Turma18C",
				"Diurno",
				new Aluno(
						123,
						"nome aluno",
						"email aluno",
						"1234-5678",
						"12345678999",
						new Endereco(
								"log",
								"bairro",
								"cid",
								"uf",
								"12345-123",
								"12",
								"comp"
								)
						),
				new Professor(
						new Endereco(
								"log",
								"bairro",
								"cid",
								"uf",
								"12345-123",
								"12",
								"comp"							
								),
						"prof",
						"tit",
						50
						),
				new Curso(
						JOptionPane.showInputDialog("Descricao"),
						"sigla",
						Double.parseDouble(JOptionPane.showInputDialog("Valor")),
						"formacao"
						)
				);
		
		System.out.println("Professor: " + turma.getProfessor().getNome());
		System.out.println("Aluno: " + turma.getAluno().getNome());
		System.out.println("Cidade: " + turma.getAluno().getEndereco().getCidade());
		System.out.println("Curso: " + turma.getCurso().getDescricao());
		System.out.println("Turma: " + turma.getNome());
	}

}
