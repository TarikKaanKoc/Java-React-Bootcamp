package com.koc.hrms.DataAccess.abstracts;

import com.koc.hrms.Entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
