-- keep the highest device group per 12nc/productType on file for generating new device groups
create table if not exists deviceGroupCounter
(
  productTypeId char(12) primary key,
  groupCounter BIGINT,
  FOREIGN KEY (productTypeId) references ProductType(ID)
);

-- not creating a technical primary key instead because it causes unnecessary lookups on each device entry
-- using a composite primary key across productType (nc12) and deviceGroup to make handling in references easier
-- assuming that the deviceGroup is owned by the customer not by a single user
create table if not exists deviceGroup
(
  productTypeId char(12),
  deviceGroupId bigint,
  customerId bigint,
  label varchar(256),
  primary key (productTypeId, deviceGroupId),
  FOREIGN KEY (productTypeId) references ProductType(ID),
  FOREIGN KEY (customerId) references customer(ID)
);






