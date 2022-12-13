var endereco = [{
    rua: 1,
    cep: 34.5,
    numeroDeCasas: 123,
    bairro: "Vista Alegre",
    uf: "BA",
    cidade: "Rio de Janeiro",
    saneamento: true
  }, {
  rua: 2,
  cep: 34.5,
  numeroDeCasas: 39,
  bairro: "Vista Alegre",
  uf: "BA",
  cidade: "Rio de Janeiro",
  saneamento: false
  },
  { rua: 3,
  cep: 34.5,
  numeroDeCasas: 50,
  bairro: "Vista Alegre",
  uf: "BA",
  cidade: "Rio de Janeiro",
  saneamento: true
}]

function mediaCasas (vetor) {
  let somaCasas = 0
  for(let i = 0; i < vetor.length; i++) {
    somaCasas = somaCasas + vetor[i].numeroDeCasas
  }
  let mediaCasas = somaCasas / (vetor.length)
  return mediaCasas.toFixed(2);
}

function numeroRuasSaneamento (vetor) {
  let numeroRuasSaneamento = 0
  for(let i = 0; i < vetor.length; i++) {
    if(vetor[i].saneamento) {
      numeroRuasSaneamento = numeroRuasSaneamento + 1
    }
  }
  console.log('O somatório do número de casa que tem saneamento é ' + numeroRuasSaneamento)
}

console.log(mediaCasas(endereco));

console.log(typeof endereco);
console.log(endereco.rua);

numeroRuasSaneamento(endereco);