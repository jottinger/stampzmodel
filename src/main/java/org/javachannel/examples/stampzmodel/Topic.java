package org.javachannel.examples.stampzmodel;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Topic extends BaseEntity {
    String title;
    @ManyToOne
    Forum forum;
    @Temporal(TemporalType.TIMESTAMP)
    Date creationTime;
    @Temporal(TemporalType.TIMESTAMP)
    Date lastPostTime;
    int totalViews;
    int totalReplies;
    @ManyToOne
    User createdBy;
    @ManyToOne
    User lastPostBy;
    @OneToMany(mappedBy = "topic")
    Set<Post> posts;
}
