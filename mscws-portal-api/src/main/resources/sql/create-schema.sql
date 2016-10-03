DROP TABLE IF EXISTS `quality_rating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quality_rating` (
  `qualityRating` bigint(20) NOT NULL AUTO_INCREMENT,
  `qualityRatingDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`qualityRating`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `special_needs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `special_needs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS `provider_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider_type` (
  `providerType` bigint(20) NOT NULL AUTO_INCREMENT,
  `providerTypeDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`providerType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `county`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `county` (
  `countyNumber` bigint(20) NOT NULL AUTO_INCREMENT,
  `countyName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`countyNumber`)
);
/*!40101 SET character_set_client = @saved_cs_client */;
DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `county_countyNumber` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_r9qjhr2lg7hr9ofyo3dtaquf9` (`county_countyNumber`),
  CONSTRAINT `FK_r9qjhr2lg7hr9ofyo3dtaquf9` FOREIGN KEY (`county_countyNumber`) REFERENCES `county` (`countyNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=358 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `provider_age_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider_age_support` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `fulltime` tinyint(1) NOT NULL,
  `partitme` tinyint(1) NOT NULL,
  `providerId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `provider_license_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider_license_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `licenseType` int(11) DEFAULT NULL,
  `providerType_providerType` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_h149eggx6o6xdqax5m1nic1ay` (`providerType_providerType`),
  CONSTRAINT `FK_h149eggx6o6xdqax5m1nic1ay` FOREIGN KEY (`providerType_providerType`) REFERENCES `provider_type` (`providerType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `provider_special_needs_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider_special_needs_support` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `providerId` bigint(20) DEFAULT NULL,
  `specialNeedId_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ngt89oj6omje9vyc4su6184pl` (`specialNeedId_id`),
  CONSTRAINT `FK_ngt89oj6omje9vyc4su6184pl` FOREIGN KEY (`specialNeedId_id`) REFERENCES `special_needs` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `providers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `licenseType` int(11) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  `physicalZipCode` varchar(255) DEFAULT NULL,
  `providerAvlCapacity` int(11) DEFAULT NULL,
  `providerCapacity` int(11) NOT NULL,
  `providerName` varchar(255) DEFAULT NULL,
  `providesFullTime` tinyint(1) DEFAULT NULL,
  `providesHandicappedAccess` tinyint(1) DEFAULT NULL,
  `providesPartTime` tinyint(1) DEFAULT NULL,
  `county_countyNumber` bigint(20) DEFAULT NULL,
  `physicalCity_id` bigint(20) DEFAULT NULL,
  `providerType_providerType` bigint(20) DEFAULT NULL,
  `qualityRating_qualityRating` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_rlg8k5rdx2am95j530mnm2blb` (`county_countyNumber`),
  KEY `FK_52uw4yrcsbr5bmbq5luciwxbr` (`physicalCity_id`),
  KEY `FK_mva1dh0ivdt930muojuqsfpky` (`providerType_providerType`),
  KEY `FK_qwkx3l0lod7qo27x07ti5us74` (`qualityRating_qualityRating`),
  CONSTRAINT `FK_52uw4yrcsbr5bmbq5luciwxbr` FOREIGN KEY (`physicalCity_id`) REFERENCES `city` (`id`),
  CONSTRAINT `FK_mva1dh0ivdt930muojuqsfpky` FOREIGN KEY (`providerType_providerType`) REFERENCES `provider_type` (`providerType`),
  CONSTRAINT `FK_qwkx3l0lod7qo27x07ti5us74` FOREIGN KEY (`qualityRating_qualityRating`) REFERENCES `quality_rating` (`qualityRating`),
  CONSTRAINT `FK_rlg8k5rdx2am95j530mnm2blb` FOREIGN KEY (`county_countyNumber`) REFERENCES `county` (`countyNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=5069 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `providers_provider_age_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `providers_provider_age_support` (
  `providers_id` bigint(20) NOT NULL,
  `providerAgeSupport_id` bigint(20) NOT NULL,
  PRIMARY KEY (`providers_id`,`providerAgeSupport_id`),
  UNIQUE KEY `UK_glj9q6rk0wmfqvev3msc9bemk` (`providerAgeSupport_id`),
  KEY `FK_glj9q6rk0wmfqvev3msc9bemk` (`providerAgeSupport_id`),
  KEY `FK_2ktih1pq1v1kc686vqdg0h43i` (`providers_id`),
  CONSTRAINT `FK_2ktih1pq1v1kc686vqdg0h43i` FOREIGN KEY (`providers_id`) REFERENCES `providers` (`id`),
  CONSTRAINT `FK_glj9q6rk0wmfqvev3msc9bemk` FOREIGN KEY (`providerAgeSupport_id`) REFERENCES `provider_age_support` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `providers_provider_special_needs_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `providers_provider_special_needs_support` (
  `providers_id` bigint(20) NOT NULL,
  `providerSpecialNeeds_id` bigint(20) NOT NULL,
  PRIMARY KEY (`providers_id`,`providerSpecialNeeds_id`),
  UNIQUE KEY `UK_t6w7stkr1n7l9p3xq5gv1rgor` (`providerSpecialNeeds_id`),
  KEY `FK_t6w7stkr1n7l9p3xq5gv1rgor` (`providerSpecialNeeds_id`),
  KEY `FK_qd4pg8lp98fqlbey2v2hflyma` (`providers_id`),
  CONSTRAINT `FK_qd4pg8lp98fqlbey2v2hflyma` FOREIGN KEY (`providers_id`) REFERENCES `providers` (`id`),
  CONSTRAINT `FK_t6w7stkr1n7l9p3xq5gv1rgor` FOREIGN KEY (`providerSpecialNeeds_id`) REFERENCES `provider_special_needs_support` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `provider_special_needs_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider_special_needs_support` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `providerId` bigint(20) DEFAULT NULL,
  `specialNeedId_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ngt89oj6omje9vyc4su6184pl` (`specialNeedId_id`),
  CONSTRAINT `FK_ngt89oj6omje9vyc4su6184pl` FOREIGN KEY (`specialNeedId_id`) REFERENCES `special_needs` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `providers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `licenseType` int(11) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  `physicalZipCode` varchar(255) DEFAULT NULL,
  `providerAvlCapacity` int(11) DEFAULT NULL,
  `providerCapacity` int(11) NOT NULL,
  `providerName` varchar(255) DEFAULT NULL,
  `providesFullTime` tinyint(1) DEFAULT NULL,
  `providesHandicappedAccess` tinyint(1) DEFAULT NULL,
  `providesPartTime` tinyint(1) DEFAULT NULL,
  `county_countyNumber` bigint(20) DEFAULT NULL,
  `physicalCity_id` bigint(20) DEFAULT NULL,
  `providerType_providerType` bigint(20) DEFAULT NULL,
  `qualityRating_qualityRating` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_rlg8k5rdx2am95j530mnm2blb` (`county_countyNumber`),
  KEY `FK_52uw4yrcsbr5bmbq5luciwxbr` (`physicalCity_id`),
  KEY `FK_mva1dh0ivdt930muojuqsfpky` (`providerType_providerType`),
  KEY `FK_qwkx3l0lod7qo27x07ti5us74` (`qualityRating_qualityRating`),
  CONSTRAINT `FK_52uw4yrcsbr5bmbq5luciwxbr` FOREIGN KEY (`physicalCity_id`) REFERENCES `city` (`id`),
  CONSTRAINT `FK_mva1dh0ivdt930muojuqsfpky` FOREIGN KEY (`providerType_providerType`) REFERENCES `provider_type` (`providerType`),
  CONSTRAINT `FK_qwkx3l0lod7qo27x07ti5us74` FOREIGN KEY (`qualityRating_qualityRating`) REFERENCES `quality_rating` (`qualityRating`),
  CONSTRAINT `FK_rlg8k5rdx2am95j530mnm2blb` FOREIGN KEY (`county_countyNumber`) REFERENCES `county` (`countyNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `providers_provider_age_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `providers_provider_age_support` (
  `providers_id` bigint(20) NOT NULL,
  `providerAgeSupport_id` bigint(20) NOT NULL,
  PRIMARY KEY (`providers_id`,`providerAgeSupport_id`),
  UNIQUE KEY `UK_glj9q6rk0wmfqvev3msc9bemk` (`providerAgeSupport_id`),
  KEY `FK_glj9q6rk0wmfqvev3msc9bemk` (`providerAgeSupport_id`),
  KEY `FK_2ktih1pq1v1kc686vqdg0h43i` (`providers_id`),
  CONSTRAINT `FK_2ktih1pq1v1kc686vqdg0h43i` FOREIGN KEY (`providers_id`) REFERENCES `providers` (`id`),
  CONSTRAINT `FK_glj9q6rk0wmfqvev3msc9bemk` FOREIGN KEY (`providerAgeSupport_id`) REFERENCES `provider_age_support` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `providers_provider_special_needs_support`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `providers_provider_special_needs_support` (
  `providers_id` bigint(20) NOT NULL,
  `providerSpecialNeeds_id` bigint(20) NOT NULL,
  PRIMARY KEY (`providers_id`,`providerSpecialNeeds_id`),
  UNIQUE KEY `UK_t6w7stkr1n7l9p3xq5gv1rgor` (`providerSpecialNeeds_id`),
  KEY `FK_t6w7stkr1n7l9p3xq5gv1rgor` (`providerSpecialNeeds_id`),
  KEY `FK_qd4pg8lp98fqlbey2v2hflyma` (`providers_id`),
  CONSTRAINT `FK_qd4pg8lp98fqlbey2v2hflyma` FOREIGN KEY (`providers_id`) REFERENCES `providers` (`id`),
  CONSTRAINT `FK_t6w7stkr1n7l9p3xq5gv1rgor` FOREIGN KEY (`providerSpecialNeeds_id`) REFERENCES `provider_special_needs_support` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
