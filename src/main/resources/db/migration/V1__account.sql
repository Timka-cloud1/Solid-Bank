create TABLE Account
(
    account_full_id VARCHAR(255) NOT NULL,
    account_type VARCHAR(255) NOT NULL,
    bank_id INTEGER NOT NULL,
    client_id VARCHAR(255) NOT NULL,
    balance DOUBLE PRECISION NOT NULL,
    withdraw_allowed BIT NOT NULL,
    CONSTRAINT PK_Account PRIMARY KEY (account_full_id)
);

-- INSERT INTO Account values ('001000001', 'FIXED', 1, '1',  0.0, true);
-- INSERT INTO Account values ('001000002', 'SAVING', 1, '1',  0.0, true);

