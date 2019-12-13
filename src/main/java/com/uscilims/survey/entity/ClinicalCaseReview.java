package com.uscilims.survey.entity;

public class ClinicalCaseReview {
    private Integer tid;

    private String patientNo;

    private String viewTime;

    private Integer reviewNum;

    private String reviewTime;

    private String ECOGEvaluation;

    private String evaluationReason;

    private String evaluationTime;

    private String score;

    private String cancerSignCheck;

    private String checkTime;

    private String haveCarcinAntigenCheck;

    private String haveImagingCheck;

    private String haveCancerTreatRecord;

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

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo == null ? null : patientNo.trim();
    }

    public String getViewTime() {
        return viewTime;
    }

    public void setViewTime(String viewTime) {
        this.viewTime = viewTime == null ? null : viewTime.trim();
    }

    public Integer getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(Integer reviewNum) {
        this.reviewNum = reviewNum;
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime == null ? null : reviewTime.trim();
    }

    public String getECOGEvaluation() {
        return ECOGEvaluation;
    }

    public void setECOGEvaluation(String ECOGEvaluation) {
        this.ECOGEvaluation = ECOGEvaluation == null ? null : ECOGEvaluation.trim();
    }

    public String getEvaluationReason() {
        return evaluationReason;
    }

    public void setEvaluationReason(String evaluationReason) {
        this.evaluationReason = evaluationReason == null ? null : evaluationReason.trim();
    }

    public String getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime == null ? null : evaluationTime.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getCancerSignCheck() {
        return cancerSignCheck;
    }

    public void setCancerSignCheck(String cancerSignCheck) {
        this.cancerSignCheck = cancerSignCheck == null ? null : cancerSignCheck.trim();
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime == null ? null : checkTime.trim();
    }

    public String getHaveCarcinAntigenCheck() {
        return haveCarcinAntigenCheck;
    }

    public void setHaveCarcinAntigenCheck(String haveCarcinAntigenCheck) {
        this.haveCarcinAntigenCheck = haveCarcinAntigenCheck == null ? null : haveCarcinAntigenCheck.trim();
    }

    public String getHaveImagingCheck() {
        return haveImagingCheck;
    }

    public void setHaveImagingCheck(String haveImagingCheck) {
        this.haveImagingCheck = haveImagingCheck == null ? null : haveImagingCheck.trim();
    }

    public String getHaveCancerTreatRecord() {
        return haveCancerTreatRecord;
    }

    public void setHaveCancerTreatRecord(String haveCancerTreatRecord) {
        this.haveCancerTreatRecord = haveCancerTreatRecord == null ? null : haveCancerTreatRecord.trim();
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