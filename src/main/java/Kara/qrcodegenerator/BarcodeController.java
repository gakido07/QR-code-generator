package Kara.qrcodegenerator;


import Kara.qrcodegenerator.BarcodeGenerators.EanGenerator;
import Kara.qrcodegenerator.QrCodeGenerator.QrCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.awt.image.BufferedImage;

@RestController
public class BarcodeController {


    @Autowired
    private QrCodeGenerator qrCodeGenerator;

    @Autowired
    private EanGenerator eanGenerator;



    @GetMapping(value = "/newQrCode", produces = MediaType.IMAGE_PNG_VALUE)
    @CrossOrigin(origins = "http://localhost:3000")
    public BufferedImage createQrCode(@RequestParam String barcode) throws Exception{

        return qrCodeGenerator.generateQRCodeImage(barcode);
    }
}
