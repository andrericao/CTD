function sub (x, y) {
  return y - x;
}

console.log(sub(100, 130));

function vezesdiv(x, y) {
  return x * 2 //a função termina no return
  console.log(x)
  return x / 2;
}

console.log(vezesdiv(10));

/*
1 - Crie uma função que converta polegadas em centímetros. 
Recebe pelo parâmetro polegadas e retorna seu equivalente em centímetros.
*/

function conversor(x) { 
  return x * 2.54
}

console.log(conversor(88));

/*
2 - Crie uma função que receba uma string e a converta em um URL.
ex: "funcaojs" é retornado como "http://www.funcaojs.com.br"
*/

function conversorString(endereco) {
  return console.log("http://www." + endereco + ".com.br");
}

conversorString("roadmap");

//3 - Crie uma função que recebe uma string e retorna a mesma frase, mas com o caracter de exclamação ( ! ).

function exclama(frase) {
  return console.log(frase +"!");
}

exclama("Noah tá vindo já");

//4 - Crie uma função que calcule a idade dos cachorros, considerando que 1 ano humano, equivale a 7 anos para eles.

function ageDog(x) {
  console.log(x * 7);
}

ageDog(5);

/*5 - Crie uma função que calcule o valor da sua hora de trabalho, tendo como parâmetro o seu salário mensal.
PS: considere que você trabalhe 160 horas no mês.
*/

function remuneracao(x) {
  const horastrabalhadas = 160;
  return console.log(x / horastrabalhadas)
}

remuneracao(5000);

/*
6- Crie a função calculadora de IMC* de uma pessoa, que recebe a altura em centímetros e o peso em quilogramas. 
Em seguida, execute a função, testando diferentes valores. 

OBS: IMC, significa Índice de Massa Corporal e é um parâmetro utilizado para saber se o peso está de acordo com a altura.
*/

function imc(peso, altura) {
  return console.log(peso / (altura * altura));
}

imc(75, 1.75);