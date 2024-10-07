INSERT INTO UserEntity (username, balance)
VALUES ('Fifi da Silva', 100);
INSERT INTO UserEntity (username, balance)
VALUES ('Marcela Santos', 50);
INSERT INTO UserEntity (username, balance)
VALUES ('Sarah Smiles', 50);
INSERT INTO UserEntity (username, balance)
VALUES ('Manuela da Vries', 50);
INSERT INTO UserEntity (username, balance)
VALUES ('Jaqueline Santos', 50);

INSERT INTO Category (category_name)
VALUES ('cappuccino');
INSERT INTO Category (category_name)
VALUES ('mocha');
INSERT INTO Category (category_name)
VALUES ('americano');
INSERT INTO Category (category_name)
VALUES ('macchiato');
INSERT INTO Category (category_name)
VALUES ('cortado');
INSERT INTO Category (category_name)
VALUES ('latte');
INSERT INTO Category (category_name)
VALUES ('espresso');
INSERT INTO Category (category_name)
VALUES ('affogato');
INSERT INTO Category (category_name)
VALUES ('frappe');

INSERT INTO Coffee (name, description, category_id, price, image, on_stock)
VALUES ('Italiano', 'Ele é bem daora', 1 ,15,
        'https://t4.ftcdn.net/jpg/06/53/71/23/360_F_653712384_y127UlV1mjqj7Bj2StodEGOksdK99NfC.jpg', 20);
INSERT INTO Coffee (name, description, category_id, price, image, on_stock)
VALUES ('Mocha com chocolate preto', 'Chocolate meio amargo, café espresso e leite vaporizado. Obs: é um café bem doce por conta do chocolate.', 2 ,17.90,
        'https://gatherforbread.com/wp-content/uploads/2014/10/Dark-Chocolate-Mocha-Square.jpg', 20);
INSERT INTO Coffee (name, description, category_id, price, image, on_stock)
VALUES ('Mocha com chocolate zero açúcar', 'Chocolate preto zero açúcar, café espresso e leite vaporizado. Obs: É um café bem doce por conta do chocolate.', 2 ,17.90,
        'https://gatherforbread.com/wp-content/uploads/2014/10/Dark-Chocolate-Mocha-Square.jpg', 20);
INSERT INTO Coffee (name, description, category_id, price, image, on_stock)
VALUES ('Frapp Pistache', 'Nosso creme de pistache batido com gelo. Acompanha chantilly.', 9 ,20.90,
        'https://static.ifood-static.com.br/image/upload/t_medium/pratos/3f5fc865-73af-4930-99f5-606e198a04b1/202312052257_W113_i.jpg', 20);
INSERT INTO Coffee (name, description, category_id, price, image, on_stock)
VALUES ('Frapp Caramel', 'Café espresso ou base de creme, gelo e leite batido com caramelo. Acompanha chantilly.', 9 ,20.90,
        'https://static.ifood-static.com.br/image/upload/t_medium/pratos/3f5fc865-73af-4930-99f5-606e198a04b1/202111081235_57R3_i.jpg', 20);
INSERT INTO Coffee (name, description, category_id, price, image, on_stock)
VALUES ('Frapp Alpino', 'Nossa base de café gelado, batida com gelo e alpino. Acompanha chantilly.', 9 ,20.90,
        'https://static.ifood-static.com.br/image/upload/t_medium/pratos/3f5fc865-73af-4930-99f5-606e198a04b1/202111081237_3018_i.jpg', 20);
INSERT INTO Coffee (name, description, category_id, price, image, on_stock)
VALUES ('Frapp Avelã', 'Base de creme, base de café, syrup de avelã, leite integral e gelo.
Cobertura: chantilly e cacau polvilhado.', 9 ,20.90,
        'https://static.ifood-static.com.br/image/upload/t_medium/pratos/1ac647da-b7e0-4d92-b380-cb2e42f38fef/202407031752_GF3I_i.jpg', 20);
INSERT INTO Coffee (name, description, category_id, price, image, on_stock)
VALUES ('Frapp Red G', 'Base de creme, syrup de morango, leite integral e gelo.
Cobertura: chantilly, calda de morango', 9 ,20.90,
        'https://static.ifood-static.com.br/image/upload/t_medium/pratos/5d6f3b03-8a95-43be-ba05-0fec8bf56466/202205051049_67R4_i.jpg', 20);

