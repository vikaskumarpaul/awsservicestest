package com.awstest.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="USERS")
public class UsersEntity extends AbstractTimestampEntity
{

    private static final long serialVersionUID = 1L;

    /**
     * The column <code>public.users.id</code>.
     */
    @Id
    @SequenceGenerator(name = "userid_seq", sequenceName = "user_id", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userid_seq")
    private long ID;

    /**
     * The column <code>public.users.firstname</code>.
     */
    @Column(name = "firstname", columnDefinition = "VARCHAR(255)", nullable = false)
    private String FIRSTNAME;

    /**
     * The column <code>public.users.lastname</code>.
     */
    @Column(name = "lastname", columnDefinition = "VARCHAR(255)", nullable = false)
    private String LASTNAME;

    /**
     * The column <code>public.users.email</code>.
     */
    @Column(name = "email", columnDefinition = "VARCHAR(255)", nullable = false)
    private String EMAIL;

    /**
     * The column <code>public.users.userid</code>.
     */
    @Column(name = "userid", columnDefinition = "VARCHAR(255)", nullable = true)
    private String USERID;

    /**
     * The column <code>public.users.status</code>.
     */
    @Column(name = "status", columnDefinition = "VARCHAR(255)", nullable = true)
    private String STATUS;

    /**
     * The column <code>public.users.customerid</code>.
     */
    @Column(name = "customerid", columnDefinition = "VARCHAR(255)", nullable = true)
    private long CUSTOMERID;
}
