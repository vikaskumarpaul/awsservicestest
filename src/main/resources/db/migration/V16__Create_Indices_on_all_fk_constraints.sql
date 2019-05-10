create index customer_certificate_device_index on customer_certificate (deviceid);
create index customer_certificate_name_index on customer_certificate (name);

create index customer_publickey_device_index on customer_publickey (deviceid);
create index customer_publickey_name_index on customer_publickey (name);

create index customer_symmetrickey_device_index on customer_symmetrickey (deviceid);
create index customer_symmetrickey_name_index on customer_symmetrickey (name);

create index iothub_certificate_device_index on iothub_certificate (deviceid);
create index iothub_certificate_name_index on iothub_certificate (name);

create index device_customerid_fk_index on device (customerid);
create index device_producttype_fk_index on device (producttypeid);
create index device_waferid_fk_index on device (waferid);
create index device_reelid_fk_index on device (reelid);
create index device_trayid_fk_index on device (trayid);

create index producttype_customerid_fkey_index on producttype (customerid);

create index reel_customerid_fkey_index on reel (customerid);
create index reel_producttypeidid_fkey_index on reel (producttypeid);
create index tray_customerid_fkey_index on tray (customerid);
create index tray_producttypeidid_fkey_index on tray (producttypeid);
create index wafer_customerid_fkey_index on wafer (customerid);
create index wafer_producttypeidid_fkey_index on wafer (producttypeid);

