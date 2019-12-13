package com.uscilims.election.dto;

import com.uscilims.election.entity.CaseSelect;
import com.uscilims.election.entity.ClinicalCase;
import com.uscilims.election.entity.ClinicalCasePathology;
import com.uscilims.election.entity.Personbase;

public class ElectionInfoDto {
    private CaseSelect caseSelect;
    private ClinicalCase clinicalCase;
    private ClinicalCasePathology clinicalCasePathology;
    private Personbase personbase;
    private String othernation;
    private String otherCancerHistory;

    public String getOtherCancerHistory() {
        return otherCancerHistory;
    }

    public void setOtherCancerHistory(String otherCancerHistory) {
        this.otherCancerHistory = otherCancerHistory;
    }

    public String getOthernation() {
        return othernation;
    }

    public void setOthernation(String othernation) {
        this.othernation = othernation;
    }

    public ElectionInfoDto() {
        this.caseSelect = new CaseSelect();
        this.clinicalCase = new ClinicalCase();
        this.clinicalCasePathology = new ClinicalCasePathology();
        this.personbase = new Personbase();
    }

    public CaseSelect getCaseSelect() {
        return caseSelect;
    }

    public void setCaseSelect(CaseSelect caseSelect) {
        this.caseSelect = caseSelect;
    }

    public ClinicalCase getClinicalCase() {
        return clinicalCase;
    }

    public void setClinicalCase(ClinicalCase clinicalCase) {
        this.clinicalCase = clinicalCase;
    }

    public ClinicalCasePathology getClinicalCasePathology() {
        return clinicalCasePathology;
    }

    public void setClinicalCasePathology(ClinicalCasePathology clinicalCasePathology) {
        this.clinicalCasePathology = clinicalCasePathology;
    }

    public Personbase getPersonbase() {
        return personbase;
    }

    public void setPersonbase(Personbase personbase) {
        this.personbase = personbase;
    }

    public String getPatientNo() {
        return this.caseSelect.getPatientNo();
    }

    public void setPatientNo(String patientNo) {
        this.caseSelect.setPatientNo(patientNo);
    }

    public String getIsSign() {
        return caseSelect.getIsSign();
    }

    public void setIsSign(String isSign) {
        caseSelect.setIsSign(isSign);
    }

    public String getSignTime() {
        return caseSelect.getSignTime();
    }

    public void setSignTime(String signTime) {
        this.caseSelect.setSignTime(signTime);
    }

    public String getRuxuan1() {
        return caseSelect.getRuxuan1();
    }

    public void setRuxuan1(String ruxuan1) {
        caseSelect.setRuxuan1(ruxuan1);
    }

    public String getRuxuan2() {
        return caseSelect.getRuxuan2();
    }

    public void setRuxuan2(String ruxuan2) {
        caseSelect.setRuxuan2(ruxuan2);
    }

    public String getRuxuan3() {
        return caseSelect.getRuxuan3();
    }

    public void setRuxuan3(String ruxuan3) {
        this.caseSelect.setRuxuan3(ruxuan3);
    }

    public String getRuxuan4() {
        return this.caseSelect.getRuxuan4();
    }

    public void setRuxuan4(String ruxuan4) {
        this.caseSelect.setRuxuan4(ruxuan4);
    }

    public String getRuxuan5() {
        return this.caseSelect.getRuxuan5();
    }

    public void setRuxuan5(String ruxuan5) {
        this.caseSelect.setRuxuan5(ruxuan5);
    }

    public String getRuxuan6() {
        return this.caseSelect.getRuxuan6();
    }

    public void setRuxuan6(String ruxuan6) {
        this.caseSelect.setRuxuan6(ruxuan6);
    }

    public String getPaichu1() {
        return this.caseSelect.getPaichu1();
    }

    public void setPaichu1(String paichu1) {
        this.caseSelect.setPaichu1(paichu1);
    }

    public String getPaichu2() {
        return this.caseSelect.getPaichu2();
    }

    public void setPaichu2(String paichu2) {
        this.caseSelect.setPaichu2(paichu2);
    }

    public String getPaichu3() {
        return this.caseSelect.getPaichu3();
    }

    public void setPaichu3(String paichu3) {
        this.caseSelect.setPaichu3(paichu3);
    }

}
