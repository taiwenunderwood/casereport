package com.uscilims.survey.entity;

public class CancerTargetLesionCheck {
    private Integer id;

    private Integer imageCheckId;

    private String checkMethod;

    private String no;

    private String targetLesionLocation;

    private Double maxDiameter;

    private String inputName;

    private String inputTime;

    private String updateName;

    private String updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageCheckId() {
        return imageCheckId;
    }

    public void setImageCheckId(Integer imageCheckId) {
        this.imageCheckId = imageCheckId;
    }

    public String getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod == null ? null : checkMethod.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getTargetLesionLocation() {
        return targetLesionLocation;
    }

    public void setTargetLesionLocation(String targetLesionLocation) {
        this.targetLesionLocation = targetLesionLocation == null ? null : targetLesionLocation.trim();
    }

    public Double getMaxDiameter() {
        return maxDiameter;
    }

    public void setMaxDiameter(Double maxDiameter) {
        this.maxDiameter = maxDiameter;
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