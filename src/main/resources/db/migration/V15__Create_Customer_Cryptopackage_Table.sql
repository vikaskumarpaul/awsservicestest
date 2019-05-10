create table if not exists customer_cryptopackage
(
  deviceId char(36) primary key,
  type cryptopackage_types,
  cryptoData bytea,
  checkSum bytea,
  hsmKey varchar(20),
  s3location varchar(255),
  FOREIGN KEY (deviceId) references Device(ID)
)