-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: exal2
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
-- Table structure for table `autobuses`
--

DROP TABLE IF EXISTS `autobuses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autobuses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `modelo` int DEFAULT NULL,
  `marca` text,
  `circulacion` text,
  `tipo` text,
  `placa` text,
  `estado` text,
  `numero` varchar(10) DEFAULT NULL,
  `activo` enum('SI','NO') NOT NULL DEFAULT 'SI',
  `serie` text,
  `agente` text,
  `poliza` text,
  `telefono` text,
  `serie_motor` text,
  `kilometraje` int DEFAULT NULL,
  `vigencia_circulacion` date DEFAULT NULL,
  `vigencia_seguro` date DEFAULT NULL,
  `mantenimiento` date DEFAULT NULL,
  `vigencia_contaminante` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autobuses`
--

LOCK TABLES `autobuses` WRITE;
/*!40000 ALTER TABLE `autobuses` DISABLE KEYS */;
INSERT INTO `autobuses` VALUES (1,2008,'','','Tipo 1','115HS5','Servicio','515','SI','','','','','',0,NULL,NULL,NULL,NULL),(2,2016,'','','Tipo 7','137HS5','Servicio','501','SI','','','','','',0,NULL,NULL,NULL,NULL),(3,2012,'','','Tipo 1','138HS5','Servicio','500','SI','','','','','',0,NULL,NULL,NULL,NULL),(4,2020,'','','Tipo 2','258HS5','Servicio','505','SI','','','','','',0,NULL,NULL,NULL,NULL),(5,2011,'','','Tipo 5','157HS5','Servicio','535','SI','','','','','',0,NULL,NULL,NULL,NULL),(6,2012,'','','Tipo 4','167HS5','Servicio','540','','','','','','',0,NULL,NULL,NULL,NULL),(7,2013,'','','Tipo 2','176HS5','Servicio','525','SI','','','','','',0,NULL,NULL,NULL,NULL),(8,2018,'','','Tipo 2','179HS5','Servicio','511','SI','','','','','',0,NULL,NULL,NULL,NULL),(9,2009,'','','Tipo 5','191HS5','Servicio','545','SI','','','','','',0,NULL,NULL,NULL,NULL),(10,2018,'','','Tipo 3','199HS5','Servicio','506','','','','','','',0,NULL,NULL,NULL,NULL),(11,2018,'','','Tipo 3','200HS5','Servicio','516','','','','','','',0,NULL,NULL,NULL,NULL),(12,2019,'','','Tipo 6','204HS5','Servicio','520','SI','','','','','',0,NULL,NULL,NULL,NULL),(13,2018,'','','Tipo 1','209HS5','Servicio','521','SI','','','','','',0,NULL,NULL,NULL,NULL),(14,2019,'','','Tipo 1','215HS5','Servicio','530','SI','','','','','',0,NULL,NULL,NULL,NULL),(15,2019,'','','Tipo 1','226HS5','Servicio','510','SI','','','','','',0,NULL,NULL,NULL,NULL),(16,2020,'','','Tipo 2','223HS5','Servicio','531','SI','','','','','',0,NULL,NULL,NULL,NULL),(19,2019,'','','Tipo 1','225HS5','Servicio','526','SI','','','','','',0,NULL,NULL,NULL,NULL),(20,2019,'','','Tipo 7','254621','Servicio','1','SI','','','','','',0,NULL,NULL,NULL,NULL),(21,2019,'','','Tipo 2','564654','Servicio','545','SI','','','','','',0,NULL,NULL,NULL,NULL),(22,2018,'','','Tipo 2','tramite','Servicio','522','SI','','','','','',0,NULL,NULL,NULL,NULL),(23,2021,'','','Tipo 3','ABC123','Servicio','601','','','','','','',0,NULL,NULL,NULL,NULL),(25,2018,'','','Tipo 6','TRAM','Servicio','544','','','','','','',0,NULL,NULL,NULL,NULL),(26,2015,'','','Tipo 3','323TLX','Servicio','550','SI','','','','','',0,NULL,NULL,NULL,NULL),(27,2018,'','','Tipo 1','186HS5','Servicio','502','SI','','','','','',0,NULL,NULL,NULL,NULL),(28,2020,'','','Tipo 2','257HS5','Servicio','507','SI','','','','','',0,NULL,NULL,NULL,NULL),(29,2018,'','','Tipo 1','251HS5','Servicio','513','SI','','','','','',0,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `autobuses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conductores`
--

DROP TABLE IF EXISTS `conductores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conductores` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` text,
  `celular` text,
  `contacto` text,
  `activo` enum('SI','NO') NOT NULL DEFAULT 'SI',
  `licencia` text,
  `vigencia` date DEFAULT NULL,
  `psicofisico` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conductores`
--

LOCK TABLES `conductores` WRITE;
/*!40000 ALTER TABLE `conductores` DISABLE KEYS */;
INSERT INTO `conductores` VALUES (22,'JOSE ALBERTO CARREON LARA','2211812984','','SI','',NULL,NULL),(27,'JUAN PABLO RIVERA ARENAS','2471183478','TURISMO','SI','',NULL,NULL),(28,'MARLON BRANDON HERNANDEZ HERNANDEZ','12345','contacto','SI','',NULL,NULL),(29,'ARMANDO SUAREZ RAMIREZ','2411943876','contacto','SI','',NULL,NULL),(31,'EDWIN CASTELLANOS MEJIA','2227615122','contacto','SI','',NULL,NULL),(33,'FELIPE VIVEROS','12345','conocido','SI','',NULL,NULL),(34,'MANUEL SOTERO FIDEL','2311163268','','SI','',NULL,NULL),(35,'LEONEL VIDAL','2311001463','','SI','',NULL,NULL),(36,'ALFREDO GUEVARA','2311191618','','SI','',NULL,NULL),(37,'ALEJANDRO HERNANDEZ','2331081988','','SI','',NULL,NULL),(38,'ALAIR PARRA','2761000963','','SI','',NULL,NULL),(39,'ALBERTO PEREZ','','','SI','',NULL,NULL),(40,'ROLANDO','','','SI','',NULL,NULL),(41,'JERONIMO PADILLA VASQUEZ','','','SI','',NULL,NULL),(42,'ERICK','','','SI','',NULL,NULL);
/*!40000 ALTER TABLE `conductores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `folio`
--

DROP TABLE IF EXISTS `folio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `folio` (
  `id` int NOT NULL,
  `periodo` int DEFAULT NULL,
  `mes` int DEFAULT NULL,
  `numero` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `folio`
--

LOCK TABLES `folio` WRITE;
/*!40000 ALTER TABLE `folio` DISABLE KEYS */;
INSERT INTO `folio` VALUES (1,2024,10,2);
/*!40000 ALTER TABLE `folio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horarios`
--

DROP TABLE IF EXISTS `horarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rutas_id` int NOT NULL,
  `autobuses_id` int NOT NULL,
  `conductores_id` int NOT NULL,
  `folio` varchar(10) NOT NULL,
  `hora` time NOT NULL,
  `created` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `personal` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_horarios_rutas1_idx` (`rutas_id`),
  KEY `fk_horarios_conductores1_idx` (`conductores_id`),
  KEY `fk_horarios_autobuses1_idx` (`autobuses_id`),
  CONSTRAINT `fk_horarios_autobuses1` FOREIGN KEY (`autobuses_id`) REFERENCES `autobuses` (`id`),
  CONSTRAINT `fk_horarios_conductores1` FOREIGN KEY (`conductores_id`) REFERENCES `conductores` (`id`),
  CONSTRAINT `fk_horarios_rutas1` FOREIGN KEY (`rutas_id`) REFERENCES `rutas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horarios`
--

LOCK TABLES `horarios` WRITE;
/*!40000 ALTER TABLE `horarios` DISABLE KEYS */;
INSERT INTO `horarios` VALUES (1,1,1,22,'2410-1','14:30:00','2024-10-22 04:40:39',1),(2,4,12,34,'2410-2','16:30:00','2024-10-22 04:41:29',1);
/*!40000 ALTER TABLE `horarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rutas`
--

DROP TABLE IF EXISTS `rutas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rutas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idorigen` int NOT NULL,
  `iddestino` int NOT NULL,
  `activa` enum('SI','NO') NOT NULL DEFAULT 'SI',
  `nombre` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_rutas_terminales1_idx` (`idorigen`),
  KEY `fk_rutas_terminales2_idx` (`iddestino`),
  CONSTRAINT `fk_rutas_terminales1` FOREIGN KEY (`idorigen`) REFERENCES `terminales` (`id`),
  CONSTRAINT `fk_rutas_terminales2` FOREIGN KEY (`iddestino`) REFERENCES `terminales` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rutas`
--

LOCK TABLES `rutas` WRITE;
/*!40000 ALTER TABLE `rutas` DISABLE KEYS */;
INSERT INTO `rutas` VALUES (1,1,12,'SI','SOL-CRI'),(2,10,2,'SI','XAN-CET'),(4,31,16,'SI','XAL-PUE'),(9,12,1,'SI','CRI-SOL'),(10,15,10,'SI','CTZ-XAN'),(12,16,31,'SI','PUE-XAL');
/*!40000 ALTER TABLE `rutas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terminales`
--

DROP TABLE IF EXISTS `terminales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `terminales` (
  `id` int NOT NULL AUTO_INCREMENT,
  `terminal` varchar(30) DEFAULT NULL,
  `tipo` varchar(12) DEFAULT NULL,
  `direccion` varchar(70) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `abrev` varchar(5) DEFAULT NULL,
  `activa` enum('SI','NO') DEFAULT 'SI',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terminales`
--

LOCK TABLES `terminales` WRITE;
/*!40000 ALTER TABLE `terminales` DISABLE KEYS */;
INSERT INTO `terminales` VALUES (1,'LA SOLEDAD','Terminal','CDMX LA SOLEDAD','2461261802','SOL','SI'),(2,'CETRAM TZ','Terminal','CDMX CETRAM TEZIUTLAN','5529792664','CET','SI'),(3,'CHIGNAUTLA','Intermedio','LOS ARCOS','2311224933','CHG','SI'),(7,'SAN MIGUEL','Parada','','2311032015','MIG','SI'),(8,'TEZIUTLAN','Parada','EL FRESNILLO','2311224933','TEZ','SI'),(9,'ATEMPAN','Intermedio','ESC 1ERO DE ENERO','2311032015','ATE','SI'),(10,'XALTIPAN','Terminal','FLORES 132','2311743704','XAN','SI'),(11,'ZARAGOZA','Intermedio','GLORIETA EL RELOJ','2311032015','ZAA','SI'),(12,'SAN CRISTOBAL DE LAS CASAS ','Terminal','PROLONGACION INSURGENTES  # 76-B BARRIO DE SAN DIEGO ','2461261808','CRI','SI'),(13,'TUXTLA GUTIERREZ','Parada','TUXTLA GUTIERREZ','2461261808','TUX','SI'),(15,'CETRAM TZ','Terminal','VENUSTIANO CARRANZA','5529792664','CTZ','SI'),(16,'PUEBLA','Terminal','FRANCISCO VILLA NO 32 COL SNTA MA LA RIVERA','2212543573','PUE','SI'),(17,'COMITAN','Parada','CENTRO DE COMITAN','9613236807','COM','SI'),(18,'TLATLAUQUITEPEC','Parada','LA SECUNDARIA','2461261805','TLC','SI'),(19,'TETELES','Parada','PARADA TETELES','2311224933','TET','SI'),(20,'CUYUACO PISTA','Parada','SOBRE LA PISTA','2461261805','CUY','SI'),(21,'HUMANTLA','Parada','INFONAVIT','5529792664','HUA','SI'),(24,'ZARAGOZA','Terminal','Zaragoza','12345','ZAR','SI'),(25,'TLALTLAUQUITEPEC','Terminal','Conocida','1234','TLA','SI'),(26,'CRUCERO DE AYHUNOAC','Terminal','Conocida','1234','TUC','SI'),(27,'TETELES','Terminal','Conocida','1234','TES','SI'),(28,'ATEMPAN','Terminal','Conocida','12345','ATN','SI'),(29,'COALIXCO','Terminal','Conocida','12345','COX','SI'),(30,'CHINAUTLA','Terminal','Conocida','12345','CHI','SI'),(31,'XALTIPAN','Terminal','Conocida','12345','XAL','SI'),(32,'LIBRES','Terminal','Conocida','0','Lib','SI'),(33,'SAN MARTIN','Terminal','conocida','0','Mart','SI'),(35,'CALPULALPAN','Terminal','Conocida','0','CALP','SI'),(36,'MEXICO','Terminal','Conocida','0','XMX','SI'),(37,'APIZACO','Parada','AVENIDA 16 DE SEPTIEMBRE','44565','API','SI'),(41,'TLAXCALA','Intermedio','EL TREBOL','54166','ALA','SI');
/*!40000 ALTER TABLE `terminales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_bus`
--

DROP TABLE IF EXISTS `tipos_bus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_bus` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  `valor` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=458 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_bus`
--

LOCK TABLES `tipos_bus` WRITE;
/*!40000 ALTER TABLE `tipos_bus` DISABLE KEYS */;
INSERT INTO `tipos_bus` VALUES (3,'Tipo 1','1'),(4,'Tipo 1','2'),(5,'Tipo 1','Pasillo'),(6,'Tipo 1','3'),(7,'Tipo 1','4'),(8,'Tipo 1','5'),(9,'Tipo 1','6'),(10,'Tipo 1','Pasillo'),(11,'Tipo 1','7'),(12,'Tipo 1','8'),(13,'Tipo 1','9'),(14,'Tipo 1','10'),(15,'Tipo 1','Pasillo'),(16,'Tipo 1','11'),(17,'Tipo 1','12'),(18,'Tipo 1','13'),(19,'Tipo 1','14'),(20,'Tipo 1','Pasillo'),(21,'Tipo 1','15'),(22,'Tipo 1','16'),(23,'Tipo 1','17'),(24,'Tipo 1','18'),(25,'Tipo 1','Pasillo'),(26,'Tipo 1','19'),(27,'Tipo 1','20'),(28,'Tipo 1','21'),(29,'Tipo 1','22'),(30,'Tipo 1','Pasillo'),(31,'Tipo 1','23'),(32,'Tipo 1','24'),(33,'Tipo 1','25'),(34,'Tipo 1','26'),(35,'Tipo 1','Pasillo'),(36,'Tipo 1','27'),(37,'Tipo 1','28'),(38,'Tipo 1','29'),(39,'Tipo 1','30'),(40,'Tipo 1','Pasillo'),(41,'Tipo 1','31'),(42,'Tipo 1','32'),(43,'Tipo 1','33'),(44,'Tipo 1','34'),(45,'Tipo 1','Pasillo'),(46,'Tipo 1','35'),(47,'Tipo 1','36'),(48,'Tipo 1','37'),(49,'Tipo 1','38'),(50,'Tipo 1','Pasillo'),(51,'Tipo 1','39'),(52,'Tipo 1','40'),(53,'Tipo 1','41'),(54,'Tipo 1','42'),(55,'Tipo 1','Pasillo'),(56,'Tipo 1','43'),(57,'Tipo 1','44'),(58,'Tipo 1','45'),(59,'Tipo 1','46'),(60,'Tipo 1','Pasillo'),(61,'Tipo 1','Sanitario'),(62,'Tipo 1','Sanitario'),(63,'Tipo 2','1'),(64,'Tipo 2','2'),(65,'Tipo 2','Pasillo'),(66,'Tipo 2','3'),(67,'Tipo 2','4'),(68,'Tipo 2','5'),(69,'Tipo 2','6'),(70,'Tipo 2','Pasillo'),(71,'Tipo 2','7'),(72,'Tipo 2','8'),(73,'Tipo 2','9'),(74,'Tipo 2','10'),(75,'Tipo 2','Pasillo'),(76,'Tipo 2','11'),(77,'Tipo 2','12'),(78,'Tipo 2','13'),(79,'Tipo 2','14'),(80,'Tipo 2','Pasillo'),(81,'Tipo 2','15'),(82,'Tipo 2','16'),(83,'Tipo 2','17'),(84,'Tipo 2','18'),(85,'Tipo 2','Pasillo'),(86,'Tipo 2','19'),(87,'Tipo 2','20'),(88,'Tipo 2','21'),(89,'Tipo 2','22'),(90,'Tipo 2','Pasillo'),(91,'Tipo 2','23'),(92,'Tipo 2','24'),(93,'Tipo 2','25'),(94,'Tipo 2','26'),(95,'Tipo 2','Pasillo'),(96,'Tipo 2','27'),(97,'Tipo 2','28'),(98,'Tipo 2','29'),(99,'Tipo 2','30'),(100,'Tipo 2','Pasillo'),(101,'Tipo 2','31'),(102,'Tipo 2','32'),(103,'Tipo 2','33'),(104,'Tipo 2','34'),(105,'Tipo 2','Pasillo'),(106,'Tipo 2','35'),(107,'Tipo 2','36'),(108,'Tipo 2','37'),(109,'Tipo 2','38'),(110,'Tipo 2','Pasillo'),(111,'Tipo 2','39'),(112,'Tipo 2','40'),(113,'Tipo 2','41'),(114,'Tipo 2','42'),(115,'Tipo 2','Pasillo'),(116,'Tipo 2','43'),(117,'Tipo 2','44'),(118,'Tipo 2','45'),(119,'Tipo 2','46'),(120,'Tipo 2','Pasillo'),(121,'Tipo 2','47'),(122,'Tipo 2','48'),(123,'Tipo 2','49'),(124,'Tipo 2','50'),(125,'Tipo 2','Pasillo'),(126,'Tipo 2','Sanitario'),(127,'Tipo 2','Sanitario'),(128,'Tipo 3','3'),(129,'Tipo 3','4'),(130,'Tipo 3','Pasillo'),(131,'Tipo 3','2'),(132,'Tipo 3','1'),(133,'Tipo 3','7'),(134,'Tipo 3','8'),(135,'Tipo 3','Pasillo'),(136,'Tipo 3','6'),(137,'Tipo 3','5'),(138,'Tipo 3','11'),(139,'Tipo 3','12'),(140,'Tipo 3','Pasillo'),(141,'Tipo 3','10'),(142,'Tipo 3','9'),(143,'Tipo 3','15'),(144,'Tipo 3','16'),(145,'Tipo 3','Pasillo'),(146,'Tipo 3','14'),(147,'Tipo 3','13'),(148,'Tipo 3','19'),(149,'Tipo 3','20'),(150,'Tipo 3','Pasillo'),(151,'Tipo 3','18'),(152,'Tipo 3','17'),(153,'Tipo 3','23'),(154,'Tipo 3','24'),(155,'Tipo 3','Pasillo'),(156,'Tipo 3','22'),(157,'Tipo 3','21'),(158,'Tipo 3','25'),(159,'Tipo 3','26'),(160,'Tipo 3','Pasillo'),(161,'Tipo 3','Sanitario'),(162,'Tipo 3','Sanitario'),(163,'Tipo 3','27'),(164,'Tipo 3','28'),(165,'Tipo 3','Pasillo'),(166,'Tipo 3','Sanitario'),(167,'Tipo 3','Sanitario'),(168,'Tipo 3','31'),(169,'Tipo 3','32'),(170,'Tipo 3','Pasillo'),(171,'Tipo 3','30'),(172,'Tipo 3','29'),(173,'Tipo 3','35'),(174,'Tipo 3','36'),(175,'Tipo 3','Pasillo'),(176,'Tipo 3','34'),(177,'Tipo 3','33'),(178,'Tipo 3','39'),(179,'Tipo 3','40'),(180,'Tipo 3','Pasillo'),(181,'Tipo 3','38'),(182,'Tipo 3','37'),(183,'Tipo 3','43'),(184,'Tipo 3','44'),(185,'Tipo 3','Pasillo'),(186,'Tipo 3','42'),(187,'Tipo 3','41'),(188,'Tipo 3','47'),(189,'Tipo 3','48'),(190,'Tipo 3','Pasillo'),(191,'Tipo 3','46'),(192,'Tipo 3','45'),(193,'Tipo 3','51'),(194,'Tipo 3','52'),(195,'Tipo 3','Pasillo'),(196,'Tipo 3','50'),(197,'Tipo 3','49'),(198,'Tipo 4','1'),(199,'Tipo 4','2'),(200,'Tipo 4','Pasillo'),(201,'Tipo 4','3'),(202,'Tipo 4','4'),(203,'Tipo 4','5'),(204,'Tipo 4','6'),(205,'Tipo 4','Pasillo'),(206,'Tipo 4','7'),(207,'Tipo 4','8'),(208,'Tipo 4','9'),(209,'Tipo 4','10'),(210,'Tipo 4','Pasillo'),(211,'Tipo 4','11'),(212,'Tipo 4','12'),(213,'Tipo 4','13'),(214,'Tipo 4','14'),(215,'Tipo 4','Pasillo'),(216,'Tipo 4','15'),(217,'Tipo 4','16'),(218,'Tipo 4','17'),(219,'Tipo 4','18'),(220,'Tipo 4','Pasillo'),(221,'Tipo 4','19'),(222,'Tipo 4','20'),(223,'Tipo 4','21'),(224,'Tipo 4','22'),(225,'Tipo 4','Pasillo'),(226,'Tipo 4','23'),(227,'Tipo 4','24'),(228,'Tipo 4','25'),(229,'Tipo 4','26'),(230,'Tipo 4','Pasillo'),(231,'Tipo 4','27'),(232,'Tipo 4','28'),(233,'Tipo 4','29'),(234,'Tipo 4','30'),(235,'Tipo 4','Pasillo'),(236,'Tipo 4','31'),(237,'Tipo 4','32'),(238,'Tipo 4','33'),(239,'Tipo 4','34'),(240,'Tipo 4','Pasillo'),(241,'Tipo 4','35'),(242,'Tipo 4','36'),(243,'Tipo 4','37'),(244,'Tipo 4','38'),(245,'Tipo 4','Pasillo'),(246,'Tipo 4','39'),(247,'Tipo 4','40'),(248,'Tipo 4','41'),(249,'Tipo 4','42'),(250,'Tipo 4','Pasillo'),(251,'Tipo 4','43'),(252,'Tipo 4','44'),(253,'Tipo 4','45'),(254,'Tipo 4','46'),(255,'Tipo 4','Pasillo'),(256,'Tipo 4','47'),(257,'Tipo 4','48'),(258,'Tipo 4','49'),(259,'Tipo 4','50'),(260,'Tipo 4','51'),(261,'Tipo 4','Sanitario'),(262,'Tipo 4','Sanitario'),(263,'Tipo 5','1'),(264,'Tipo 5','2'),(265,'Tipo 5','Pasillo'),(266,'Tipo 5','Pasillo'),(267,'Tipo 5','Pasillo'),(268,'Tipo 5','1'),(269,'Tipo 5','2'),(270,'Tipo 5','Pasillo'),(271,'Tipo 5','3'),(272,'Tipo 5','4'),(273,'Tipo 5','5'),(274,'Tipo 5','6'),(275,'Tipo 5','Pasillo'),(276,'Tipo 5','7'),(277,'Tipo 5','8'),(278,'Tipo 5','9'),(279,'Tipo 5','10'),(280,'Tipo 5','Pasillo'),(281,'Tipo 5','11'),(282,'Tipo 5','12'),(283,'Tipo 5','13'),(284,'Tipo 5','14'),(285,'Tipo 5','Pasillo'),(286,'Tipo 5','15'),(287,'Tipo 5','16'),(288,'Tipo 5','17'),(289,'Tipo 5','18'),(290,'Tipo 5','Pasillo'),(291,'Tipo 5','19'),(292,'Tipo 5','20'),(293,'Tipo 5','21'),(294,'Tipo 5','22'),(295,'Tipo 5','Pasillo'),(296,'Tipo 5','Sanitario'),(297,'Tipo 5','Sanitario'),(298,'Tipo 5','23'),(299,'Tipo 5','24'),(300,'Tipo 5','Pasillo'),(301,'Tipo 5','25'),(302,'Tipo 5','26'),(303,'Tipo 5','27'),(304,'Tipo 5','28'),(305,'Tipo 5','Pasillo'),(306,'Tipo 5','29'),(307,'Tipo 5','30'),(308,'Tipo 5','31'),(309,'Tipo 5','32'),(310,'Tipo 5','Pasillo'),(311,'Tipo 5','33'),(312,'Tipo 5','34'),(313,'Tipo 5','35'),(314,'Tipo 5','36'),(315,'Tipo 5','Pasillo'),(316,'Tipo 5','37'),(317,'Tipo 5','38'),(318,'Tipo 5','39'),(319,'Tipo 5','40'),(320,'Tipo 5','Pasillo'),(321,'Tipo 5','41'),(322,'Tipo 5','42'),(323,'Tipo 5','43'),(324,'Tipo 5','44'),(325,'Tipo 5','47'),(326,'Tipo 5','45'),(327,'Tipo 5','46'),(328,'Tipo 6','Pasillo'),(329,'Tipo 6','Pasillo'),(330,'Tipo 6','Pasillo'),(331,'Tipo 6','51'),(332,'Tipo 6','52'),(333,'Tipo 6','1'),(334,'Tipo 6','2'),(335,'Tipo 6','Pasillo'),(336,'Tipo 6','3'),(337,'Tipo 6','4'),(338,'Tipo 6','5'),(339,'Tipo 6','6'),(340,'Tipo 6','Pasillo'),(341,'Tipo 6','7'),(342,'Tipo 6','8'),(343,'Tipo 6','9'),(344,'Tipo 6','10'),(345,'Tipo 6','Pasillo'),(346,'Tipo 6','11'),(347,'Tipo 6','12'),(348,'Tipo 6','13'),(349,'Tipo 6','14'),(350,'Tipo 6','Pasillo'),(351,'Tipo 6','15'),(352,'Tipo 6','16'),(353,'Tipo 6','17'),(354,'Tipo 6','18'),(355,'Tipo 6','Pasillo'),(356,'Tipo 6','19'),(357,'Tipo 6','20'),(358,'Tipo 6','21'),(359,'Tipo 6','22'),(360,'Tipo 6','Pasillo'),(361,'Tipo 6','23'),(362,'Tipo 6','24'),(363,'Tipo 6','25'),(364,'Tipo 6','26'),(365,'Tipo 6','Pasillo'),(366,'Tipo 6','27'),(367,'Tipo 6','28'),(368,'Tipo 6','29'),(369,'Tipo 6','30'),(370,'Tipo 6','Pasillo'),(371,'Tipo 6','31'),(372,'Tipo 6','32'),(373,'Tipo 6','33'),(374,'Tipo 6','34'),(375,'Tipo 6','Pasillo'),(376,'Tipo 6','35'),(377,'Tipo 6','36'),(378,'Tipo 6','37'),(379,'Tipo 6','38'),(380,'Tipo 6','Pasillo'),(381,'Tipo 6','39'),(382,'Tipo 6','40'),(383,'Tipo 6','41'),(384,'Tipo 6','42'),(385,'Tipo 6','Pasillo'),(386,'Tipo 6','43'),(387,'Tipo 6','44'),(388,'Tipo 6','45'),(389,'Tipo 6','46'),(390,'Tipo 6','Pasillo'),(391,'Tipo 6','47'),(392,'Tipo 6','48'),(393,'Tipo 6','49'),(394,'Tipo 6','50'),(395,'Tipo 6','Pasillo'),(396,'Tipo 6','Sanitario'),(397,'Tipo 6','Sanitario'),(398,'Tpo 7','Pasillo'),(399,'Tpo 7','Pasillo'),(400,'Tpo 7','Pasillo'),(401,'Tpo 7','3'),(402,'Tpo 7','4'),(403,'Tpo 7','1'),(404,'Tpo 7','2'),(405,'Tpo 7','Pasillo'),(406,'Tpo 7','7'),(407,'Tpo 7','8'),(408,'Tpo 7','5'),(409,'Tpo 7','6'),(410,'Tpo 7','Pasillo'),(411,'Tpo 7','11'),(412,'Tpo 7','12'),(413,'Tpo 7','9'),(414,'Tpo 7','10'),(415,'Tpo 7','Pasillo'),(416,'Tpo 7','15'),(417,'Tpo 7','16'),(418,'Tpo 7','13'),(419,'Tpo 7','14'),(420,'Tpo 7','Pasillo'),(421,'Tpo 7','19'),(422,'Tpo 7','20'),(423,'Tpo 7','17'),(424,'Tpo 7','18'),(425,'Tpo 7','Pasillo'),(426,'Tpo 7','23'),(427,'Tpo 7','24'),(428,'Tpo 7','21'),(429,'Tpo 7','22'),(430,'Tpo 7','Pasillo'),(431,'Tpo 7','27'),(432,'Tpo 7','28'),(433,'Tpo 7','25'),(434,'Tpo 7','26'),(435,'Tpo 7','Pasillo'),(436,'Tpo 7','31'),(437,'Tpo 7','32'),(438,'Tpo 7','29'),(439,'Tpo 7','30'),(440,'Tpo 7','Pasillo'),(441,'Tpo 7','35'),(442,'Tpo 7','36'),(443,'Tpo 7','33'),(444,'Tpo 7','34'),(445,'Tpo 7','Pasillo'),(446,'Tpo 7','39'),(447,'Tpo 7','40'),(448,'Tpo 7','37'),(449,'Tpo 7','38'),(450,'Tpo 7','Pasillo'),(451,'Tpo 7','Sanitario'),(452,'Tpo 7','Sanitario'),(453,'Tpo 7','41'),(454,'Tpo 7','42'),(455,'Tpo 7','Pasillo'),(456,'Tpo 7','Sanitario'),(457,'Tpo 7','Sanitario');
/*!40000 ALTER TABLE `tipos_bus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `clave` varchar(150) NOT NULL,
  `perfil` varchar(45) NOT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `activo` enum('SI','NO') NOT NULL DEFAULT 'SI',
  `terminales_id` int NOT NULL,
  PRIMARY KEY (`id`,`terminales_id`),
  UNIQUE KEY `usuario_UNIQUE` (`usuario`),
  KEY `fk_usuarios_terminales_idx` (`terminales_id`),
  CONSTRAINT `fk_usuarios_terminales` FOREIGN KEY (`terminales_id`) REFERENCES `terminales` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Administrador','admin','a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3','Administrador','12345','SI',0);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-21 22:44:03
