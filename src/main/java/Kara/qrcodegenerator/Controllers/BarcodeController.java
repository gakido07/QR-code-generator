package Kara.qrcodegenerator.Controllers;

import Kara.qrcodegenerator.Generators.EanGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping("/barcode")
@CrossOrigin(origins = "https://qr-code-generator.netlify.app")
public class BarcodeController {

    @Autowired
    private EanGenerator eanGenerator;

    @GetMapping(produces = MediaType.IMAGE_PNG_VALUE)
    public BufferedImage generateBarcode(@RequestParam String text) throws  Exception {
        return eanGenerator.generateEAN13BarcodeImage(text.toUpperCase());
    }
}
