-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 23, 2015 at 06:32 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `batch`
--

-- --------------------------------------------------------

--
-- Table structure for table `exam_result1`
--

CREATE TABLE IF NOT EXISTS `exam_result1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(30) NOT NULL,
  `dob` date NOT NULL,
  `percentage` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `exam_result1`
--

INSERT INTO `exam_result1` (`id`, `student_name`, `dob`, `percentage`) VALUES
(1, 'Brian Burlet', '1985-02-01', 99),
(2, 'Renard konig', '1970-02-01', 61),
(3, 'Sam Disilva', '1992-05-01', 99),
(4, 'Peet Sampras', '1978-02-01', 99),
(5, 'Rita Paul', '1993-02-01', 99),
(6, 'Han Yenn', '1965-02-01', 99),
(7, 'Brian Burlet', '1985-02-01', 99),
(8, 'Renard konig', '1970-02-01', 61),
(9, 'Sam Disilva', '1992-05-01', 99),
(10, 'Peet Sampras', '1978-02-01', 99),
(11, 'Rita Paul', '1993-02-01', 99),
(12, 'Han Yenn', '1965-02-01', 99);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
