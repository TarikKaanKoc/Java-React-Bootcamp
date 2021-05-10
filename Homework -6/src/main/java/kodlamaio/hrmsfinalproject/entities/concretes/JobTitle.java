package kodlamaio.hrmsfinalproject.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data // (Lombok) Data ile get / set'lar oluşturulmaktadır.

@AllArgsConstructor // Lombok İle parametreli contructor oluşturuluyor.
@NoArgsConstructor // Lombok ile boş cns oluşturuluyor.

@Entity
@Table(name ="job_titles") //Veritabanındaki tablomuzun karşılığını göstermektedir.
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //

    @Column(name = "id") //Sutüun karşılığı
    private int id;

    @Column(name = "title") //Sutün karşılığı
    private String title;
}
