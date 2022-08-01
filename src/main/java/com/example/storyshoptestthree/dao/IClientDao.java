package com.example.storyshoptestthree.dao;

import com.example.storyshoptestthree.dto.ClientDto;
import com.example.storyshoptestthree.entity.client.ClientEntity;

import java.util.List;

public interface IClientDao {
    List<ClientEntity> getAllClient();
    ClientDto getByIdclient();
    ClientEntity updateclient(ClientDto clientDto);
    void deleteClient(int id);
}
