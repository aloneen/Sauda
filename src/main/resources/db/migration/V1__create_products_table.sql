CREATE TABLE IF NOT EXISTS products (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    price INT NOT NULL,
    city VARCHAR(255),
    author VARCHAR(255)
);

INSERT INTO products (title, description, price, city, author) VALUES
('Ноутбук Lenovo', 'Мощный ноутбук для работы и учебы', 250000, 'Алматы', 'Иван Иванов'),
('Смартфон Samsung', 'Новый смартфон с отличной камерой', 180000, 'Нур-Султан', 'Алия Каримова'),
('Велосипед Merida', 'Горный велосипед, почти новый', 120000, 'Шымкент', 'Бауыржан Ахметов');
