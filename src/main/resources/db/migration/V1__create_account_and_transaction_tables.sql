CREATE table Account
(
    id               NVARCHAR(40) not null,
    account_type     NVARCHAR(40) not null,
    client_id        NVARCHAR(40) not null,
    balance          bigint default 0,
    withdraw_Allowed Bit          not null,
    PRIMARY KEY (id)
);
create table Transaction
(
    id               int AUTO_INCREMENT,
    amount           bigint       not null,
    transaction_type NVARCHAR(40) not null,
    PRIMARY KEY (id)
);
-- insert into Account
-- values ('1', 'FIXED', '007', '105', 0);