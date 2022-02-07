/*
 * @(#)ProjectApplication.java
 *
 * Copyright 2022 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */

package zytrust.sa.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Esta clase representa la ejecución del API
 *
 * @author Enzo Huacacolque Toledo
 * @version 1, 07/02/2022
 */

@SpringBootApplication
public class ProjectApplication {
	/**Código principal de la aplicación*/
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
