
CREATE TABLE IF NOT EXISTS cliente (
    id SERIAL,
    nickname VARCHAR(100) NOT NULL,
    full_name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    status  BOOLEAN,
    PRIMARY KEY (id)
);

