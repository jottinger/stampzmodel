package org.javachannel.examples.stampzmodel;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by Joseph on 8/27/2014.
 */
@Entity
@Data
@NoArgsConstructor
public class User extends BaseEntity {
    String username;
    String password;
    String firstName;
    String lastName;
    String email;
     int totalPosts;
    @Temporal(TemporalType.TIMESTAMP)
    Date registrationDate;
    @Temporal(TemporalType.TIMESTAMP)
    Date lastVisit;
}
