const participanteA =  [5, 8, 4, 9, 5];
const participanteB =  [8, 7, 8, 6, 8];
const participanteC =  [7, 5, 10, 8, 3];

// Por que não dá o console.log
/*
function media(array){
  let i = 0;
  let soma = 0;
  while (i < array.length) {
    soma += array[i];
    i++;
  }
  return soma;
}
  console.log(media(participanteA));
*/

function somar(array){
  let soma = 0;
  for (let i = 0; i < array.length; i++) {
    soma += array[i];
  }
  return soma;
}

console.log(somar(participanteA));

/*
function media(array){
  let i = 0;
  let soma = 0;
  while (i < array.length) {
    soma += array[i];
    i++;
  }
  let media = soma/array.length
  return media;
};

function maior(array){
  let a = 0;
  let b = 0;
  let i = 0;
  while (i < array.length) {
    a = array[i];
    if (a > b) {
      b = a
    }
  i++;
  }
  let maior = b
  return maior;
};

console.log(`A média mais o maior valor do participante A é ${maior(participanteA) + media(participanteA)}`);
console.log(`A média mais o maior valor do participante B é ${maior(participanteB) + media(participanteB)}`); 
console.log(`A média mais o maior valor do participante C é ${maior(participanteC) + media(participanteC)}`);
*/