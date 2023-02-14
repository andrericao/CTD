class ContaBancaria {
  // Construção do objeto de fato
  constructor(numero,tipo,saldo,titular){
    // novo this -> {} -> Objeto vazio 
    this.numero = numero;
    this.tipo = tipo;
    this.saldo = saldo;
    this.titular = titular;
  }
}


const dados = {
contas:[],
adicionarConta(numero,tipo,saldo,titular){
  const novaConta = new ContaBancaria(numero,tipo,saldo,titular);
  this.contas.push(novaConta);
}
}

dados.adicionarConta(01,"Conta corrente",1000.00,"Rafael Nardini");
dados.adicionarConta(5486273622,"Conta corrente",27771,"Abigael Natte");
dados.adicionarConta(5486273622,"Conta corrente",277.71,"Abigael Natte");
console.log(dados.contas);
