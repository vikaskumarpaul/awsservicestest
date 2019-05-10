create table if not exists ProductType
(
  id CHAR(12) PRIMARY KEY,
  commercialName VARCHAR(255) NOT NULL,
  productManagerAccount VARCHAR(255) NOT NULL,
  hardwareDescriptor VARCHAR(255) NOT NULL,
  hardwareVersion VARCHAR(255) NOT NULL,
  softwareDescriptor VARCHAR(255) NOT NULL,
  softwareVersion VARCHAR(255) NOT NULL,
  customerId bigint NOT NULL,
  FOREIGN KEY (customerId) references customer(ID)
)

