let qualquerCoisa = "Essa é uma string qualquer para gerar um array";
let umArrayQualquer = qualquerCoisa.split(" ");

console.log(umArrayQualquer);
// Push - adiciona ao final de cada array

umArrayQualquer.push('novo');
console.log(umArrayQualquer);

// pop - retira o último objeto do array

umArrayQualquer.pop();
console.log(umArrayQualquer);

// shift - retira o primeiro objeto do array

umArrayQualquer.shift();
console.log(umArrayQualquer);

// unshift - adiciona um objeto no índice 0

umArrayQualquer.unshift('Essa');
console.log(umArrayQualquer);

// join - inverso do split: transforma array em string

let qualquerCoisa2 = umArrayQualquer.join(' ');
console.log(qualquerCoisa2);

console.log(umArrayQualquer.lastIndexOf('array'));
console.log(umArrayQualquer.length - 1); // PROVA REAL

// includes - verifica se tal array INCLUI tal objeto e retorna um booleano

console.log(umArrayQualquer.includes('amor'));
console.log(umArrayQualquer.includes('Essa'));
