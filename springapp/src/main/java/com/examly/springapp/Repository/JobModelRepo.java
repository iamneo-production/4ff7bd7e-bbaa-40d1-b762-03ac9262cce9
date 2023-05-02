package com.examly.springapp.Repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.JobModel;

@Repository
public interface JobModelRepo extends JpaRepository<JobModel, String>{

}
