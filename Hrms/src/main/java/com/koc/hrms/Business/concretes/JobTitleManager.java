package com.koc.hrms.Business.concretes;

import com.koc.hrms.Business.abstracts.JobTitleService;
import com.koc.hrms.DataAccess.abstracts.JobTitleDao;
import com.koc.hrms.Entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public List<JobTitle> getAll() {
        return jobTitleDao.findAll();
    }

}
