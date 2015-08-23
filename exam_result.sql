-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 23, 2015 at 06:29 PM
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
-- Table structure for table `exam_result`
--

CREATE TABLE IF NOT EXISTS `exam_result` (
  `student_name` varchar(30) NOT NULL,
  `dob` date NOT NULL,
  `percentage` double NOT NULL,
  `id` int(10) NOT NULL AUTO_INCREMENT,
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=25 ;

--
-- Dumping data for table `exam_result`
--

INSERT INTO `exam_result` (`student_name`, `dob`, `percentage`, `id`) VALUES
('Brian Burlet', '1985-02-01', 76, 1),
('Rita Paul', '1993-02-01', 92, 2),
('Han Yenn', '1965-02-01', 83, 3),
('Peter Pan', '1987-02-03', 62, 4),
('sssss Burlet', '1985-02-01', 96, 5),
('Rita dddd', '1993-02-01', 92, 6),
('Han rrrrr', '1965-02-01', 93, 7),
('rrrrr Pan', '1987-02-03', 92, 8),
('refds Pan', '1987-02-03', 92, 9),
('ttdgdf Pan', '1987-02-03', 92, 10),
('daaaae Pan', '1987-02-03', 92, 11),
('dddfsf Pan', '1987-02-03', 92, 12),
('svxcv Pan', '1987-02-03', 92, 13),
('sfssf Pan', '1987-02-03', 92, 14),
('wrewev Pan', '1987-02-03', 92, 15),
('sffddff Pan', '1987-02-03', 92, 16),
('reewrw Pan', '1987-02-03', 92, 17),
('yttryty Pan', '1987-02-03', 92, 18),
('wer Pan', '1987-02-03', 92, 19),
('eteddgfg Pan', '1987-02-03', 92, 20),
('tetdgf Pan', '1987-02-03', 92, 21),
('gfggdf Pan', '1987-02-03', 92, 22),
('gfdgr Pan', '1987-02-03', 92, 23),
('etf Pan', '1987-02-03', 92, 24);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
