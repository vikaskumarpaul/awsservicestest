create table if not exists customer
(
  id BIGSERIAL primary key,
  uniqueCustomerId varchar(255) unique not null,
  companyName VARCHAR(255),
  contactName VARCHAR(255),
  unique_contactEmail VARCHAR(255) not null unique,
  uniqueHsmPublicKeyId varchar(255) unique,
  publicKey bytea,
  publicKeyConfirmed BOOLEAN
);
