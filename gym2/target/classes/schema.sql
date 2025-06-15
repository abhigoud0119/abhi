CREATE TABLE IF NOT EXISTS member (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    number VARCHAR(255),
    membership_type VARCHAR(255),
    membership_expiry DATE
);
