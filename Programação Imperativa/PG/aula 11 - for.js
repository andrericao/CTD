/*1. Repetir como um papagaio
Crie um loop utilizando for que se repita 5 vezes. Dentro de cada repetição
se deve mostrar no console a mensagem “Olá mundo”.*/

//       INÍCIO     / CONDIÇÃO      /  MODIFICADOR
for (let saudacao = 0; saudacao < 5; saudacao++) {
  console.log('Olá Mundo!')
} 

/*
2. Contando números ímpares
Crie um loop for de 1 a 10, em que exiba no console apenas o valor das
repetições de números ímpares. Dica: A ideia é que nas repetições ímpares
de 0 ao 10 (1,3,5,7,9) sejam mostrados os números das repetições no
console.*/

//     INÍCIO    /   CONDIÇÃO   /   MODIFICADOR

for(let num = 0; num <= 10; num++) {
  if (num % 2 == 1) console.log(num)
}

/*
3. Criando a tabuada
Crie uma tabuada utilizando o for. Dica: Para essa tarefa você irá precisar
utilizar dois loops (for).*/

//   INÍCIO   / CONDIÇÃO  /   MODIFICADOR
for(let num = 1; num <= 10; num++) {
  for (let vezes = 1; vezes <= 10; vezes++)
      console.log(vezes * num)
}