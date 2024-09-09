package com.epichistory.macro.photoz.clone;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadController {
    
    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> download(@PathVariable long id) {
        byte[] data = new byte[0];
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(data, headers, HttpStatus.OK);
    }
    
}
