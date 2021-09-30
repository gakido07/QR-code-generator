package Kara.qrcodegenerator.BarcodeGenerators;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.image.BufferedImage;

@Configuration
public class EanGenerator {

    public BufferedImage generateEAN13BarcodeImage(String barcodeText)throws  Exception{
        Barcode barcode = BarcodeFactory.createEAN13(barcodeText);


        return BarcodeImageHandler.getImage(barcode);
    }
}
