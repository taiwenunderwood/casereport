package com.uscilims.survey.entity;

public class CancerImageCheck {
    private Integer tid;

    private String reviewId;

    private String checkTime;

    private String havaTargetLesion;

    private Double maxDiameterSum;

    private String targetLesionEvaluation;

    private String noTargetLesionEvaluation;

    private String haveNewTargetLesion;

    private String wholeEvalution;

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

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId == null ? null : reviewId.trim();
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime == null ? null : checkTime.trim();
    }

    public String getHavaTargetLesion() {
        return havaTargetLesion;
    }

    public void setHavaTargetLesion(String havaTargetLesion) {
        this.havaTargetLesion = havaTargetLesion == null ? null : havaTargetLesion.trim();
    }

    public Double getMaxDiameterSum() {
        return maxDiameterSum;
    }

    public void setMaxDiameterSum(Double maxDiameterSum) {
        this.maxDiameterSum = maxDiameterSum;
    }

    public String getTargetLesionEvaluation() {
        return targetLesionEvaluation;
    }

    public void setTargetLesionEvaluation(String targetLesionEvaluation) {
        this.targetLesionEvaluation = targetLesionEvaluation == null ? null : targetLesionEvaluation.trim();
    }

    public String getNoTargetLesionEvaluation() {
        return noTargetLesionEvaluation;
    }

    public void setNoTargetLesionEvaluation(String noTargetLesionEvaluation) {
        this.noTargetLesionEvaluation = noTargetLesionEvaluation == null ? null : noTargetLesionEvaluation.trim();
    }

    public String getHaveNewTargetLesion() {
        return haveNewTargetLesion;
    }

    public void setHaveNewTargetLesion(String haveNewTargetLesion) {
        this.haveNewTargetLesion = haveNewTargetLesion == null ? null : haveNewTargetLesion.trim();
    }

    public String getWholeEvalution() {
        return wholeEvalution;
    }

    public void setWholeEvalution(String wholeEvalution) {
        this.wholeEvalution = wholeEvalution == null ? null : wholeEvalution.trim();
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