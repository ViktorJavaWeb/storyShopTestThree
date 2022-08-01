package com.example.storyshoptestthree.service;

import com.example.storyshoptestthree.dao.IClientDao;
import com.example.storyshoptestthree.dto.ClientDto;
import com.example.storyshoptestthree.dto.ProductDto;
import com.example.storyshoptestthree.entity.client.ClientEntity;
import com.example.storyshoptestthree.entity.product.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class ClientServiceIml implements IClientService{
    @Autowired
    private IClientDao iClientDao;


    @Override
    @Transactional
    public List<ClientDto> getAllClient() {
        return iClientDao.getAllClient()
                .stream()
                .map(this::convertEntityToDto)
                .toList();
    }

    @Override
    @Transactional
    public ClientDto getByIdclient() {
        return null;
    }

    @Override
    @Transactional
    public ClientEntity updateclient(ClientDto clientDto) {
        return null;
    }

    @Override
    @Transactional
    public void deleteClient(int id) {

    }


    private ClientDto convertEntityToDto(ClientEntity clientEntity) {
        ClientDto clientDto = new ClientDto();
        clientDto.setId(clientEntity.getId());
        clientDto.setFirstName(clientEntity.getFirstName().getFirstName());
        clientDto.setLastName(clientEntity.getLastName().getLastName());
        clientDto.setAge(clientEntity.getAge());
        clientDto.setPhoneNumber(clientEntity.getPhoneNumber());
        clientDto.setEmail(clientEntity.getEmail());
        return clientDto;
    }

    /*private ClientEntity convertDtoToEntity(ClientDto clientDto) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(productDto.getId());
        productEntity.setNameProduct(productDto.getProduct());
        productEntity.setBrand(new BrandEntity(productDto.getBrand()));
        productEntity.setModel(new ModelEntity(productDto.getModel()));
        productEntity.setColor(new ColorEntity(productDto.getColor()));
        productEntity.setDescription(new DescriptionEntity(productDto.getDescription()));
        return productEntity;
    }*/
}
