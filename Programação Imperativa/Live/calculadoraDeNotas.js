/*Crie o objeto do aluno,que consistirá nas seguintes propriedades básicas:

●número
●Número do arquivo
●Lista de notas

Gostaríamos de calcular a média do aluno e se ela é aprovada com base em uma nota
de aprovação que será dada. Para este exercício vamos deixar você pensar sobre
todos os métodos e propriedades que podem ser necessários para que nosso
programa funcione corretamente da maneira solicitada.
4
*/

class Aluno {
  constructor(numero, numeroArquivo, notas) {
    this.numero = numero;
    this.numeroArquivo = numeroArquivo;
    this.notas = notas;
  }
}

const aluno = {
  alunos: [],

  adicionarAluno(numero, numeroArquivo, notas) {
    const novoAluno = new Aluno(numero, numeroArquivo, notas);
    this.alunos.push(novoAluno);
  },

  media(array){
    let soma = 0;
    let nota = 0;
    for (let i = 0; i < aluno.alunos.length; i++){
     nota = aluno.alunos[i].notas
      for(let ii = 0; ii < nota.length; ii++) {
        soma += nota[ii] 
      }

      let media = soma / nota.length
      console.log(media);
    }
    },
    /*
  media(array){
    let soma = 0;
    for (let i = 0; i < array.length; i++) {
      soma += array[i];
    }
      let media = soma/array.length
      return media;
    }*/
}

aluno.adicionarAluno(01, 15, [8, 7, 9, 10, 8]);
aluno.adicionarAluno(02, 16, [5, 8, 4, 9, 5]);
aluno.adicionarAluno(03, 16, [8, 7, 8, 6, 8]);
aluno.adicionarAluno(04, 16, [7, 5, 10, 8, 3]);

console.log('Temos um total de '+aluno.alunos.length + ' alunos. São eles:');
console.log(aluno.alunos);

console.log(aluno.media());
/*console.log('A média do aluno '+ aluno.alunos[i].numero 'é: '+ aluno.media(aluno.alunos[i]));*/
//console.log(aluno.media(aluno.notas));