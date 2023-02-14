-- ================ TABELA MUSIMUNDOS ============================
-- 1 - Crie uma procedure que selecione o valor da fatura com o valor mais baixo

DELIMITER $$   
CREATE PROCEDURE menor_fatura()
BEGIN
SELECT MIN(valor_total) 'Menor fatura' FROM faturas;
END
$$

call menor_fatura();