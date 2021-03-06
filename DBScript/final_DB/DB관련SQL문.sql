-- -----------------------------------------------------
-- Schema happyhouse
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `happyhouse` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `happyhouse` ;

-- -----------------------------------------------------
-- Table `happyhouse`.`baseaddress`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `happyhouse`.`baseaddress` ;

CREATE TABLE IF NOT EXISTS `happyhouse`.`baseaddress` (
  `no` INT(11) NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(30) NOT NULL,
  `code` VARCHAR(30) NULL DEFAULT NULL,
  `dongcode` VARCHAR(30) NULL DEFAULT NULL,
  `gugun` VARCHAR(30) NULL DEFAULT NULL,
  `dong` VARCHAR(30) NOT NULL,
  `lat` VARCHAR(20) NULL DEFAULT NULL,
  `lng` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB
AUTO_INCREMENT = 20529
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `happyhouse`.`housedeal`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `happyhouse`.`housedeal` ;

CREATE TABLE IF NOT EXISTS `happyhouse`.`housedeal` (
  `no` INT(11) NOT NULL AUTO_INCREMENT,
  `dong` VARCHAR(30) NOT NULL,
  `AptName` VARCHAR(50) NOT NULL,
  `code` VARCHAR(30) NOT NULL,
  `dealAmount` VARCHAR(50) NOT NULL,
  `buildYear` VARCHAR(30) NULL DEFAULT NULL,
  `dealYear` VARCHAR(30) NULL DEFAULT NULL,
  `dealMonth` VARCHAR(30) NULL DEFAULT NULL,
  `dealDay` VARCHAR(30) NULL DEFAULT NULL,
  `area` VARCHAR(30) NULL DEFAULT NULL,
  `floor` VARCHAR(30) NULL DEFAULT NULL,
  `jibun` VARCHAR(30) NULL DEFAULT NULL,
  `type` VARCHAR(30) NULL DEFAULT NULL,
  `rentMoney` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB
AUTO_INCREMENT = 68865
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `happyhouse`.`houseinfo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `happyhouse`.`houseinfo` ;

CREATE TABLE IF NOT EXISTS `happyhouse`.`houseinfo` (
  `no` INT(11) NOT NULL AUTO_INCREMENT,
  `dong` VARCHAR(30) NOT NULL,
  `AptName` VARCHAR(50) NOT NULL,
  `code` VARCHAR(30) NOT NULL,
  `buildYear` VARCHAR(30) NULL DEFAULT NULL,
  `jibun` VARCHAR(30) NULL DEFAULT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  `img` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB
AUTO_INCREMENT = 5996
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`publicbicycle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`publicbicycle` (
  `no` INT(11) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `gugun` VARCHAR(30) NOT NULL,
  `address` VARCHAR(50) NOT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`school`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`school` (
  `SCHUL_KND_SC_NM` VARCHAR(30) NULL DEFAULT NULL,
  `FOND_SC_NM` VARCHAR(30) NULL DEFAULT NULL,
  `SD_SCHUL_CODE` VARCHAR(30) NULL DEFAULT NULL,
  `SCHUL_NM` VARCHAR(30) NOT NULL,
  `ORG_TELNO` VARCHAR(30) NULL DEFAULT NULL,
  `HMPG_ADRES` VARCHAR(30) NULL DEFAULT NULL,
  `COEDU_SC_NM` VARCHAR(30) NULL DEFAULT NULL,
  `HS_GNRL_BUSNS_SC_NM` VARCHAR(30) NULL DEFAULT NULL,
  `SPCLY_PURPS_HS_ORD_NM` VARCHAR(30) NULL DEFAULT NULL,
  `address` VARCHAR(50) NULL DEFAULT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`SCHUL_NM`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`kindergarten`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`kindergarten` (
  `name` VARCHAR(30) NOT NULL,
  `ESTABLISH` VARCHAR(30) NULL DEFAULT NULL,
  `address` VARCHAR(50) NULL DEFAULT NULL,
  `telno` VARCHAR(30) NULL DEFAULT NULL,
  `HPADDR` VARCHAR(30) NULL DEFAULT NULL,
  `OPERTIME` VARCHAR(30) NULL DEFAULT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`culturalspace`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`culturalspace` (
  `no` INT(11) NOT NULL,
  `subject` VARCHAR(30) NULL DEFAULT NULL,
  `name` VARCHAR(30) NULL DEFAULT NULL,
  `address` VARCHAR(50) NULL DEFAULT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  `telno` VARCHAR(30) NULL DEFAULT NULL,
  `webpage` VARCHAR(100) NULL DEFAULT NULL,
  `time` VARCHAR(30) NULL DEFAULT NULL,
  `price` VARCHAR(30) NULL DEFAULT NULL,
  `close` VARCHAR(30) NULL DEFAULT NULL,
  `img` VARCHAR(100) NULL DEFAULT NULL,
  `imformation` VARCHAR(500) NULL DEFAULT NULL,
  `free` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`library`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`library` (
  `code` INT(11) NULL DEFAULT NULL,
  `name` VARCHAR(30) NOT NULL,
  `gugun` VARCHAR(30) NULL DEFAULT NULL,
  `address` VARCHAR(50) NULL DEFAULT NULL,
  `telno` VARCHAR(30) NULL DEFAULT NULL,
  `webpage` VARCHAR(100) NULL DEFAULT NULL,
  `time` VARCHAR(30) NULL DEFAULT NULL,
  `close` VARCHAR(30) NULL DEFAULT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`commercialzone`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`commercialzone` (
  `name` VARCHAR(30) NOT NULL,
  `citycode` VARCHAR(30) NULL DEFAULT NULL,
  `dongcode` VARCHAR(50) NULL DEFAULT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`population`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`population` (
  `gugun` VARCHAR(30) NULL DEFAULT NULL,
  `dong` VARCHAR(30) NULL DEFAULT NULL,
  `population` VARCHAR(50) NULL DEFAULT NULL,
  `movein` VARCHAR(30) NULL DEFAULT NULL,
  `moveout` VARCHAR(30) NULL DEFAULT NULL,
  `oneperson` VARCHAR(30) NULL DEFAULT NULL,
  `twoperson` VARCHAR(30) NULL DEFAULT NULL,
  `threeperson` VARCHAR(30) NULL DEFAULT NULL,
  `fourperson` VARCHAR(30) NULL DEFAULT NULL,
  `fiveperson` VARCHAR(30) NULL DEFAULT NULL,
  `sixperson` VARCHAR(30) NULL DEFAULT NULL,
  `sevenperson` VARCHAR(30) NULL DEFAULT NULL,
  `eightperson` VARCHAR(30) NULL DEFAULT NULL,
  `nineperson` VARCHAR(30) NULL DEFAULT NULL,
  `tenperson` VARCHAR(30) NULL DEFAULT NULL
  )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`member`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`member` (
  `userid` VARCHAR(16) NOT NULL,
  `username` VARCHAR(30) NOT NULL,
  `userpwd` VARCHAR(30) NOT NULL,
  `phone` VARCHAR(30) NULL DEFAULT NULL,
  `email` VARCHAR(30) NULL DEFAULT NULL,
  `joindate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`userid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`question`
-- -----------------------------------------------------
drop table if exists happyhouse.question, happyhouse.answer;

CREATE TABLE IF NOT EXISTS happyhouse.question (
  qnaNum INT NOT NULL AUTO_INCREMENT,
  queTitle VARCHAR(45) NOT NULL,
  queContent VARCHAR(1000) NOT NULL,
  queTime timestamp NOT NULL default current_timestamp,
  userid VARCHAR(16) NOT NULL,
  PRIMARY KEY (qnaNum),
  INDEX question_userid_fk_idx (userid ASC) VISIBLE,
  CONSTRAINT question_userid_fk
    FOREIGN KEY (userid)
    REFERENCES happyhouse.member (userid)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB CHARACTER SET = utf8;

CREATE TABLE `question` (
  `qnaNum` INT NOT NULL AUTO_INCREMENT,
  `queTitle` VARCHAR(45) NOT NULL,
  `queContent` VARCHAR(1000) NOT NULL,
  `queTime` timestamp NOT NULL default current_timestamp,
  `userid` VARCHAR(16) NOT NULL,
  PRIMARY KEY (`qnaNum`)
  )
  ENGINE = InnoDB CHARACTER SET = utf8;
  
select * from happyhouse.question;
insert into happyhouse.question(quetitle,quecontent,userid)
values('????????????','????????????','ssafy');

-- -----------------------------------------------------
-- Table `happyhouse`.`answer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS happyhouse.answer (
  qnaNum INT NOT NULL,
  ansNum INT NOT NULL AUTO_INCREMENT,
  ansContent VARCHAR(1000) NOT NULL,
  userid VARCHAR(16) NOT NULL,
  ansTime timestamp NOT NULL default current_timestamp,
  INDEX answer_qnaNum_fk_idx (qnaNum ASC) VISIBLE,
  INDEX answer_userid_fk_idx (userid ASC) VISIBLE,
  PRIMARY KEY (ansNum, qnaNum),
  CONSTRAINT answer_qnaNum_fk
    FOREIGN KEY (qnaNum)
    REFERENCES happyhouse.question (qnaNum)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT answer_userid_fk
    FOREIGN KEY (userid)
    REFERENCES happyhouse.member (userid)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB CHARACTER SET = utf8;

CREATE TABLE `answer` (
  `qnaNum` INT NOT NULL,
  `ansNum` INT NOT NULL AUTO_INCREMENT,
  `ansContent` VARCHAR(1000) NOT NULL,
  `userid` VARCHAR(16) NOT NULL,
  `ansTime` timestamp NOT NULL default current_timestamp,
  PRIMARY KEY (`ansNum`),
  CONSTRAINT `answer_qnaNum` FOREIGN KEY (`qnaNum`) REFERENCES `question` (`qnaNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- -----------------------------------------------------
-- Table `happyhouse`.`board`
-- -----------------------------------------------------
CREATE TABLE `board` (
  `bno` int NOT NULL AUTO_INCREMENT,
  `userid` varchar(16) NOT NULL,
  `btitle` varchar(100) NOT NULL,
  `bcontent` varchar(2000) NOT NULL,
  `bregtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`bno`)
  )
  ENGINE = InnoDB CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`comment`
-- -----------------------------------------------------
CREATE TABLE `comment` (
  `cno` int NOT NULL AUTO_INCREMENT,
  `bno` int NOT NULL,
  `userid` varchar(16) NOT NULL,
  `ccontent` varchar(2000) NOT NULL,
  `cregtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cno`),
  CONSTRAINT `comment_bno` FOREIGN KEY (`bno`) REFERENCES `board` (`bno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into comment(bno,userid,ccontent) values(1,'ssafy','test!!!!!');
  
-- -----------------------------------------------------
-- Table `happyhouse`.`notice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`notice` (
  `num` int NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(30) NOT NULL,
  `content` VARCHAR(2000) NOT NULL,
  `regtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`num`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`subway`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`subway` (
  `no` int NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `routename` VARCHAR(30) NULL DEFAULT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  `address` VARCHAR(50) NULL DEFAULT NULL,
  `telno` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `happyhouse`.`bus`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `happyhouse`.`bus` (
  `no` int NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `lng` VARCHAR(30) NULL DEFAULT NULL,
  `lat` VARCHAR(30) NULL DEFAULT NULL,
  `address` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`no`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;