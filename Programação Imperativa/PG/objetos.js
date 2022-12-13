let pais = {
  nome: "Brasil",
  capital: "Brasília",
  nacionalidade: function(){
    return "Sou do " + this.nome;
  }
};

console.log(pais[nome])
/*
console.log(pais);

console.log(pais.nome);

console.log(pais.capital);

console.log(pais["nome"]);

console.log(pais["capital"]);

console.log(pais.nacionalidade); // Function: nacionalidade

console.log(pais.nacionalidade()); // Sou do Brasil
*/
/*
let carro = {
  marca: "Fiat",
  modelo: "Uno",
};

console.log(carro)
*/

/*
function Carro (aMarca, oModelo) {
  this.marca = aMarca;
  this.modelo = oModelo;
};

console.log(new Carro("Renault", "Clio"))

let series = require('./module')
console.log(series)
*/