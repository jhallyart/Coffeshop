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
-- Table structure for table `staffno`
--

DROP TABLE IF EXISTS `staffno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staffno` (
  `id` int NOT NULL AUTO_INCREMENT,
  `staffno` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `passward` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `sum` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffno`
--

LOCK TABLES `staffno` WRITE;
/*!40000 ALTER TABLE `staffno` DISABLE KEYS */;
INSERT INTO `staffno` VALUES (1,'s01','Kevin','aaa','0000','0911333555','大安','店經理',15000),(2,'s02','Eric','bbb','1111','0918762837','中正','副店',13000),(3,'s03','James','ccc','2222','0932340289','信義','行政',1000),(4,'s04','Alex','ddd','3333','0955123090','松山','會計',1000),(5,'s05','Andy','eee','4444','0922737087','中山','領班',12000),(6,'s06','Steven','fff','5555','0933834798','文山','店員',10000),(7,'s07','Emily','ggg','6666','0910472009','北投','店員',8000),(8,'s08','Alice','hhh','7777','0939808808','士林','店員',7500),(9,'s09','Grace','iii','8888','0929784900','新店','店員',5600),(10,'s10','Tina','jjj','9999','0918329870','板橋','店員',9600),(11,'s11','Annie','kkk','3355','0931230290','萬華','店員',8900);
/*!40000 ALTER TABLE `staffno` ENABLE KEYS */;
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
