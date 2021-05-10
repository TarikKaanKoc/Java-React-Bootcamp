package kodlamaio.hrmsfinalproject.business.concretes;

import kodlamaio.hrmsfinalproject.business.abstracts.JobTitleService;
import kodlamaio.hrmsfinalproject.dataaccess.abstracts.JobTitleDao;
import kodlamaio.hrmsfinalproject.entities.concretes.JobTitle;
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
        return this.jobTitleDao.findAll();
    }
}
