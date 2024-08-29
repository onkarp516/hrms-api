package com.opethic.hrms.HRMSNew.models.master;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="holiday_tbl")
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String holidayName;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Integer totalDays;
    private Boolean holidayType;
    private String holidayDescription;
    private Boolean status;
    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    private Long createdBy;
    @Column(insertable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private Long updatedBy;

    @ManyToOne
    @JoinColumn(name="branch_id")
    @JsonManagedReference
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "company_id")
    @JsonManagedReference
    private Company company;

}
