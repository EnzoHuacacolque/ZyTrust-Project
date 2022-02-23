CREATE TABLE `fac_clientes` (
`clie_id` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
`clie_apellido` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
`clie_correo` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL,
`clie_nombre` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
`clie_num_doc` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
`clie_telef` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
`clie_tip_doc` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
PRIMARY KEY (`clie_id`)
) ENGINE=InnoDB;

CREATE TABLE `fac_facturas` (
`det_id` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
`det_cantidad` decimal(19,2) NOT NULL,
`det_importe` decimal(7,2) NOT NULL,
`fact_id` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`prod_id` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
PRIMARY KEY (`det_id`),
KEY `FK5mdchli2e5cvtum16hh3p0l00` (`fact_id`),
KEY `FK2kwc39idld5gg7iawdxcb0vg3` (`prod_id`),
CONSTRAINT `FK2kwc39idld5gg7iawdxcb0vg3` FOREIGN KEY (`prod_id`) REFERENCES `fac_productos` (`prod_id`),
CONSTRAINT `FK5mdchli2e5cvtum16hh3p0l00` FOREIGN KEY (`fact_id`) REFERENCES `fac_facturas` (`fact_id`)
) ENGINE=InnoDB;

CREATE TABLE `fac_productos` (
`prod_id` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
`prod_categ` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`prod_descrip` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`prod_nombre` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`prod_precio` decimal(7,2) DEFAULT NULL,
PRIMARY KEY (`prod_id`)
) ENGINE=InnoDB;

CREATE TABLE `fac_detalles` (
`det_id` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
`det_cantidad` decimal(19,2) NOT NULL,
`det_importe` decimal(7,2) NOT NULL,
`fact_id` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
`prod_id` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
PRIMARY KEY (`det_id`),
KEY `FK5mdchli2e5cvtum16hh3p0l00` (`fact_id`),
KEY `FK2kwc39idld5gg7iawdxcb0vg3` (`prod_id`),
CONSTRAINT `FK2kwc39idld5gg7iawdxcb0vg3` FOREIGN KEY (`prod_id`) REFERENCES `fac_productos` (`prod_id`),
CONSTRAINT `FK5mdchli2e5cvtum16hh3p0l00` FOREIGN KEY (`fact_id`) REFERENCES `fac_facturas` (`fact_id`)
) ENGINE=InnoDB;