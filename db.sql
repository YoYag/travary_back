CREATE USER 'sbsst'@'%' IDENTIFIED BY 'sbs123414';
GRANT ALL PRIVILEGES ON *.* TO 'sbsst'@'%';

DROP DATABASE IF EXISTS `travary`;
CREATE DATABASE `travary`;
USE `travary`;