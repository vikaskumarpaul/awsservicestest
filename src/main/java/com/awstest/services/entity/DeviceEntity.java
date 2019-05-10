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
@Getter
@Setter
@NoArgsConstructor
@Table(name="DEVICE")
public class DeviceEntity extends AbstractTimestampEntity
{

    private static final long serialVersionUID = 1L;

    /**
     * The column <code>public.device.id</code>.
     */
    @Id
    @SequenceGenerator(name = "Device_seq_id", initialValue = 1, schema = "device_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Device_seq_id")
    private long ID;

    /**
     * The column <code>public.device.batchid</code>.
     */
    /*
     * @Column(name = "batchid", columnDefinition = "CHAR(30)", nullable = true)
     * private String BATCHID;
     */

    /**
     * The column <code>public.device.producttypeid</code>.
     */
    @Column(name = "batchid", columnDefinition = "CHAR(12)", nullable = true)
    private String PRODUCTTYPEID;

    /**
     * The column <code>public.device.waferid</code>.
     */
    @Column(name = "waferid", columnDefinition = "CHAR(30)", nullable = true)
    private String WAFERID;

    /**
     * The column <code>public.device.reelid</code>.
     */
    @Column(name = "reelid", columnDefinition = "CHAR(30)", nullable = true)
    private String REELID;

    /**
     * The column <code>public.device.trayid</code>.
     */
    @Column(name = "trayid", columnDefinition = "CHAR(30)", nullable = true)
    private String TRAYID;

    /**
     * The column <code>public.device.customerid</code>.
     */
    @Column(name = "customerid", nullable = true)
    private Long CUSTOMERID;

}
