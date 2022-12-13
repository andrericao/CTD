const fs = require('fs'); 
const path = require('path');

let caminhoArquivo = path.join("oi.txt");

fs.writeFileSync(caminhoArquivo, "lorem ipsu3")
fs.appendFileSync(caminhoArquivo, "Lorem X")