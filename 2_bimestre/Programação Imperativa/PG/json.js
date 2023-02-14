/*
let pessoa = {
  nome: "André",
  idade: 31,
  altura: 1.75,
}

let json = JSON.stringify(pessoa)
console.log(json)

let objetoNovo = JSON.parse(json)
console.log(objetoNovo)

*/

let listaCompras = ["pão", "manteiga", "leite"]
console.log(listaCompras)
let json1 = JSON.stringify(listaCompras)
console.log(json1)

let listaVolta = JSON.parse(json1)
console.log(listaVolta[0])
