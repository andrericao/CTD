/* PASSO 1 (1,5 PONTOS)
Crie uma função construtora ou Classe Aluno que tenha como atributos: nome
(string), quantidade de faltas (number) e notas (array de números).
*/

class Aluno {
	constructor(nome, faltas, notas) {
		this.nome = nome;
		this.faltas = faltas;
		this.notas = notas;
	}
	calcularMedia() {
		let soma = 0
		for (let i = 0; i < informacoes.length; i++) {
			for (let ii = 0; ii < informacoes[i].notas.length; ii++){
			soma += informacoes[i].notas[ii];
			}
		}
		let media = soma / 3		
		return media
	}
} 
let informacoes = [];
const aluno1 = new Aluno ('Andre', 2, [9, 8.5, 6]);
informacoes.push(aluno1)
let notas1 = informacoes[0].notas 
const media1 = informacoes[0].calcularMedia(notas1);
console.log(media1.toFixed(2));
console.log(notas1);
console.log(aluno1.calcularMedia(notas1).toFixed(2));

/* PASSO 2 (1,5 PONTOS)
Na função construtora crie o método calcularMedia que retorna a média de suas
notas. Também terá um método chamado faltas, que simplesmente aumenta o número de
faltas em 1. Crie alguns alunos para testar a sua função construtora
*/
/*
const aluno = {
	informacoes:[],
	criarAluno(nome, faltas, notas) {
		var novoAluno = new Aluno(nome, faltas, notas);
		this.informacoes.push(novoAluno)
	},
	consultarCandango(candango){
			let alunosEncontrados = [];
			for (let catarrento of this.informacoes){
				if(catarrento.nome.includes(candango)) {
					alunosEncontrados.push(catarrento)
				}
			}
			return alunosEncontrados;
		},
		calcularMedia() {
			let soma = 0
			for (let i = 0; i < informacoes.length; i++) {
				for (let ii = 0; ii < informacoes[i].notas.length; ii++){
				soma += informacoes[i].notas[ii];
				}
			}
			let media = soma / 3		
			return media
		}
	}/*
	calcularMedia(alunoMedia) {
    const alunoBusca = this.consultarCandango(alunoMedia);
    if (alunoBusca) {
      let media = 0;
      let soma = 0;
      for (let i = 0; i < alunoBusca.notas.length; i++) {
        soma += alunoBusca.notas[i];
      }
      media = soma / alunoBusca.notas.length;
      console.log("A média das notas do aluno",alunoBusca.nome,"é:",media.toFixed(2));
    }
}*/

/*
aluno.criarAluno("Andre", 2, [8.5, 10, 9, 6]); //8,375
aluno.criarAluno("Nathalia", 0, [9, 7.5, 8, 9.9]); //8,6
*/

//console.log(aluno.calcularMedia('Andre'));
//console.log(calcularMedia())