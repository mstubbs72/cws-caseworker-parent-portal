CREATE TABLE `provider_type` (
  `providerType` bigint(20) NOT NULL AUTO_INCREMENT,
  `providerTypeDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`providerType`)
);
CREATE TABLE `quality_rating` (
  `qualityRating` bigint(20) NOT NULL AUTO_INCREMENT,
  `qualityRatingDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`qualityRating`)
);
CREATE TABLE `county` (
  `countyNumber` bigint(20) NOT NULL AUTO_INCREMENT,
  `countyName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`countyNumber`)
);

CREATE TABLE `providers` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `licenseType` int(11) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  `physicalCity` varchar(255) DEFAULT NULL,
  `physicalZipCode` varchar(255) DEFAULT NULL,
  `providerCapacity` int(11) NOT NULL,
  `providerName` varchar(255) DEFAULT NULL,
  `county_countyNumber` bigint(20) DEFAULT NULL,
  `providerType_providerType` bigint(20) DEFAULT NULL,
  `qualityRating_qualityRating` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_rlg8k5rdx2am95j530mnm2blb` (`county_countyNumber`),
  KEY `FK_mva1dh0ivdt930muojuqsfpky` (`providerType_providerType`),
  KEY `FK_qwkx3l0lod7qo27x07ti5us74` (`qualityRating_qualityRating`),
  CONSTRAINT `FK_mva1dh0ivdt930muojuqsfpky` FOREIGN KEY (`providerType_providerType`) REFERENCES `provider_type` (`providerType`),
  CONSTRAINT `FK_qwkx3l0lod7qo27x07ti5us74` FOREIGN KEY (`qualityRating_qualityRating`) REFERENCES `quality_rating` (`qualityRating`),
  CONSTRAINT `FK_rlg8k5rdx2am95j530mnm2blb` FOREIGN KEY (`county_countyNumber`) REFERENCES `county` (`countyNumber`)
);