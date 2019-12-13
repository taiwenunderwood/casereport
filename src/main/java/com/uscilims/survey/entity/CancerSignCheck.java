package com.uscilims.survey.entity;

public class CancerSignCheck {
    private Integer tid;

    private Integer antigenCheckId;

    private String projectName;

    private String checkResult;

    private String unit;

    private String clinicalValue;

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

    public Integer getAntigenCheckId() {
        return antigenCheckId;
    }

    public void setAntigenCheckId(Integer antigenCheckId) {
        this.antigenCheckId = antigenCheckId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult == null ? null : checkResult.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getClinicalValue() {
        return clinicalValue;
    }

    public void setClinicalValue(String clinicalValue) {
        this.clinicalValue = clinicalValue == null ? null : clinicalValue.trim();
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