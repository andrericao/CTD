const fs = require('fs');
const moment = require('moment');

let dados = fs.readFileSync(__dirname + '/oi.txt', 'utf8');
var data = moment().format('MMM do YY');

console.log(data);

/*
var moment = require('moment'); // require
moment().format(); 
*/