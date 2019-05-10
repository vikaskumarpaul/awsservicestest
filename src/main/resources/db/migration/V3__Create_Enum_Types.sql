create type packagestate_enum as enum ('NEW', 'ID_LIST_COMPLETED','KEK_FETCH_IN_PROGRESS', 'KEK_FETCHED', 'KEYS_PROVISIONED','ZIPPING_IN_PROGRESS', 'ZIPPED', 'READY_FOR_USE', 'EOL');
create type fetchstate_enum as enum ('NEW', 'IN_PROGRESS', 'RETRIEVED', 'CONFIRMATION_IN_PROGRESS', 'CONFIRMED', 'REENCRYPTION_IN_PROGRESS', 'REENCRYPTED');
create type publickey_types as enum ('ECC256p', 'ECC384p', 'ECC512p', 'ED256','ED384', 'ED512', 'BC160', 'BC512', 'RSA1024', 'RSA2048', 'RSA4096');
create type symmetrickey_types as enum ('AES128', 'AES192', 'AES256', 'DES3K3', 'DES2K2', 'DES1K3');
create type certificate_types as enum ('X509');
create type cryptopackage_types as enum ('GnuPGP');
create type user_role as enum ('IOTHUB_Admin', 'Customer_Admin', 'Customer');
