package com.example.storyshoptestthree.config;


import com.example.storyshoptestthree.dao.IClientDao;
import com.example.storyshoptestthree.dto.ClientDto;
import com.example.storyshoptestthree.service.IClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/client")
public class MyConfigClient {

    @Autowired
    private IClientService iClientService;


    @GetMapping("/all")
    public List<ClientDto> getAllClient(){
        return iClientService.getAllClient();
    }

}
