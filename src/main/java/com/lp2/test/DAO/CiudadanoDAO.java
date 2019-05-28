package com.lp2.test.DAO;

import com.lp2.test.modelo.Ciudadano;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "ciudadanos", collectionResourceRel ="ciudadanos" )

public interface CiudadanoDAO extends CrudRepository <Ciudadano,Long>{

@Override
public List<Ciudadano> findAll();



}


