package kodlamaio.hrmsfinalproject.dataaccess.abstracts;

import kodlamaio.hrmsfinalproject.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

}
