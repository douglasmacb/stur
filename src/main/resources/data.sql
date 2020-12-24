INSERT INTO usuario (id, nome, email, senha) VALUES (1, 'Douglas', 'douglasmacbrito@gmail.com', '$2a$10$ux1Tiij6HaKOepxyAC9vEOjcc.1dRp5GniZJYUQpKWET9xic.AKqW');

INSERT INTO endereco VALUES (1, 'Jardim Morumbi', '05421-555', 'Casa', 'Rua Carvalho de Almeida', 'São Paulo', 353, 'SP');
INSERT INTO endereco VALUES (2, 'Jardim Adalgisa', '0443-154', 'Casa', 'Rua Celso Russomano', 'São Paulo', 10, 'SP');
INSERT INTO imovel VALUES (1, '5000ha', 55848, 'Casa Juquitiba', '5773.332.2212.15', 2);
INSERT INTO contribuinte VALUES (1,  '', 55929, '86877090055' , now(), 'Ronaldo', '11 95344-2215', 2);
INSERT INTO iptu VALUES (1, 150.50, 2019, 5000.50, 8000.30, 15703212, 75.50, 1.200000, 500000, 1, 2, 1);


INSERT INTO endereco VALUES (3, 'Centro', '35600-973', 'Sitio', 'Praça da Matriz', 'Bom Destino', 14, 'MG');
INSERT INTO endereco VALUES (4, 'Jardim América', '35600-971', 'Sitio', 'Avenida Vivalde Brandão', 'Bom Destino', 315, 'MG');
INSERT INTO imovel VALUES (2, '5000ha', 55848, 'Sitio do Anastacio', '83833.432.155.55', 2);
INSERT INTO contribuinte VALUES (2,  '92091977000180', 43221, '37303887032' , now(), 'Sitio Anasticio LTDA', '11 95433-231321', 3);
INSERT INTO ITR VALUES (1, true, 2018, 500.50, 1500.50, 15, 300.50, 5000.50, 2, 2);