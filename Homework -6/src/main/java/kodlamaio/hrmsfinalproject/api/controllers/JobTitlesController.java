package kodlamaio.hrmsfinalproject.api.controllers;

import kodlamaio.hrmsfinalproject.business.abstracts.JobTitleService;
import kodlamaio.hrmsfinalproject.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/titles")
public class JobTitlesController {

    private JobTitleService jobTitleService;

    @Autowired
    public JobTitlesController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getAll")
    public List<JobTitle>getAll(){
        return this.jobTitleService.getAll();
    }
}
