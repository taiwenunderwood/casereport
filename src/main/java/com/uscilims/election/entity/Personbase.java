package com.uscilims.election.entity;

public class Personbase {
    private Integer tid;

    private String patientNo;

    private String birthday;

    private String sex;

    private String isMarry;

    private String isBirth;

    private Integer birthNum;

    private Integer firthBirthAge;

    private String isMenopause;

    private Integer menopauseAge;

    private String nation;

    private String occupation;

    private Double height;

    private Double weight;

    private String cancerHistory;

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIsMarry() {
        return isMarry;
    }

    public void setIsMarry(String isMarry) {
        this.isMarry = isMarry == null ? null : isMarry.trim();
    }

    public String getIsBirth() {
        return isBirth;
    }

    public void setIsBirth(String isBirth) {
        this.isBirth = isBirth == null ? null : isBirth.trim();
    }

    public Integer getBirthNum() {
        return birthNum;
    }

    public void setBirthNum(Integer birthNum) {
        this.birthNum = birthNum;
    }

    public Integer getFirthBirthAge() {
        return firthBirthAge;
    }

    public void setFirthBirthAge(Integer firthBirthAge) {
        this.firthBirthAge = firthBirthAge;
    }

    public String getIsMenopause() {
        return isMenopause;
    }

    public void setIsMenopause(String isMenopause) {
        this.isMenopause = isMenopause == null ? null : isMenopause.trim();
    }

    public Integer getMenopauseAge() {
        return menopauseAge;
    }

    public void setMenopauseAge(Integer menopauseAge) {
        this.menopauseAge = menopauseAge;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCancerHistory() {
        return cancerHistory;
    }

    public void setCancerHistory(String cancerHistory) {
        this.cancerHistory = cancerHistory == null ? null : cancerHistory.trim();
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