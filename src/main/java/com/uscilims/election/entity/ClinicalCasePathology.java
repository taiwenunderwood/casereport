package com.uscilims.election.entity;

public class ClinicalCasePathology {
    private Integer tid;

    private String patientNo;

    private String treatTime;

    private String ajcc;

    private String fenhuadegree;

    private String mianyizuhua;

    private String ERout80Present;

    private String PRout80Present;

    private String HER2;

    private String FISH;

    private String ki67;

    private String PT;

    private String PN;

    private String PM;

    private Double cancerOrganSize;

    private String lymphTransfer;

    private String operationTime;

    private String operationName;

    private String operationNature;

    private String samplingTime;

    private String inputName;

    private String inputTime;

    private String updateName;

    private String updateTime;

    public String getPT() {
        return PT;
    }

    public void setPT(String PT) {
        this.PT = PT;
    }

    public String getPN() {
        return PN;
    }

    public void setPN(String PN) {
        this.PN = PN;
    }

    public String getPM() {
        return PM;
    }

    public void setPM(String PM) {
        this.PM = PM;
    }



    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo == null ? null : patientNo.trim();
    }

    public String getTreatTime() {
        return treatTime;
    }

    public void setTreatTime(String treatTime) {
        this.treatTime = treatTime == null ? null : treatTime.trim();
    }

    public String getAjcc() {
        return ajcc;
    }

    public void setAjcc(String ajcc) {
        this.ajcc = ajcc == null ? null : ajcc.trim();
    }

    public String getFenhuadegree() {
        return fenhuadegree;
    }

    public void setFenhuadegree(String fenhuadegree) {
        this.fenhuadegree = fenhuadegree == null ? null : fenhuadegree.trim();
    }

    public String getMianyizuhua() {
        return mianyizuhua;
    }

    public void setMianyizuhua(String mianyizuhua) {
        this.mianyizuhua = mianyizuhua == null ? null : mianyizuhua.trim();
    }

    public String getERout80Present() {
        return ERout80Present;
    }

    public void setERout80Present(String ERout80Present) {
        this.ERout80Present = ERout80Present == null ? null : ERout80Present.trim();
    }

    public String getPRout80Present() {
        return PRout80Present;
    }

    public void setPRout80Present(String PRout80Present) {
        this.PRout80Present = PRout80Present == null ? null : PRout80Present.trim();
    }

    public String getHER2() {
        return HER2;
    }

    public void setHER2(String HER2) {
        this.HER2 = HER2 == null ? null : HER2.trim();
    }

    public String getFISH() {
        return FISH;
    }

    public void setFISH(String FISH) {
        this.FISH = FISH == null ? null : FISH.trim();
    }

    public String getKi67() {
        return ki67;
    }

    public void setKi67(String ki67) {
        this.ki67 = ki67 == null ? null : ki67.trim();
    }

    public Double getCancerOrganSize() {
        return cancerOrganSize;
    }

    public void setCancerOrganSize(Double cancerOrganSize) {
        this.cancerOrganSize = cancerOrganSize;
    }

    public String getLymphTransfer() {
        return lymphTransfer;
    }

    public void setLymphTransfer(String lymphTransfer) {
        this.lymphTransfer = lymphTransfer == null ? null : lymphTransfer.trim();
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime == null ? null : operationTime.trim();
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    public String getOperationNature() {
        return operationNature;
    }

    public void setOperationNature(String operationNature) {
        this.operationNature = operationNature == null ? null : operationNature.trim();
    }

    public String getSamplingTime() {
        return samplingTime;
    }

    public void setSamplingTime(String samplingTime) {
        this.samplingTime = samplingTime == null ? null : samplingTime.trim();
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName == null ? null : inputName.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}