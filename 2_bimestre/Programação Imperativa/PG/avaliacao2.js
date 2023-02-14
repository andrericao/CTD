class Aluno {
  constructor (nome, faltas, notas) {
    this.nome = nome,
    this.faltas = faltas,
    this.notas = notas
  }
}

var aluno = {
  relacaoAlunos: [],
  criarAluno(nome, faltas, notas) {
		var novoAluno = new Aluno(nome, faltas, notas);
		this.relacaoAlunos.push(novoAluno)
	},
	consultarCandango(candango){
			let alunosEncontrados = [];
			for (let catarrento of this.relacaoAlunos){
				if(catarrento.nome.includes(candango)) {
					alunosEncontrados.push(catarrento)
				}
			}
			return alunosEncontrados;
		},
  calcularMedia(nomeSobrenome) {
     let alunosEncontrados = [];


		for (let catarrento of this.relacaoAlunos){


				if(catarrento.nome.includes(nomeSobrenome)) {

					alunosEncontrados.push(catarrento)
          let notaAluno = alunosEncontrados[0].notas
          console.log(notaAluno) 
          console.log(alunosEncontrados);
          let soma = 0
		for (let i = 0; i < notaAluno.length; i++) {
			soma += alunosEncontrados[0].notas[i];
		}
    let media = 0
	  media = soma / notaAluno.length	
    return media;  
				}
			}
		}
}

aluno.criarAluno("Andre Paulo", 2, [8.5, 10, 9, 6]); //8,375
aluno.criarAluno("Nathalia Castro", 0, [9, 7.5, 8, 9.9]); //8,6

console.log(aluno.calcularMedia("Nathalia Castro"))