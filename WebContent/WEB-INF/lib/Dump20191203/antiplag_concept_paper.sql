-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: antiplag
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `concept_paper`
--

DROP TABLE IF EXISTS `concept_paper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `concept_paper` (
  `concept_paper_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` tinytext NOT NULL,
  `concept_paper` text NOT NULL,
  `reg_no` int(11) NOT NULL,
  `date_of_submission` date NOT NULL,
  `date_of_acceptance` date DEFAULT NULL,
  `status` enum('Pending','Accepted','Rejected') NOT NULL,
  PRIMARY KEY (`concept_paper_id`),
  KEY `reg_no` (`reg_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concept_paper`
--

LOCK TABLES `concept_paper` WRITE;
/*!40000 ALTER TABLE `concept_paper` DISABLE KEYS */;
INSERT INTO `concept_paper` VALUES (1,'Theft','Good',1532,'2019-05-04',NULL,'Pending'),(2,'Theft','jvknvsdksdkv sd sdkvsdklskldvsd vs ',153,'2019-12-02',NULL,'Pending'),(3,'Theft','The proposed project will lead to the development of a web-based platform, acceptable by the church community for management of events and fundraisers. It is to lead to the development of a platform to allow the churches to write blog feed to the members of their community and to the general application users. The platform is to provide the churches with an environment to give users details about the church such as the church history, lead Pastor and the location of the church.  The users of the platform should be able to view a stream of different public events and church community events through the events feeds. They should be able to see the details of these events and be able to either join or attend the event or to forsake the event. They are to be able to get an rsvp ticket for the event. In the case of a paid event or the fundraisers, they are expected to get a valid receipt of prove of the transaction that took place, which will involve M-Pesa as the main medium of payment. The users should be able to join a church community and to see the blog feed of these communities. They can also comment on these feed and air out their views on the related topic of blog. They can also comment on a feed about an event held. They are also to be able to see the details about the different churches registered into the system. This include the history of the church and guidance to the church premise with google maps. They can then be able to join, as many churches are they want to be able to see their community events and other community based information provided by the church.',15327,'2019-12-02',NULL,'Pending'),(4,'new','test',153,'2019-12-02',NULL,'Pending');
/*!40000 ALTER TABLE `concept_paper` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-03  1:30:50
