-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: plagiarism
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

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
-- Table structure for table `concept_paper_details`
--

DROP TABLE IF EXISTS `concept_paper_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `concept_paper_details` (
  `concept_paper_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` tinytext NOT NULL,
  `concept_paper_name` tinytext NOT NULL,
  `reg_no` varchar(15) NOT NULL,
  `date_of_submission` date NOT NULL,
  `date_of_acceptance` date DEFAULT NULL,
  `status` enum('Pending','Accepted','Rejected') NOT NULL,
  PRIMARY KEY (`concept_paper_id`),
  KEY `reg_no` (`reg_no`),
  CONSTRAINT `concept_paper_details_ibfk_1` FOREIGN KEY (`reg_no`) REFERENCES `student_details` (`reg_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concept_paper_details`
--

LOCK TABLES `concept_paper_details` WRITE;
/*!40000 ALTER TABLE `concept_paper_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `concept_paper_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturer_details`
--

DROP TABLE IF EXISTS `lecturer_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lecturer_details` (
  `lecturer_id_no` varchar(8) NOT NULL,
  `first_name` varchar(25) NOT NULL,
  `last-name` varchar(25) NOT NULL,
  `email` varchar(30) NOT NULL,
  `phone_no` varchar(10) NOT NULL,
  `payroll_number` varchar(15) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`lecturer_id_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturer_details`
--

LOCK TABLES `lecturer_details` WRITE;
/*!40000 ALTER TABLE `lecturer_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `lecturer_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_details`
--

DROP TABLE IF EXISTS `student_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_details` (
  `reg_no` varchar(15) NOT NULL,
  `first_name` varchar(25) NOT NULL,
  `last-name` varchar(25) NOT NULL,
  `email` varchar(30) NOT NULL,
  `phone_no` varchar(10) NOT NULL,
  `password` varchar(255) NOT NULL,
  `lecturer_id_no` varchar(8) NOT NULL,
  PRIMARY KEY (`reg_no`),
  KEY `lecturer_id_no` (`lecturer_id_no`),
  CONSTRAINT `student_details_ibfk_1` FOREIGN KEY (`lecturer_id_no`) REFERENCES `lecturer_details` (`lecturer_id_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_details`
--

LOCK TABLES `student_details` WRITE;
/*!40000 ALTER TABLE `student_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `student_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-10 19:34:03
