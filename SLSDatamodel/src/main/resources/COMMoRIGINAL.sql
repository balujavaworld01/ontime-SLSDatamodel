-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: comm
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `help_desk`
--

DROP TABLE IF EXISTS `help_desk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `help_desk` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `number` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `help_desk`
--

LOCK TABLES `help_desk` WRITE;
/*!40000 ALTER TABLE `help_desk` DISABLE KEYS */;
INSERT INTO `help_desk` VALUES (1,'SOULSTICE.CO.ZA','SANTHOSH','9652035706');
/*!40000 ALTER TABLE `help_desk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `languages`
--

DROP TABLE IF EXISTS `languages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `languages` (
  `id` varchar(255) NOT NULL,
  `language` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `languages`
--

LOCK TABLES `languages` WRITE;
/*!40000 ALTER TABLE `languages` DISABLE KEYS */;
INSERT INTO `languages` VALUES ('1','Arabic','ar'),('10','Marathi','mr'),('11','Nepali','ne'),('12','Oriya','or'),('13','Persian','fa'),('14','Punjabi','pa'),('15','Russian','ru'),('16','Sanskrit','sa'),('17','Serbian','sr'),('18','Sinhalese','si'),('19','Tamil','ta'),('2','Bengali','bn'),('20','Telugu','te'),('21','Urdu','ur'),('3','Chinese','zh'),('4','English','en'),('5','Greek','el'),('6','Gujarati','gu'),('7','Hindi','hi'),('8','Kannada','kn'),('9','Malayalam','ml');
/*!40000 ALTER TABLE `languages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `roleId` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Admin'),(2,'SuperUser'),(3,'User');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `smpp_provider`
--

DROP TABLE IF EXISTS `smpp_provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `smpp_provider` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ipAddress` varchar(255) DEFAULT NULL,
  `isRXStarted` bit(1) DEFAULT NULL,
  `isTXStarted` bit(1) DEFAULT NULL,
  `maxRxSessions` int(11) NOT NULL,
  `maxTxSessions` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `port` int(11) NOT NULL,
  `route` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smpp_provider`
--

LOCK TABLES `smpp_provider` WRITE;
/*!40000 ALTER TABLE `smpp_provider` DISABLE KEYS */;
INSERT INTO `smpp_provider` VALUES (1,'103.60.214.180','\0','\0',4,4,'MTN','venki',34567,'TR','ACTIVE','venki'),(2,'103.60.214.180','\0','\0',4,4,'MTN','venki',34567,'PR','ACTIVE','venki'),(3,'103.60.214.180','\0','\0',4,4,'VFIRST','venki',34568,'TR','ACTIVE','venki'),(4,'103.60.214.180','\0','\0',4,4,'VFIRST','venki',34568,'PR','ACTIVE','venki'),(5,'103.60.214.180','\0','\0',4,4,'UNICEL','venki',34569,'TR','ACTIVE','venki'),(6,'103.60.214.180','\0','\0',4,4,'UNICEL','venki',34569,'PR','ACTIVE','venki');
/*!40000 ALTER TABLE `smpp_provider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sms_data`
--

DROP TABLE IF EXISTS `sms_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sms_data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cost` double NOT NULL,
  `insertedTime` datetime DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `message` longtext,
  `messageCount` bigint(20) NOT NULL,
  `messageType` varchar(255) DEFAULT NULL,
  `mobileNumber` varchar(255) DEFAULT NULL,
  `provider` varchar(255) DEFAULT NULL,
  `senderId` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `orderId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKonqasxuemn66c6trntmtit3vy` (`userId`),
  KEY `FKexrx3xk896a0osy67l7rtiv5l` (`orderId`),
  CONSTRAINT `FKexrx3xk896a0osy67l7rtiv5l` FOREIGN KEY (`orderId`) REFERENCES `user_orders` (`orderId`),
  CONSTRAINT `FKonqasxuemn66c6trntmtit3vy` FOREIGN KEY (`userId`) REFERENCES `user_` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sms_data`
--

LOCK TABLES `sms_data` WRITE;
/*!40000 ALTER TABLE `sms_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `sms_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_`
--

DROP TABLE IF EXISTS `user_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_` (
  `userId` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `companyName` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `emailAddress` varchar(255) DEFAULT NULL,
  `emailVerified` bit(1) DEFAULT NULL,
  `failedLoginAttempts` bigint(20) NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `gcmUserId` varchar(255) DEFAULT NULL,
  `imeiNumber` varchar(255) DEFAULT NULL,
  `lastLoggedInIp` varchar(255) DEFAULT NULL,
  `lastLoginDate` datetime DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `loginIp` varchar(255) DEFAULT NULL,
  `logoutDate` datetime DEFAULT NULL,
  `make` varchar(255) DEFAULT NULL,
  `makeModel` varchar(255) DEFAULT NULL,
  `middleName` varchar(255) DEFAULT NULL,
  `mobileAppId` varchar(255) DEFAULT NULL,
  `osType` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `passwordModifiedDate` datetime DEFAULT NULL,
  `passwordUpdated` bit(1) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  `requestSource` varchar(255) DEFAULT NULL,
  `selfRegistration` bit(1) DEFAULT NULL,
  `smartPhone` bit(1) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `tGcmUserId` varchar(255) DEFAULT NULL,
  `tImeiNumber` varchar(255) DEFAULT NULL,
  `tOtacValidated` bit(1) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `tokenCreatedDateTime` datetime DEFAULT NULL,
  `tokenExpiryDateTime` datetime DEFAULT NULL,
  `userCreatedDate` datetime DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `userType` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  `roleId` bigint(20) DEFAULT NULL,
  `createdBy` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  KEY `FKi404nmenndfph0dv7gclvq6sb` (`roleId`),
  KEY `FKhvoynl0n43jr4kofiujxkvs58` (`createdBy`),
  CONSTRAINT `FKhvoynl0n43jr4kofiujxkvs58` FOREIGN KEY (`createdBy`) REFERENCES `user_` (`userId`),
  CONSTRAINT `FKi404nmenndfph0dv7gclvq6sb` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_`
--

LOCK TABLES `user_` WRITE;
/*!40000 ALTER TABLE `user_` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_account`
--

DROP TABLE IF EXISTS `user_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `balance` double NOT NULL,
  `balanceAddedByUserId` bigint(20) NOT NULL,
  `balanceAddedDate` datetime DEFAULT NULL,
  `balanceUpdatedDate` datetime DEFAULT NULL,
  `defaultSMPPProvider` varchar(255) DEFAULT NULL,
  `expiryDate` datetime DEFAULT NULL,
  `pricePerSms` double NOT NULL,
  `routeType` varchar(255) DEFAULT NULL,
  `taxAmount` double NOT NULL,
  `userId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmq6ujc3fhc4h8guiujt6gb3v7` (`userId`),
  CONSTRAINT `FKmq6ujc3fhc4h8guiujt6gb3v7` FOREIGN KEY (`userId`) REFERENCES `user_` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_account`
--

LOCK TABLES `user_account` WRITE;
/*!40000 ALTER TABLE `user_account` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_account_history`
--

DROP TABLE IF EXISTS `user_account_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_account_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accountType` bigint(20) NOT NULL,
  `balance` double NOT NULL,
  `balanceAddedByUserId` bigint(20) NOT NULL,
  `balanceAddedDate` datetime DEFAULT NULL,
  `expiryDate` datetime DEFAULT NULL,
  `invoiceNumber` varchar(255) NOT NULL,
  `orderNumber` varchar(255) DEFAULT NULL,
  `pricePerSms` double NOT NULL,
  `taxAmmount` double NOT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_account_history`
--

LOCK TABLES `user_account_history` WRITE;
/*!40000 ALTER TABLE `user_account_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_account_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_messages`
--

DROP TABLE IF EXISTS `user_messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_messages` (
  `id` int(11) NOT NULL,
  `message` longtext,
  `savedDateAndTime` datetime DEFAULT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_messages`
--

LOCK TABLES `user_messages` WRITE;
/*!40000 ALTER TABLE `user_messages` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_orders`
--

DROP TABLE IF EXISTS `user_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_orders` (
  `orderId` bigint(20) NOT NULL AUTO_INCREMENT,
  `campaignName` varchar(255) DEFAULT NULL,
  `message` longtext,
  `numberOfRequests` bigint(20) NOT NULL,
  `operatorName` varchar(255) DEFAULT NULL,
  `orderDate` datetime DEFAULT NULL,
  `scheduleStatus` varchar(255) DEFAULT NULL,
  `scheduledDate` datetime DEFAULT NULL,
  `sentFrom` varchar(255) DEFAULT NULL,
  `userIp` varchar(255) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  KEY `FKkctg65mwhrp6ymg8qbedvtw8x` (`userId`),
  CONSTRAINT `FKkctg65mwhrp6ymg8qbedvtw8x` FOREIGN KEY (`userId`) REFERENCES `user_` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_orders`
--

LOCK TABLES `user_orders` WRITE;
/*!40000 ALTER TABLE `user_orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_phonebook`
--

DROP TABLE IF EXISTS `user_phonebook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_phonebook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createdDate` datetime DEFAULT NULL,
  `createdUserId` varchar(255) NOT NULL,
  `emailId` varchar(255) NOT NULL,
  `groupId` int(11) NOT NULL,
  `mobileNumber` varchar(55) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `phonebookGroupName` varchar(255) DEFAULT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_phonebook`
--

LOCK TABLES `user_phonebook` WRITE;
/*!40000 ALTER TABLE `user_phonebook` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_phonebook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_phonebook_group`
--

DROP TABLE IF EXISTS `user_phonebook_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_phonebook_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createdDate` datetime NOT NULL,
  `createdUserId` int(11) NOT NULL,
  `groupName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_phonebook_group`
--

LOCK TABLES `user_phonebook_group` WRITE;
/*!40000 ALTER TABLE `user_phonebook_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_phonebook_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_sub_order`
--

DROP TABLE IF EXISTS `user_sub_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_sub_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) NOT NULL,
  `elapsedTime` varchar(255) DEFAULT NULL,
  `endDateAndTime` varchar(255) DEFAULT NULL,
  `fromOrderNumber` varchar(255) DEFAULT NULL,
  `orderId` varchar(255) DEFAULT NULL,
  `startDateAndTime` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `submittedCount` varchar(255) DEFAULT NULL,
  `threadName` varchar(255) DEFAULT NULL,
  `toOrderNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_sub_order`
--

LOCK TABLES `user_sub_order` WRITE;
/*!40000 ALTER TABLE `user_sub_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_sub_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_support`
--

DROP TABLE IF EXISTS `user_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_support` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(255) NOT NULL,
  `createdDate` datetime DEFAULT NULL,
  `emailId` varchar(255) NOT NULL,
  `request` varchar(55) DEFAULT NULL,
  `requestType` varchar(255) NOT NULL,
  `resolvedDate` datetime DEFAULT NULL,
  `resolvedUserId` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `userId` int(11) NOT NULL,
  `tokendetails` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_support`
--

LOCK TABLES `user_support` WRITE;
/*!40000 ALTER TABLE `user_support` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_support` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_template`
--

DROP TABLE IF EXISTS `user_template`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `approved` bit(1) NOT NULL,
  `approvedDateAndTime` datetime DEFAULT NULL,
  `approvedUserId` bigint(20) NOT NULL,
  `template` varchar(255) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_template`
--

LOCK TABLES `user_template` WRITE;
/*!40000 ALTER TABLE `user_template` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_template` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_sendor_id`
--

DROP TABLE IF EXISTS `users_sendor_id`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_sendor_id` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `approved` bit(1) NOT NULL,
  `approvedDateAndTIme` datetime DEFAULT NULL,
  `approvedUserId` bigint(20) NOT NULL,
  `senderId` varchar(255) DEFAULT NULL,
  `userId` bigint(20) NOT NULL,
  `sendorId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_sendor_id`
--

LOCK TABLES `users_sendor_id` WRITE;
/*!40000 ALTER TABLE `users_sendor_id` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_sendor_id` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'comm'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-22 12:33:12
