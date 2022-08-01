package com.example.storyshoptestthree.service;

import com.example.storyshoptestthree.dto.ClientDto;
import com.example.storyshoptestthree.entity.client.ClientEntity;

import java.util.List;

public interface IClientService {

    List<ClientDto> getAllClient();
    ClientDto getByIdclient();
    ClientEntity updateclient(ClientDto clientDto);
    void deleteClient(int id);
}
