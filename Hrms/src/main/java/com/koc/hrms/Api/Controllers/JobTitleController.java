package com.koc.hrms.Api.Controllers;

import com.koc.hrms.Business.abstracts.JobTitleService;
import com.koc.hrms.Entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/title")
public class JobTitleController {

    private JobTitleService jobTitleService;

    @Autowired
    public JobTitleController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getAll")
    private List<JobTitle>getAll(){
        return this.jobTitleService.getAll();
    }
}
