CREATE TABLE IF NOT EXISTS `customers` (
  `customer_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(60) NOT NULL,
  `last_name` VARCHAR(60) NOT NULL,
  `email` VARCHAR(90) NOT NULL,
  `phone_number` VARCHAR(30) NOT NULL,
  `address1` VARCHAR(90) NULL,
  `address2` VARCHAR(90) NULL,
  `pin_code` VARCHAR(6) NULL,
  `status` VARCHAR(45) NULL,
  `ok_to_contact` CHAR(1) NOT NULL DEFAULT 'Y',
  PRIMARY KEY (`customer_id`))
ENGINE = InnoDB;

grant all on customers to 'java_user'@'localhost';
