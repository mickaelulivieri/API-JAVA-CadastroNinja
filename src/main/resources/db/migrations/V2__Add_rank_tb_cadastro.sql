-- v2: migration para adicionar a coluna rank na tabela de cadastros

ALTER TABLE TB_NINJA
ADD COLUMN rank VARCHAR(255);