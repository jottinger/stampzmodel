package org.javachannel.examples.stampzmodel;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class Post extends BaseEntity {
    @Temporal(TemporalType.TIMESTAMP)
    Date creationTime;
    String title;
    String message;
    @ManyToOne
    Topic topic;
    @ManyToOne User user;
}
