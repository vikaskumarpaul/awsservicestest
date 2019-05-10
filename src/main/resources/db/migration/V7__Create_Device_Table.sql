create table if not exists device
(
  ID CHAR(36) PRIMARY KEY,
  batchId CHAR(30),
  productTypeId CHAR(12)  not null,
  waferId CHAR(30),
  reelId CHAR(30),
  trayId CHAR(30),
  FOREIGN KEY (productTypeId) references ProductType(ID),
  FOREIGN KEY (waferId) references WAFER(ID),
  FOREIGN KEY (reelId) references REEL(ID),
  FOREIGN KEY (trayId) references TRAY(ID),
  customerId bigint NOT NULL,
  FOREIGN KEY (customerId) references Customer(ID)
)

