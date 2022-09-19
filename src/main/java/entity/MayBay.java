package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "maybay")
public class MayBay implements Serializable {

    @Id
    private int maMB;

    @Column(name = "Loai")
    private String loai;

    @Column(name = "TamBay")
    private int tamBay;
}
