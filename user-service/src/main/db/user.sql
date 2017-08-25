/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.7.16-log : Database - user
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`user` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `user`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `account_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(128) NOT NULL,
  `first_name` varchar(128) DEFAULT NULL,
  `last_name` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `account` */

/*Table structure for table `userconnection` */

DROP TABLE IF EXISTS `userconnection`;

CREATE TABLE `userconnection` (
  `userId` varchar(255) NOT NULL,
  `providerId` varchar(255) NOT NULL,
  `providerUserId` varchar(255) NOT NULL,
  `rank` int(11) NOT NULL,
  `displayName` varchar(255) DEFAULT NULL,
  `profileUrl` varchar(512) DEFAULT NULL,
  `imageUrl` varchar(512) DEFAULT NULL,
  `accessToken` varchar(512) NOT NULL,
  `secret` varchar(512) DEFAULT NULL,
  `refreshToken` varchar(512) DEFAULT NULL,
  `expireTime` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`userId`,`providerId`,`providerUserId`),
  UNIQUE KEY `UserConnectionRank` (`userId`,`providerId`,`rank`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `userconnection` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
