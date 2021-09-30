package Kara.qrcodegenerator.QrCodeGenerator;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.context.annotation.Configuration;

import java.awt.image.BufferedImage;

@Configuration
public class QrCodeGenerator {



    public  BufferedImage generateQRCodeImage(String barcodeText) throws Exception{
        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = barcodeWriter.encode(barcodeText, BarcodeFormat.QR_CODE, 200, 200);


        return MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
}
