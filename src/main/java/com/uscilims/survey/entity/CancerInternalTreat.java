package com.uscilims.survey.entity;

public class CancerInternalTreat {
    private Integer tid;

    private Integer cancerTreatId;

    private String treatClassification;

    private String treatPlan;

    private String treatCircle;

    private String drugName;

    private String dose;

    private Integer frequency;

    private String startTime;

    private String endTime;

    private String treatmentEvaluation;

    private String inputName;

    private String inputTime;

    private String updateName;

    private String updateTime;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getCancerTreatId() {
        return cancerTreatId;
    }

    public void setCancerTreatId(Integer cancerTreatId) {
        this.cancerTreatId = cancerTreatId;
    }

    public String getTreatClassification() {
        return treatClassification;
    }

    public void setTreatClassification(String treatClassification) {
        this.treatClassification = treatClassification == null ? null : treatClassification.trim();
    }

    public String getTreatPlan() {
        return treatPlan;
    }

    public void setTreatPlan(String treatPlan) {
        this.treatPlan = treatPlan == null ? null : treatPlan.trim();
    }

    public String getTreatCircle() {
        return treatCircle;
    }

    public void setTreatCircle(String treatCircle) {
        this.treatCircle = treatCircle == null ? null : treatCircle.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose == null ? null : dose.trim();
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getTreatmentEvaluation() {
        return treatmentEvaluation;
    }

    public void setTreatmentEvaluation(String treatmentEvaluation) {
        this.treatmentEvaluation = treatmentEvaluation == null ? null : treatmentEvaluation.trim();
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