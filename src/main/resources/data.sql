INSERT INTO usuario (id, nome, email, senha) VALUES (1, 'Douglas', 'douglasmacbrito@gmail.com', '$2a$10$Rvs6Eo39Cw8Bz3miTrAPD.P2aONVXX6nlvTDFCuIpWAty9TRObWPC');

INSERT INTO endereco VALUES (1, 'Jardim Morumbi', '05421-555', 'Casa', 'Rua Carvalho de Almeida', 'São Paulo', 353, 'SP');
INSERT INTO endereco VALUES (2, 'Jardim Adalgisa', '0443-154', 'Casa', 'Rua Celso Russomano', 'São Paulo', 10, 'SP');
INSERT INTO imovel VALUES (1, '5000ha', 55848, 'Casa Juquitiba', '5773.332.2212.15', 2);
INSERT INTO contribuinte VALUES (1,  '', 55929, '86877090055' , now(), 'Ronaldo', '11 95344-2215', 2);
INSERT INTO imposto VALUES (1, 2021, 2500.0, 3200.0, 'IPTU', 1, 1, 1);

INSERT INTO endereco VALUES (3, 'Centro', '35600-973', 'Sitio', 'Praça da Matriz', 'Bom Destino', 14, 'MG');
INSERT INTO endereco VALUES (4, 'Jardim América', '35600-971', 'Sitio', 'Avenida Vivalde Brandão', 'Bom Destino', 315, 'MG');
INSERT INTO imovel VALUES (2, '5000ha', 55848, 'Sitio do Anastacio', '83833.432.155.55', 2);
INSERT INTO contribuinte VALUES (2,  '9209197000180', 43221, '37303887032' , now(), 'Sitio Anasticio LTDA', '11 95433-231321', 3);
INSERT INTO imposto VALUES (2, 2021, 5000.0, 8000.0, 'ITR', 2, 3, 2);

INSERT INTO contribuinte VALUES (3,  '6408451000184', 55929, '' , now(), 'Ronaldo', '11 95344-2215', 2);
INSERT INTO imposto VALUES (3, 2021, 2500.0, 3200.0, 'IPTU', 3, 1, 1);