CREATE TABLE reserved_cars (
    id UUID PRIMARY KEY NOT NULL,
    nome_interessado VARCHAR(255),
    telefone_interessado VARCHAR(255),
    marca VARCHAR(255),
    modelo VARCHAR(255),
    ano_fabricacao INTEGER,
    ano_modelo INTEGER,
    descricao VARCHAR(255),
    title VARCHAR(255),
    image VARCHAR(255),
    price INTEGER,
    car_id UUID REFERENCES cars(id)
);

