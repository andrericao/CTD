const { generateText, validateInput, createElement } = require('../util.js');

describe('Testes de saída de dados', () => {
    test('Saída com dados', () =>{
        const text = generateText('Houser',30);
        expect(text).toBe('Houser (30 years old)');
    });
      
    <--completar-->('Saída com dados vazios', () =>{
        const text = generateText('',null);
        <--completar-->.toBe(' (null years old)');    
    });
    
    test('Saída sem dados', () =>{
        const text = generateText();
        <--completar-->('undefined (undefined years old)');    
    });
})