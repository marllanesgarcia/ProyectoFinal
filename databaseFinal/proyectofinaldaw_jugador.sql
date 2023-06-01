-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: proyectofinaldaw
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugador` (
  `region` varchar(30) DEFAULT NULL,
  `edad` decimal(12,0) DEFAULT NULL,
  `altura` decimal(3,2) DEFAULT NULL,
  `genero` varchar(30) DEFAULT NULL,
  `elemento` varchar(30) DEFAULT NULL,
  `vida` decimal(12,0) DEFAULT NULL,
  `talento` varchar(30) DEFAULT NULL,
  `arma` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` VALUES ('Asia',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('Asia',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('África',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('América del Norte',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('América del Sur',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('Antártida',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('Europa',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('Oceanía',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(NULL,NULL,NULL,'Lumine',NULL,NULL,NULL,NULL),(NULL,NULL,NULL,'Aether',NULL,NULL,NULL,NULL),(NULL,NULL,NULL,NULL,'AIRE',NULL,NULL,NULL),(NULL,NULL,NULL,NULL,'HIELO',NULL,NULL,NULL),(NULL,NULL,NULL,NULL,'ELECTRO',NULL,NULL,NULL),(NULL,NULL,NULL,NULL,'AGUA',NULL,NULL,NULL),(NULL,NULL,NULL,NULL,'PLANTA',NULL,NULL,NULL),(NULL,NULL,NULL,NULL,'ROCA',NULL,NULL,NULL),('Antártida',23,1.80,'lumine','ELECTRO',23,'Aguas medicinales','chancla'),('Antártida',45,1.90,'aether','HIELO',100,'Vientos impetuosos','bazooka'),('Oceanía',60,1.90,'lumine','ELECTRO',100,'Llamas Fervientes','bazooka'),('América del Norte',45,1.80,'aether','ELECTRO',123,'Llamas Fervientes','bazooka'),('América del Norte',45,1.80,'aether','ELECTRO',100,'Aguas medicinales','bazooka'),('Antártida',34,1.80,'aether','ELECTRO',100,'Aguas medicinales','bazooka'),('América del Sur',43,1.90,'aether','ELECTRO',120,'Aguas medicinales','bazooka'),('Europa',23,1.90,'lumine','HIELO',123,'Llamas Fervientes','bazooka'),('América del Sur',23,1.90,'lumine','ELECTRO',123,'Aguas medicinales','escupitajo'),('América del Sur',34,1.90,'aether','AGUA',123,'Llamas Fervientes','bazooka'),('América del Norte',12,1.00,'aether','ELECTRO',123,'Aguas medicinales','bazooka'),('América del Sur',34,1.90,'aether','ELECTRO',123,'Aguas medicinales','escupitajo'),('África',23,1.90,'aether','HIELO',123,'Aguas medicinales','bazooka'),('América del Sur',56,1.90,'lumine','AGUA',18,'Vientos impetuosos','bazooka'),('América del Sur',67,1.90,'aether','AGUA',123,'Llamas Fervientes','chancla'),('América del Norte',45,1.90,'aether','AGUA',123,'Aguas medicinales','chancla'),('Antártida',34,1.90,'aether','HIELO',123,'Vientos impetuosos','bazooka'),('América del Norte',12,2.00,'aether','AGUA',23,'Llamas Fervientes','bazooka'),('África',23,1.90,'aether','HIELO',123,'Aguas medicinales','bazooka'),('América del Norte',23,1.90,'aether','HIELO',123,'Llamas Fervientes','escupitajo'),('AMERICA_DEL_SUR',2,2.00,'aether','ELECTRO',2,'AGUAS_MEDICIONALES','chancla'),('AMERICA_DEL_SUR',23,1.90,'lumine','ELECTRO',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_SUR',23,1.00,'aether','AGUA',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_NORTE',34,5.00,'aether','ELECTRO',123,'AGUAS_MEDICIONALES','escupitajo'),('AMERICA_DEL_NORTE',65,2.00,'aether','PLANTA',123,'AGUAS_MEDICIONALES','chancla'),('ANTARTIDA',67,1.90,'aether','ELECTRO',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_SUR',34,1.50,'aether','AGUA',123,'AGUAS_MEDICIONALES','bazooka'),('ANTARTIDA',56,1.90,'aether','ELECTRO',123,'VIENTOS_IMPETUOSOS','chancla'),('AMERICA_DEL_SUR',54,1.50,'aether','ELECTRO',123,'VIENTOS_IMPETUOSOS','escupitajo'),('ANTARTIDA',67,1.70,'aether','AGUA',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_NORTE',56,1.70,'aether','ELECTRO',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_NORTE',56,1.00,'aether','ELECTRO',123,'AGUAS_MEDICIONALES','chancla'),('AMERICA_DEL_SUR',23,1.90,'aether','AGUA',123,'AGUAS_MEDICIONALES','escupitajo'),('AMERICA_DEL_SUR',45,1.00,'aether','ELECTRO',123,'LLAMAS_FERVIENTES','chancla'),('AMERICA_DEL_SUR',23,1.90,'aether','AGUA',123,'CUBIERTA_PROTECTORA','bazooka'),('AMERICA_DEL_SUR',45,1.00,'aether','ELECTRO',123,'AGUAS_MEDICIONALES','bazooka'),('ANTARTIDA',34,1.50,'aether','PLANTA',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_SUR',45,1.90,'aether','AGUA',123,'LLAMAS_FERVIENTES','chancla'),('AMERICA_DEL_NORTE',34,1.90,'lumine','HIELO',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_NORTE',23,1.00,'aether','PLANTA',123,'CUBIERTA_PROTECTORA','bazooka'),('EUROPA',26,1.86,'aether','ELECTRO',123,'AGUAS_MEDICIONALES','escupitajo'),('AMERICA_DEL_SUR',45,1.90,'aether','ELECTRO',123,'LLAMAS_FERVIENTES','chancla'),('AMERICA_DEL_SUR',45,1.90,'aether','AGUA',123,'VIENTOS_IMPETUOSOS','chancla'),('AMERICA_DEL_NORTE',67,1.90,'aether','HIELO',123,'LLAMAS_FERVIENTES','bazooka'),('AMERICA_DEL_NORTE',87,1.70,'lumine','AGUA',123,'LLAMAS_FERVIENTES','bazooka'),('AMERICA_DEL_SUR',67,1.60,'aether','HIELO',123,'AGUAS_MEDICIONALES','chancla'),('AFRICA',45,1.60,'aether','ELECTRO',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_SUR',56,1.80,'aether','ELECTRO',123,'LLAMAS_FERVIENTES','bazooka'),('AMERICA_DEL_NORTE',54,1.80,'aether','ELECTRO',123,'LLAMAS_FERVIENTES','escupitajo'),('AMERICA_DEL_SUR',23,1.80,'lumine','ELECTRO',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_SUR',23,1.00,'lumine','ELECTRO',123,'LLAMAS_FERVIENTES','bazooka'),('AMERICA_DEL_NORTE',23,1.00,'lumine','PLANTA',12,'LLAMAS_FERVIENTES','chancla'),('AFRICA',34,1.60,'aether','ELECTRO',123,'VIENTOS_IMPETUOSOS','bazooka'),('AMERICA_DEL_SUR',123,1.80,'lumine','ELECTRO',123,'AGUAS_MEDICIONALES','bazooka'),('AMERICA_DEL_NORTE',23,1.78,'aether','ELECTRO',123,'LLAMAS_FERVIENTES','escupitajo'),('AMERICA_DEL_NORTE',89,1.90,'aether','ROCA',123,'AGUAS_MEDICIONALES','espada corta');
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-01 17:38:26
