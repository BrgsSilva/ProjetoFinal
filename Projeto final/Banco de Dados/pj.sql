-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: nit_pizza
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `cod_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `sobrenome` varchar(45) NOT NULL,
  `data_nascimento` varchar(10) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `senha` varchar(16) NOT NULL,
  PRIMARY KEY (`cod_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'cliente1','cliente1','120569','123456789000','cliente@var.com','12345679'),(2,'cliente2','cliente2','120569','123456789000','cliente2@var.com','12345679'),(3,'cliente3','cliente3','120569','123456789000','cliente3@var.com','12345679');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientecontato`
--

DROP TABLE IF EXISTS `clientecontato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientecontato` (
  `cod_clientecontato` int(11) NOT NULL AUTO_INCREMENT,
  `fk_cliente2` int(11) DEFAULT NULL,
  `contatoCliente` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cod_clientecontato`),
  KEY `fk_cliente2` (`fk_cliente2`),
  CONSTRAINT `fk_cliente2` FOREIGN KEY (`fk_cliente2`) REFERENCES `cliente` (`cod_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientecontato`
--

LOCK TABLES `clientecontato` WRITE;
/*!40000 ALTER TABLE `clientecontato` DISABLE KEYS */;
INSERT INTO `clientecontato` VALUES (2,1,'telefone: 40028922, celular: 40028922');
/*!40000 ALTER TABLE `clientecontato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `cod_endereco` int(11) NOT NULL AUTO_INCREMENT,
  `logradouro` varchar(80) NOT NULL,
  `numero` varchar(6) DEFAULT NULL,
  `complemento` varchar(20) NOT NULL,
  `cep` varchar(12) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `municipio` varchar(45) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `fk_cliente` int(11) DEFAULT NULL,
  `fk_pedido` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_endereco`),
  KEY `fk_cliente` (`fk_cliente`),
  KEY `fk_pedido` (`fk_pedido`),
  CONSTRAINT `fk_cliente` FOREIGN KEY (`fk_cliente`) REFERENCES `cliente` (`cod_cliente`),
  CONSTRAINT `fk_pedido` FOREIGN KEY (`fk_pedido`) REFERENCES `pedido` (`cod_pedido`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'rua','rua1','ab02','1234576','calango','calango1','ca',1,3);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagamento` (
  `cod_pagamento` int(11) NOT NULL AUTO_INCREMENT,
  `forma_pagamento` int(2) DEFAULT NULL,
  `fk_pedido1` int(11) NOT NULL,
  PRIMARY KEY (`cod_pagamento`),
  KEY `fk_pedido1` (`fk_pedido1`),
  CONSTRAINT `fk_pedido1` FOREIGN KEY (`fk_pedido1`) REFERENCES `pedido` (`cod_pedido`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamento`
--

LOCK TABLES `pagamento` WRITE;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
INSERT INTO `pagamento` VALUES (2,1,3);
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `cod_pedido` int(11) NOT NULL AUTO_INCREMENT,
  `descricao_pedido` varchar(150) NOT NULL,
  `fk_produto` int(11) DEFAULT NULL,
  `fk_cliente1` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_pedido`),
  KEY `fk_produto` (`fk_produto`),
  KEY `fk_cliente1` (`fk_cliente1`),
  CONSTRAINT `fk_cliente1` FOREIGN KEY (`fk_cliente1`) REFERENCES `cliente` (`cod_cliente`),
  CONSTRAINT `fk_produto` FOREIGN KEY (`fk_produto`) REFERENCES `produto` (`cod_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (3,'pizza',1,1),(4,'pizza1',2,2),(5,'pizza2',3,3);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidoproduto`
--

DROP TABLE IF EXISTS `pedidoproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedidoproduto` (
  `codpedidoProduto` int(11) NOT NULL AUTO_INCREMENT,
  `fk_pedido2` int(11) DEFAULT NULL,
  `fk_produto1` int(11) DEFAULT NULL,
  `pPQuantidade` int(11) DEFAULT NULL,
  `pPpreco` int(11) NOT NULL,
  PRIMARY KEY (`codpedidoProduto`),
  KEY `fk_pedido2` (`fk_pedido2`),
  KEY `fk_produto1` (`fk_produto1`),
  CONSTRAINT `fk_pedido2` FOREIGN KEY (`fk_pedido2`) REFERENCES `pedido` (`cod_pedido`),
  CONSTRAINT `fk_produto1` FOREIGN KEY (`fk_produto1`) REFERENCES `produto` (`cod_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidoproduto`
--

LOCK TABLES `pedidoproduto` WRITE;
/*!40000 ALTER TABLE `pedidoproduto` DISABLE KEYS */;
INSERT INTO `pedidoproduto` VALUES (1,3,1,1,1);
/*!40000 ALTER TABLE `pedidoproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `cod_produto` int(11) NOT NULL AUTO_INCREMENT,
  `nome_produto` varchar(45) NOT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `valor` double NOT NULL,
  PRIMARY KEY (`cod_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'produto1','produto1',1),(2,'produto2','produto2',2),(3,'produto3','produto3',3);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'nit_pizza'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-25 20:42:18
