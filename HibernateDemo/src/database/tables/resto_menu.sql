CREATE TABLE IF NOT EXISTS `resto`.`resto_menu` (
  `menu_id` INT(11) NOT NULL AUTO_INCREMENT,
  `category` VARCHAR(30) NOT NULL,
  `name` VARCHAR(120) NULL DEFAULT NULL,
  `description` VARCHAR(4000) NOT NULL,
  `image` VARCHAR(200) NULL DEFAULT NULL,
  `serving_size` VARCHAR(120) NULL DEFAULT NULL,
  `price` DECIMAL(8,2) NOT NULL,
  `active_ind` CHAR(1) NULL DEFAULT NULL,
  `recipe_id` INT(11) NULL DEFAULT NULL,
  `restaurant_special_ind` CHAR(1) NULL DEFAULT NULL,
  `vegetarian_ind` CHAR(1) NULL DEFAULT NULL,
  `notes` VARCHAR(4000) NULL DEFAULT NULL,
  PRIMARY KEY (`menu_id`))
ENGINE = InnoDB;


grant all on resto_menu to 'java_user'@'localhost';
