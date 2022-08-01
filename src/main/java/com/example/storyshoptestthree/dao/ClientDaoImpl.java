package com.example.storyshoptestthree.dao;

import com.example.storyshoptestthree.dto.ClientDto;
import com.example.storyshoptestthree.entity.client.ClientEntity;
import com.example.storyshoptestthree.other.ColorFont;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Slf4j
@Repository
public class ClientDaoImpl implements IClientDao {
    private static final Logger logger= LoggerFactory.getLogger(ClientEntity.class);
    @Autowired
    public EntityManager entityManager;

    @Override
    public List<ClientEntity> getAllClient() {

        logger.info("{}getAllClient{}ClientDaoImpl",new ColorFont().yellowFont(""),new ColorFont().greyFont(""));
        Query query = entityManager.createQuery("FROM ClientEntity");
        List<ClientEntity> allClients = query.getResultList();
        return allClients;
    }

    @Override
    public ClientDto getByIdclient() {
        return null;
    }

    @Override
    public ClientEntity updateclient(ClientDto clientDto) {
        return null;
    }

    @Override
    public void deleteClient(int id) {

    }
}
