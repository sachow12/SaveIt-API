CREATE TABLE IF NOT EXISTS financial_register (
    id BIGINT NOT NULL AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    monthly_income DOUBLE PRECISION,
    expenses DOUBLE PRECISION,
    bonus DOUBLE PRECISION,
    is_unexpected BOOLEAN,
    category VARCHAR(255),
    action_date TIMESTAMP,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    code BIGINT,
    PRIMARY KEY(id),
    CONSTRAINT fk_user FOREIGN KEY(user_id) REFERENCES user(id)
    );
