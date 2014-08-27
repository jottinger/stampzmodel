package org.javachannel.examples.stampzmodel;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Forum extends BaseEntity {
    @Column
    String name;
    @ManyToOne
    Category category;
    String description;
    int totalTopics;
    int totalPosts;
    @OneToMany(mappedBy="forum")
    Set<Topic> topics;
}
