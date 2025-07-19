CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password_hashed VARCHAR(255) NOT NULL
);

INSERT INTO users (id, username, password_hashed) VALUES
(1, 'cdramales', '$2a$10$BFSmW5JdCeP0061yrxgY.uxiib2ggA.uXn.HAHjqxyg7VGIIPCetu'), -- contrasena-cesar
(2, 'rhvaldiviezo', '$2a$10$7msY/2bg4XZOzRSV8vUDCOHxvEQBSjpN6o87G9B0uXo6CBCvSoMvS'), -- contrasena-rommel
(3, 'lvegap', '$2a$10$zmr9e/RyZITPmatGUgGaF.W8bfQUF6ageqgyET.jY55T.BjG0E9sC'); -- contrasena-leonardo