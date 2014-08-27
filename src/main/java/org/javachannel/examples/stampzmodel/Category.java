package org.javachannel.examples.stampzmodel;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Category extends BaseEntity {
    @Column
    String name;
    @OneToMany(mappedBy = "category")
    Set<Forum> forums;
}
