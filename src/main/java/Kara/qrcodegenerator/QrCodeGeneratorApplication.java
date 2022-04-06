package Kara.qrcodegenerator;

import Kara.qrcodegenerator.Generators.EanGenerator;
import Kara.qrcodegenerator.Generators.QrCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class QrCodeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrCodeGeneratorApplication.class, args);
	}

	ApplicationContext context = new AnnotationConfigApplicationContext(EanGenerator.class, QrCodeGenerator.class);
	EanGenerator eanGenerator = (EanGenerator) context.getBean("eanGenerator");
	QrCodeGenerator qrCodeGenerator = (QrCodeGenerator) context.getBean("qrCodeGenerator");
}
