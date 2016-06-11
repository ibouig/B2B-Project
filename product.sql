-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2016 at 06:30 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `jemlama`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `ID` bigint(20) NOT NULL,
  `DATEAJOUT` datetime DEFAULT NULL,
  `DELAI_JOURS` bigint(20) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `IMAGEPATH` varchar(255) DEFAULT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  `PRIX` double DEFAULT NULL,
  `QUANTITE` bigint(20) DEFAULT NULL,
  `REF` varchar(255) DEFAULT NULL,
  `UNITE` varchar(255) DEFAULT NULL,
  `CATEGORY_ID` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PRODUCT_CATEGORY_ID` (`CATEGORY_ID`),
  KEY `FK_PRODUCT_product` (`product`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ID`, `DATEAJOUT`, `DELAI_JOURS`, `DESCRIPTION`, `IMAGEPATH`, `NOM`, `PRIX`, `QUANTITE`, `REF`, `UNITE`, `CATEGORY_ID`, `product`) VALUES
(1051, '2016-06-04 11:11:05', 12, 'gaming laptop', 'Bootstrap/images/12998435_10154077166732698_4923854467767796458_o.jpg', 'Razer blade', 1500, 1221, NULL, 'KG', NULL, 101),
(1052, '2016-06-04 11:23:46', 239, 'Hello there', 'Bootstrap/images/160412kobe_season-35.jpg', 'ATM M20X', 390, 1201, NULL, 'KG', NULL, 101),
(1053, '2016-06-04 11:24:45', 123, 'there is something', 'Bootstrap/images/12998435_10154077166732698_4923854467767796458_o.jpg', 'hiiha', 129, 23, NULL, 'KG', NULL, 101),
(1054, '2016-06-04 11:25:48', 1213, 'hello there²', 'Bootstrap/images/13217025_10154145150032698_1027416774186337649_o.jpg', 'Audio technica', 700, 21, NULL, 'KG', NULL, 101),
(1055, '2016-06-04 11:26:18', 231, 'mlksjdflkqjs', 'Bootstrap/images/160412kobe_season-52 (1).jpg', 'mqlkjsdfmlk', 122, 123, NULL, 'KG', NULL, 101),
(1056, '2016-06-04 11:28:07', 1231, 'qmsldkfj', 'Bootstrap/images/dua.jpg', 'jkqsdlfjh', 123, 3242, NULL, 'KG', NULL, 101),
(1057, '2016-06-04 11:28:32', 121, 'fkjlqshdfliuazerhfk qskldjfhlkj', 'Bootstrap/images/12998435_10154077166732698_4923854467767796458_o.jpg', 'jhgkhjgk', 2323, 432, NULL, 'KG', NULL, 101),
(1058, '2016-06-04 11:31:01', 32, '1231QSDFSQDF', 'Bootstrap/images/160412kobe_season-52 (1).jpg', 'hamza', 1231, 423, NULL, 'KG', NULL, 101),
(1059, '2016-06-04 11:31:19', 12, 'tech stuff', 'Bootstrap/images/160412kobe_season-35.jpg', 'HAmza', 12, 12000, NULL, 'KG', NULL, 101),
(1060, '2016-06-04 11:31:42', 32, 'Relation avec l''agronomie', 'Bootstrap/images/13217025_10154145150032698_1027416774186337649_o.jpg', 'nom1', 120, 12123, NULL, 'L', NULL, 101),
(1061, '2016-06-04 11:33:17', 12, 'qsdfqsd', 'Bootstrap/images/12998435_10154077166732698_4923854467767796458_o.jpg', 'nom1', 123, 234, NULL, 'KG', NULL, 101),
(1062, '2016-06-04 11:33:38', 32, 'Tous les produits, en relation avec l''informatique', 'Bootstrap/images/desktop_1366_x_768_bahrain_03.jpg', 'Informatique', 120, 12123, NULL, 'KG', NULL, 101),
(1063, '2016-06-04 11:34:08', 32, 'Relation avec l''agronomie', 'Bootstrap/images/13217025_10154145150032698_1027416774186337649_o.jpg', 'KASRY', 120, 12123, NULL, 'KG', NULL, 101),
(1064, '2016-06-04 11:36:47', 32, 'Tous les prouits en relation avec l''agroalimentaire', 'Bootstrap/images/13217025_10154145150032698_1027416774186337649_o.jpg', 'KASRY', 1234, 12000, NULL, 'L', NULL, 101),
(1065, '2016-06-04 11:37:21', 32, 'tech stuff', 'Bootstrap/images/160412kobe_season-35.jpg', 'Hamza', 1234, 12000, NULL, 'L', NULL, 101),
(1066, '2016-06-04 11:37:53', 32, 'tech stuff', 'Bootstrap/images/13217025_10154145150032698_1027416774186337649_o.jpg', 'jfhk', 120, 23, NULL, 'KG', NULL, 101);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FK_PRODUCT_CATEGORY_ID` FOREIGN KEY (`CATEGORY_ID`) REFERENCES `category` (`ID`),
  ADD CONSTRAINT `FK_PRODUCT_product` FOREIGN KEY (`product`) REFERENCES `entreprise` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
