CREATE TABLE IF NOT EXISTS `awsservicestest`.`users` (
  `username` VARCHAR(256) NOT NULL,
  `password` VARCHAR(256) NOT NULL,
  `enabled` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`username`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);

CREATE TABLE IF NOT EXISTS `awsservicestest`.`authorities` (
  `username` VARCHAR(256) NOT NULL,
  `authority` VARCHAR(256) NOT NULL DEFAULT 'default',
  PRIMARY KEY (`username`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE,
  CONSTRAINT `username_fk`
    FOREIGN KEY (`username`)
    REFERENCES `awsservicestest`.`users` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);