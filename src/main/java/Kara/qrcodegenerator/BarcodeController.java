package Kara.qrcodegenerator;


import Kara.qrcodegenerator.BarcodeGenerators.EanGenerator;
import Kara.qrcodegenerator.QrCodeGenerator.QrCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.awt.image.BufferedImage;

@RestController
public class BarcodeController {


    @Autowired
    private QrCodeGenerator qrCodeGenerator;

    @Autowired
    private EanGenerator eanGenerator;



    @GetMapping(value = "/newQrCode/{barcode}", produces = MediaType.IMAGE_PNG_VALUE)
    public BufferedImage createQrCode(@PathVariable String barcode) throws Exception{

        return qrCodeGenerator.generateQRCodeImage(barcode);
    }
}
