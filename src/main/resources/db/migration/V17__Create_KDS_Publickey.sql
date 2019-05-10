create table if not exists kds_publickey
(
  deviceId char(36) not null,
  name varchar(255) not null,
  type publickey_types,
  keyData bytea,
  checkSum bytea,
  hsmKey varchar(20),
  s3location varchar(255),
  primary key (deviceId, name),
  FOREIGN KEY (deviceId) references Device(ID)
)
