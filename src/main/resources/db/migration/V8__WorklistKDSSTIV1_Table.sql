create table if not exists WorklistKDSSTIV0
(
  keyFetchGuardTime timestamp with time zone,
  keyFetchExpiryTime timestamp with time zone,
  fetchState fetchstate_enum,
  lastStateUpdate timestamp with time zone,
  keySetIndex integer,
  deviceId char(36) primary key,
  FOREIGN KEY (deviceId) references Device(ID)
)