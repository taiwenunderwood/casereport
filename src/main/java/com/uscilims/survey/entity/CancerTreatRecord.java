package com.uscilims.survey.entity;

public class CancerTreatRecord {
    private Integer tid;

    private Integer reviewId;

    private String haveOperation;

    private String haveRediotherapy;

    private String haveInternalMedicine;

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

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getHaveOperation() {
        return haveOperation;
    }

    public void setHaveOperation(String haveOperation) {
        this.haveOperation = haveOperation == null ? null : haveOperation.trim();
    }

    public String getHaveRediotherapy() {
        return haveRediotherapy;
    }

    public void setHaveRediotherapy(String haveRediotherapy) {
        this.haveRediotherapy = haveRediotherapy == null ? null : haveRediotherapy.trim();
    }

    public String getHaveInternalMedicine() {
        return haveInternalMedicine;
    }

    public void setHaveInternalMedicine(String haveInternalMedicine) {
        this.haveInternalMedicine = haveInternalMedicine == null ? null : haveInternalMedicine.trim();
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