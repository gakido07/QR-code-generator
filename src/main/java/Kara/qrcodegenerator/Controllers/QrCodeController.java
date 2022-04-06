package Kara.qrcodegenerator.Controllers;

import Kara.qrcodegenerator.Generators.QrCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping("/qr")
@CrossOrigin(origins = "https://qr-code-generator.netlify.app")
public class QrCodeController {

    @Autowired
    private QrCodeGenerator qrCodeGenerator;

    @GetMapping(produces = MediaType.IMAGE_PNG_VALUE)
    public BufferedImage createQrCode(@RequestParam String text) throws Exception{
        return qrCodeGenerator.generateQRCodeImage(text);
    }
}
