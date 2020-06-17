CREATE TABLE IF NOT EXISTS `t_company` (
`id` INTEGER  PRIMARY KEY AUTO_INCREMENT,
`company_name` VARCHAR(50) NOT NULL,
`turnover` DECIMAL,
`ceo` VARCHAR(50),
`board_directors` VARCHAR(255),
`listed_ses` VARCHAR(50),
`sector_code` VARCHAR(50),
`stock_codes` VARCHAR(50),
`brief` VARCHAR(255)
);