package com.opethic.hrms.HRMSNew.models.tranx.receipt;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.opethic.hrms.HRMSNew.models.master.Branch;
import com.opethic.hrms.HRMSNew.models.master.Company;
import com.opethic.hrms.HRMSNew.models.master.LedgerMaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tranx_receipt_perticulars_Details_tbl")
public class TranxReceiptPerticularsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    @JsonManagedReference
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "company_id")
    @JsonManagedReference
    private Company company;

    @ManyToOne
    @JoinColumn(name = "ledger_id")
    @JsonManagedReference
    private LedgerMaster ledgerMaster;


    @ManyToOne
    @JoinColumn(name = "tranx_receipt_master_id")
    @JsonManagedReference
    private TranxReceiptMaster tranxReceiptMaster;

    @ManyToOne
    @JoinColumn(name = "tranx_receipt_perticulars_id")
    @JsonManagedReference
    private TranxReceiptPerticulars tranxReceiptPerticulars;

    private Long tranxInvoiceId;
    private String type;
    private Double paidAmt;
    private LocalDate transactionDate;
    private String tranxNo;
    private Boolean status;
    private Double totalAmt;

    @CreationTimestamp
    private LocalDateTime createdAt;
    private Long createdBy;
}