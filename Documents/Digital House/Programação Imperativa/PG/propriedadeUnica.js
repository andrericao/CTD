/*
Você deve criar uma função chamada propriedadeUnica que recebe uma array de objetos como parâmetro e uma string.  Você deve devolver um novo array de objetos, tendo apenas a propriedade que foi passada como string.  
exemplo: 
let array = [ { nome: "Lean", idade: 27 }, { nome: "Eze", idade: 49} ]
propriedadeUnica(array, "idade") deve retornar [ { idade: 27 }, { idade: 49 } ]
propriedadeUnica(array, "nome") deve retornar [ { nome: "Lean"}, { nome: "Eze" } ]

*/

class Dados {
  constructor(nome, idade, cidade, linguagem){
  this.nome = nome;
  this.idade = idade;
  this.cidade = cidade;
  this.limguagem = linguagem;
  }
} 

var pessoas = {
  informacoes: [],
  criarPessoa(nome, idade, cidade, linguagem) {
    var novaPessoa = new Dados(nome, idade, cidade, linguagem);
    this.informacoes.push(novaPessoa);
  }
}

pessoas.criarPessoa('André', 32, 'Rio de Janeiro', 'Kotlin');
pessoas.criarPessoa('Nathalia', 27, 'Rua 8', 'Enfermagem')
//console.log(pessoas.informacoes[0].idade);

for (let i = 0; i < pessoas.informacoes.length; i++) {
  console.log(pessoas.informacoes[i].idade);
}