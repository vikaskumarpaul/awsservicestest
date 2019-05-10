create table if not exists Reel
(
  ID CHAR(30) PRIMARY KEY,
  deviceQuantity INTEGER NOT NULL,
  packageState packagestate_enum,
  siteId VARCHAR (50) NOT NULL,
  productTypeId char(12) NOT NULL,
  FOREIGN KEY (productTypeId) references ProductType(ID),
  customerId bigint NOT NULL,
  FOREIGN KEY (customerId) references Customer(ID)
)