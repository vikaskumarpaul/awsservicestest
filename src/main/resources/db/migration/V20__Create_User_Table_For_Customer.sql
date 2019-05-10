create table if not exists users
(
  id BIGSERIAL primary key,
  firstname VARCHAR(255),
  lastname VARCHAR(255),
  email VARCHAR(255),
  userId VARCHAR(255),
  tncmetaData varchar(256),
  customerId bigint NOT NULL,
  FOREIGN KEY (customerId) references customer(ID)
)
