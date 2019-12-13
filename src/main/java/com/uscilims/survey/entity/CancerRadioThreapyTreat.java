package com.uscilims.survey.entity;

public class CancerRadioThreapyTreat {
    private Integer tid;

    private Integer cancerTreatId;

    private String startTime;

    private String endTime;

    private String radiotherapyPart;

    private String radioDose;

    private String radioType;

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

    public String getRadiotherapyPart() {
        return radiotherapyPart;
    }

    public void setRadiotherapyPart(String radiotherapyPart) {
        this.radiotherapyPart = radiotherapyPart == null ? null : radiotherapyPart.trim();
    }

    public String getRadioDose() {
        return radioDose;
    }

    public void setRadioDose(String radioDose) {
        this.radioDose = radioDose == null ? null : radioDose.trim();
    }

    public String getRadioType() {
        return radioType;
    }

    public void setRadioType(String radioType) {
        this.radioType = radioType == null ? null : radioType.trim();
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