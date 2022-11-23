const participanteA =  [5, 8, 4, 9, 5]
const participanteB =  [8, 7, 8, 6, 8]
const participanteC =  [7, 5, 10, 8, 3]

let i = 0;

// Melhor média (a maior pontuação média entre os concorrentes)

(5 + 8 + 4 + 9 + 5)/5  // Média

const soma = (participanteA[0] + participanteA[1] + participanteA[2] + participanteA[3] + participanteA[4])
const media = soma/participanteA.length;

function media(array){
  let soma = 0;
  // Estrutua de repetição

  return media;
}

function maior(array){
  return maiorElemento;
}

// Mesa 

function media(participantesA){
  let soma = 0;
  while (i <= 4) {
    soma += participanteA[i];
    i++;
  }
  media = soma/participanteA.length
  return media;
}
console.log(media(participanteA))

function media(participantesB){
let soma = 0;
while (i <= 4) {
  soma += participanteB[i];
  i++;
}
media = soma/participanteB.length
return media;
}
console.log(media(participanteB))

// DISCORD

X = participanteC

function media(array){
    let soma = 0;
    while (i < array.length) {
      soma += array[i];
      i++;
    }
    media = soma/array.length
    return media;
  }
console.log("A média é: " + media(X))

//const participanteA =  [5, 8, 4, 9, 5]
function maior(array){
  let a = 0;
  let b = 0;
  let i = 0;
  while (i < array.length) {
    a = array[i];
    if (a > b) {
      b = a
      //console.log(b)
    }
    i++;
  }
  maior = b
  return maior;
}
console.log("O maior valor é: " + maior(X))