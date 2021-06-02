package com.fado.entitiy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "volume")
public class Volume {
    @Id
    String code;
    String company;
    long volume;

    public Volume(String code, String company, long volume) {
        this.code = code;
        this.company = company;
        this.volume = volume;

    }
}
