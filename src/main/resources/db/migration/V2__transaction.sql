CREATE TABLE Transaction
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    date VARCHAR(255) NOT NULL,
    account_number INTEGER NOT NULL,
    amount DOUBLE PRECISION NOT NULL,
    type_of_operation VARCHAR(255) NOT NULL,
    CONSTRAINT PK_Transaction PRIMARY KEY (id)
);
