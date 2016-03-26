-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Jeu 29 Janvier 2015 à 08:17
-- Version du serveur: 5.6.12-log
-- Version de PHP: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `dbrdvmedecins`
--
CREATE DATABASE IF NOT EXISTS `b2b` DEFAULT CHARACTER SET utf8 COLLATE utf8_swedish_ci;
USE `b2b`;

-- --------------------------------------------------------

--
-- Structure de la table `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `VERSION` int(11) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `roles`
--

INSERT INTO `roles` (`ID`, `VERSION`, `NAME`) VALUES
(5, 0, 'ROLE_GUEST'),
(6, 0, 'ROLE_ADMIN'),
(7, 0, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `VERSION` int(11) NOT NULL,
  `IDENTITY` varchar(50) NOT NULL,
  `LOGIN` varchar(15) NOT NULL,
  `PASSWORD` varchar(60) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=18 ;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`ID`, `VERSION`, `IDENTITY`, `LOGIN`, `PASSWORD`) VALUES
(14, 0, 'admin', 'admin', 'admin'),
(15, 0, 'user', 'user', 'user'),
(16, 0, 'guest', 'guest', 'guest'),
(17, 0, 'test', 'test', 'test');

-- --------------------------------------------------------

--
-- Structure de la table `users_roles`
--

CREATE TABLE IF NOT EXISTS `users_roles` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `VERSION` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `ROLE_ID` (`ROLE_ID`),
  KEY `USER_ID` (`USER_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=15 ;

--
-- Contenu de la table `users_roles`
--

INSERT INTO `users_roles` (`ID`, `VERSION`, `USER_ID`, `ROLE_ID`) VALUES
(11, 0, 14, 6),
(12, 0, 15, 7),
(13, 0, 16, 5),
(14, 0, 17, 5);

--
-- Contraintes pour les tables exportées
--


--
-- Contraintes pour la table `users_roles`
--
ALTER TABLE `users_roles`
  ADD CONSTRAINT `FK_USERSROLES_ROLES` FOREIGN KEY (`ROLE_ID`) REFERENCES `roles` (`ID`),
  ADD CONSTRAINT `FK_USERSROLES_USERS` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
