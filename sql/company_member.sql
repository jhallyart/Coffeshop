-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: company
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `memberno` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `sum` int DEFAULT NULL,
  PRIMARY KEY (`memberno`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'Elly Wang','abc','0000','25816196','大安',32560),(2,'Emma Chiu','abc','1111','25346745','信義',8800),(3,'Jhally Chiu','abc','2222','25743838','中正',4998),(4,'Megan Ma','def','3333','25964532','松山',86740),(5,'Mike Lin','def','4444','25730012','內湖',89030),(6,'Garry Lin','def','5555','25864567','中和',56350),(7,'Orange Chen','def','6666','25443423','板橋',25350),(8,'Evance Li','abs','0000','26598344','萬華',38440),(9,'Tom Wu','abs','1111','27553048','北投',34800),(10,'George Chou','abs','2222','29875454','淡水',96530),(11,'Judy Cheng','abs','3333','28764587','三峽',45240),(12,'Milk Liao','abs','4444','22345433','林口',89440),(13,'Joyful Chen','uuu','0000','25434225','土城',25350),(14,'Ning Hon','uuu','1111','24543344','中山',25370),(15,'Pretty Huang','uuu','2222','25356654','大同',78530),(16,'Joyce Wang','uuu','3333','25098901','文山',96530),(17,'May Lin','uuu','4444','25767788','樹林',23560),(18,'Michael Chao','ref','1111','25645109','永和',76430),(19,'Ruby Bao','ref','2222','25782674','新店',65830),(20,'Pin Yang','ref','3333','25490123','土城',23570),(21,'Penny Ho','ref','4444','25895979','萬里',88680),(22,'Jhon Chiang','ref','5555','25798900','金山',76430),(23,'Yvone Liu','ref','6666','25980690','石碇',45780),(24,'Sayaka Liu','ref','7777','25367879','內湖',23250),(25,'Clair Yang','ccc','1234','0922737868','New York',8880);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-13  9:38:53
