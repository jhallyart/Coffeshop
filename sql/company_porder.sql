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
-- Table structure for table `porder`
--

DROP TABLE IF EXISTS `porder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `porder` (
  `id` int NOT NULL AUTO_INCREMENT,
  `membername` varchar(45) DEFAULT NULL,
  `lattle` int DEFAULT NULL,
  `blackcoffee` int DEFAULT NULL,
  `cappuccino` int DEFAULT NULL,
  `sum` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `porder`
--

LOCK TABLES `porder` WRITE;
/*!40000 ALTER TABLE `porder` DISABLE KEYS */;
INSERT INTO `porder` VALUES (1,'Elly Wang',3,5,5,950,'2024-09-01'),(2,'Emma Chiu',3,3,3,990,'2024-09-01'),(3,'Jhally Chiu',5,5,6,1770,'2024-09-08'),(4,'Megan Ma',5,4,6,1700,'2024-09-04'),(5,'Mike Lin',8,1,9,2270,'2024-09-30'),(6,'Garry Lin',3,5,5,1370,'2024-09-09'),(7,'Orange Chen',6,8,6,1920,'2024-09-21'),(8,'Evance Li',8,4,7,2240,'2024-09-25'),(9,'Tom Wu',9,7,4,2230,'2024-09-16'),(10,'George Chou',5,8,6,1980,'2024-09-01'),(11,'Judy Cheng',5,3,10,2110,'2024-09-15'),(12,'Milk Liao',2,8,4,1320,'2024-09-16'),(13,'Joyful Chen',7,5,5,1930,'2024-09-18'),(14,'Ning Ho',7,4,7,2100,'2024-09-25'),(15,'Pretty  Huang',4,7,5,1510,'2024-09-24'),(16,'Joyce Wang',7,8,5,2140,'2024-09-28'),(17,'May Lin',4,8,7,1960,'2024-09-20'),(18,'Michael Chao',4,5,4,1390,'2024-09-25'),(19,'Ruby Bao',4,6,4,1460,'2024-09-30'),(20,'Pin Yang',7,6,4,1880,'2024-09-15'),(21,'Penny Ho',8,7,5,2210,'2024-09-02'),(22,'John Chiang ',7,8,6,2260,'2024-09-09'),(23,'Yvone Liu',4,4,7,1680,'2024-09-04'),(24,'Sayaka Liu',6,3,6,1770,'2024-09-28');
/*!40000 ALTER TABLE `porder` ENABLE KEYS */;
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
