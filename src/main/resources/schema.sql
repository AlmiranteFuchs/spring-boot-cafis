CREATE TABLE UserEntity
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    balance DECIMAL(10,2)
);

CREATE TABLE Category
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    category_name    enum('cappuccino', 'mocha', 'americano', 'macchiato','cortado', 'latte', 'espresso', 'affogato', 'frappe')
);

CREATE TABLE Coffee
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    image       VARCHAR(255),
    price       DECIMAL(10,2),
    category_id BIGINT not null,
    on_stock    INT not null,
    constraint category_coffee foreign key (category_id) references Category (id)
--     category    ENUM('cappuccino', 'mocha', 'americano', 'macchiato','cortado', 'latte', 'espresso', 'affogato', 'frappe')
);


