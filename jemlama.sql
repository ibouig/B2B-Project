-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 04, 2016 at 06:31 PM
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
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `ID` bigint(20) NOT NULL,
  `CONF_PASS` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `catalogue`
--

CREATE TABLE IF NOT EXISTS `catalogue` (
  `ID` bigint(20) NOT NULL,
  `DATE_AJOUT` datetime DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `catalogue_product`
--

CREATE TABLE IF NOT EXISTS `catalogue_product` (
  `Catalogue_ID` bigint(20) NOT NULL,
  `products_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Catalogue_ID`,`products_ID`),
  KEY `FK_CATALOGUE_PRODUCT_products_ID` (`products_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `ID` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NOM` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`ID`, `DESCRIPTION`, `NOM`) VALUES
(616, 'Tous les produits, en relation avec l''informatique', 'Informatique'),
(651, 'Tous les produits, en relation avec l''informatique', 'Informatique'),
(652, 'Relation avec l''agronomie', 'Agronomie'),
(653, 'Tous les prouits en relation avec l''agroalimentaire', 'Agroalimentaire'),
(701, 'tech stuff', 'Technologie'),
(702, 'tech stuff', 'Technologie'),
(751, 'tech stuff', 'Technologie');

-- --------------------------------------------------------

--
-- Table structure for table `category_product`
--

CREATE TABLE IF NOT EXISTS `category_product` (
  `Category_ID` bigint(20) NOT NULL,
  `products_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Category_ID`,`products_ID`),
  KEY `FK_CATEGORY_PRODUCT_products_ID` (`products_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `entreprise`
--

CREATE TABLE IF NOT EXISTS `entreprise` (
  `ID` bigint(20) NOT NULL,
  `ADRESSE` varchar(255) DEFAULT NULL,
  `CONF_PASS` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `ENTREPRISETYPE` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `NOMENTREPRISE` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `PAYS` varchar(255) DEFAULT NULL,
  `PHONE` varchar(255) DEFAULT NULL,
  `RAISONSOCIALE` varchar(255) DEFAULT NULL,
  `SECTEUR` varchar(255) DEFAULT NULL,
  `STREET` varchar(255) DEFAULT NULL,
  `VILLE` varchar(255) DEFAULT NULL,
  `ZIPCODE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entreprise`
--

INSERT INTO `entreprise` (`ID`, `ADRESSE`, `CONF_PASS`, `DESCRIPTION`, `EMAIL`, `ENTREPRISETYPE`, `NAME`, `NOMENTREPRISE`, `PASSWORD`, `PAYS`, `PHONE`, `RAISONSOCIALE`, `SECTEUR`, `STREET`, `VILLE`, `ZIPCODE`) VALUES
(101, 'Gueliz', NULL, NULL, 'hamzakasry@gmail.com', NULL, 'KASRY Inc.', NULL, '123456', NULL, NULL, NULL, NULL, NULL, 'Marrakech', NULL),
(351, '', NULL, NULL, NULL, NULL, 'HamzaSama', NULL, 'aaaaaaaa', NULL, NULL, NULL, NULL, NULL, '', NULL),
(401, '', NULL, NULL, NULL, NULL, 'SamaSama', NULL, '12345678', NULL, NULL, NULL, NULL, NULL, '', NULL),
(451, 'qsdfqsdfqsdf', NULL, NULL, NULL, NULL, 'fhqsjdfhl', NULL, '12345678', NULL, NULL, NULL, NULL, NULL, 'sqdfsqdf', NULL),
(501, 'kjhjkh', NULL, NULL, 'lkjqdsfhj@sdfjhj.com', NULL, 'jkhqsdkjfh', NULL, 'azerty', NULL, NULL, NULL, NULL, NULL, 'ljk', NULL),
(551, 'Gueliz', NULL, NULL, 'ibouig@gmail.com', NULL, 'KASRY Inc.', NULL, '123456', NULL, NULL, NULL, NULL, NULL, 'MArrakech', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE IF NOT EXISTS `manager` (
  `ID` bigint(20) NOT NULL,
  `CONF_PASS` varchar(255) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`ID`, `CONF_PASS`, `EMAIL`, `NAME`, `PASSWORD`) VALUES
(1, NULL, 'manager@mail.com', 'Manager 1', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `orderline`
--

CREATE TABLE IF NOT EXISTS `orderline` (
  `ID` bigint(20) NOT NULL,
  `PRIX` double DEFAULT NULL,
  `QUANTITY` bigint(20) DEFAULT NULL,
  `ORDER_ID` bigint(20) DEFAULT NULL,
  `PRODUCT_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `order_orderline`
--

CREATE TABLE IF NOT EXISTS `order_orderline` (
  `Order_ID` bigint(20) NOT NULL,
  `lines_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Order_ID`,`lines_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payement`
--

CREATE TABLE IF NOT EXISTS `payement` (
  `ID` bigint(20) NOT NULL,
  `ORDER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Table structure for table `product_catalogue`
--

CREATE TABLE IF NOT EXISTS `product_catalogue` (
  `Product_ID` bigint(20) NOT NULL,
  `cataogues_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Product_ID`,`cataogues_ID`),
  KEY `FK_PRODUCT_CATALOGUE_cataogues_ID` (`cataogues_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product_orderline`
--

CREATE TABLE IF NOT EXISTS `product_orderline` (
  `Product_ID` bigint(20) NOT NULL,
  `orderLines_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Product_ID`,`orderLines_ID`),
  KEY `FK_PRODUCT_ORDERLINE_orderLines_ID` (`orderLines_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sequence`
--

CREATE TABLE IF NOT EXISTS `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sequence`
--

INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', '1100');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `catalogue_product`
--
ALTER TABLE `catalogue_product`
  ADD CONSTRAINT `FK_CATALOGUE_PRODUCT_Catalogue_ID` FOREIGN KEY (`Catalogue_ID`) REFERENCES `catalogue` (`ID`),
  ADD CONSTRAINT `FK_CATALOGUE_PRODUCT_products_ID` FOREIGN KEY (`products_ID`) REFERENCES `product` (`ID`);

--
-- Constraints for table `category_product`
--
ALTER TABLE `category_product`
  ADD CONSTRAINT `FK_CATEGORY_PRODUCT_Category_ID` FOREIGN KEY (`Category_ID`) REFERENCES `category` (`ID`),
  ADD CONSTRAINT `FK_CATEGORY_PRODUCT_products_ID` FOREIGN KEY (`products_ID`) REFERENCES `product` (`ID`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FK_PRODUCT_CATEGORY_ID` FOREIGN KEY (`CATEGORY_ID`) REFERENCES `category` (`ID`),
  ADD CONSTRAINT `FK_PRODUCT_product` FOREIGN KEY (`product`) REFERENCES `entreprise` (`ID`);

--
-- Constraints for table `product_catalogue`
--
ALTER TABLE `product_catalogue`
  ADD CONSTRAINT `FK_PRODUCT_CATALOGUE_cataogues_ID` FOREIGN KEY (`cataogues_ID`) REFERENCES `catalogue` (`ID`),
  ADD CONSTRAINT `FK_PRODUCT_CATALOGUE_Product_ID` FOREIGN KEY (`Product_ID`) REFERENCES `product` (`ID`);

--
-- Constraints for table `product_orderline`
--
ALTER TABLE `product_orderline`
  ADD CONSTRAINT `FK_PRODUCT_ORDERLINE_orderLines_ID` FOREIGN KEY (`orderLines_ID`) REFERENCES `orderline` (`ID`),
  ADD CONSTRAINT `FK_PRODUCT_ORDERLINE_Product_ID` FOREIGN KEY (`Product_ID`) REFERENCES `product` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
