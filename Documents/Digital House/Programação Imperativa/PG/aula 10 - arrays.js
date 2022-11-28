// EXEMPLOS DO EXERCÍCIO

let numbers = [22, 33, 54, 66, 72];
console.log(numbers[numbers.length]);

let grupoDeAmigos = [ ["Harry", "Ron", "Hermione"], ["Spiderman", "Hulk", "Ironman"], ["Penélope Glamour", "Pierre Nodoyuna","Patán"] ];
console.log(grupoDeAmigos[1][0]);


let str = "uma string qualquer"
let grupoDeAmigos2 = [ [45, 89, 0], ["Digital", "House", true], ["string", "123","false", 54, true, str] ];
console.log(grupoDeAmigos2[2][grupoDeAmigos2[2].length - 1]);



// SOMAR ARRAY 

function soma (array) {
  //    INÍCIO   /    CONDIÇÃO    / MODIFICADOR
  for (let i = 0; i < array.length; i ++) {
    array[i] += array[i]
  }
  return array
}
console.log('Resultador da função soma');
console.log(soma(numbers));

//const prompt = require('prompt-sync')()
/*
let numbers = [22, 33, 54, 66, 72];

let numbers2 = [];

console.log(numbers[4], numbers[3], numbers[2], numbers[1], numbers[0]);
//const vetor_a = [22, 33, 54, 66, 72];//não sabia se declarava ele fora ou dentro da função 

function inverterArray(array) {

  const n = vetor_a.lenght - 1;
  const vetor_b = array(n);// qual a diferença entre array, array() e Array?

  let j = vetor_a.lenght - 1;
  for (item of vetor_a) {
    vetor_b[j] = item;
    j--
  } 

  console.log(vetor_a);
  console.log(vetor_b);

}

inverterArray(vetor_a); //não sabia como chamar a função
 
*/

/*
function inverterArray(array) {
  constn 
  var i = 0
  var j = array.lenght - 1;
  for(i = 0, j = array.lenght - 1; i < array.lenght; i++, j--) {
    i--
  }
}

console.log(inverterArray(numbers2));

console.log(numbers.length - 1);

/*
int a[5] = {1, 2, 3, 4, 5};
int b[5];
for (int i = 0, j = 4; i < 5; i++, j--){
b[j] = a[i];
}
cout << "Inversão de “A”: ";
for (int i = 0; i < 5; i++){
cout << b[i] << " ";
}
*/

