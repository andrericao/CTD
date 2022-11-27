function somar(a, b) {
 return  a + b;
}
console.log("---------------Teste de Operadores / Adição---------------")
console.log(somar(50, 3));

function sub(a, b) {
  return  a - b;
 }
 console.log("---------------Teste de Operadores / Subtração---------------")
 console.log(sub(50, 3));

 function vezes(a, b) {
  return  console.log(a * b);
 }
 console.log("---------------Teste de Operadores / Multiplicação---------------")
 vezes(50, 3);

 function divisao(a, b) {
  return  a / b;
 }
 
 console.log("---------------Teste de Operadores / Divisão---------------")
 console.log(divisao(45, 3));

function power(x) {
  return vezes(x, x);
};

console.log(power(15));

function media(x, y, z) {
  const somar2 = somar(y, x)
  const somar3 = somar(somar2, z)
  return divisao(somar3, 3)
}

console.log(media(3, 3, 3));

function porcentagem(numEmSi, porcentagemDesejada) {
  const CEM = 100;
  const passo1 = divisao(numEmSi, CEM)
  return vezes(passo1, porcentagemDesejada);
};

console.log(porcentagem(300, 15));

function geradorDePorcentagem(numEmSi, porcentagem) {
  const CEM = 100
  const passo2 = divisao(numEmSi, CEM)
  return divisao(passo2, porcentagem) 

}

console.log(geradorDePorcentagem(200, 2)+"%");