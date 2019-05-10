create table if not exists iothub_certificate
(
  deviceId char(36) not null,
  name varchar(255) not null,
  type certificate_types,
  certData bytea,
  checkSum bytea,
  hsmKey varchar(20),
  s3location varchar(255),
  primary key (deviceId, name),
  FOREIGN KEY (deviceId) references Device(ID)
)