-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.26 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for library
CREATE DATABASE IF NOT EXISTS `library` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `library`;

-- Dumping structure for table library.author
CREATE TABLE IF NOT EXISTS `author` (
  `Id` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table library.author: 3 rows
DELETE FROM `author`;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` (`Id`, `Name`) VALUES
	('01', 'Mohit'),
	('578', 'HELLO'),
	('789', 'HI');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;

-- Dumping structure for table library.books
CREATE TABLE IF NOT EXISTS `books` (
  `Id` varchar(50) NOT NULL DEFAULT '',
  `Title` varchar(50) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `Publication` varchar(50) DEFAULT NULL,
  `Category` varchar(50) DEFAULT NULL,
  `Subject` varchar(50) DEFAULT NULL,
  `ISBN` varchar(50) DEFAULT NULL,
  `Price` varchar(50) DEFAULT NULL,
  `Quantity` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table library.books: 0 rows
DELETE FROM `books`;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
/*!40000 ALTER TABLE `books` ENABLE KEYS */;

-- Dumping structure for table library.category
CREATE TABLE IF NOT EXISTS `category` (
  `Id` int(11) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table library.category: 1 rows
DELETE FROM `category`;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`Id`, `Name`) VALUES
	(1, 'Computer');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

-- Dumping structure for table library.login
CREATE TABLE IF NOT EXISTS `login` (
  `Id` int(255) NOT NULL AUTO_INCREMENT,
  `fullname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `usertype` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  KEY `Id` (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table library.login: 3 rows
DELETE FROM `login`;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` (`Id`, `fullname`, `username`, `usertype`, `email`, `mobile`, `password`) VALUES
	(1, 'Mohit Yadav', 'mohit', 'admin', 'mohit@mohit.com', '9654851265', 'mohit'),
	(3, 'Sidhart', 'sid', 'student', 'sid@sid.com', '9564125485', 'sid'),
	(2, 'Hello', 'hello', 'librarian', 'hello@hello.com', '9648512647', 'hello');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;

-- Dumping structure for table library.publication
CREATE TABLE IF NOT EXISTS `publication` (
  `Id` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table library.publication: 1 rows
DELETE FROM `publication`;
/*!40000 ALTER TABLE `publication` DISABLE KEYS */;
INSERT INTO `publication` (`Id`, `Name`) VALUES
	('01', 'M&H');
/*!40000 ALTER TABLE `publication` ENABLE KEYS */;

-- Dumping structure for table library.student
CREATE TABLE IF NOT EXISTS `student` (
  `Id` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Usertype` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table library.student: 0 rows
DELETE FROM `student`;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

-- Dumping structure for table library.subject
CREATE TABLE IF NOT EXISTS `subject` (
  `Id` int(11) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table library.subject: 1 rows
DELETE FROM `subject`;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` (`Id`, `Name`) VALUES
	(1, 'Grapes');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
