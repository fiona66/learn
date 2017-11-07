package com.abtest.domain;

/**
 * Created by yanglu on 9/17/17.
 */
public class CtrainABTestName {
    private int id;
    private String exNum;
    private String exCnName;
    private String inStrucTions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExNum() {
        return exNum;
    }

    public void setExNum(String exNum) {
        this.exNum = exNum;
    }

    public String getExCnName() {
        return exCnName;
    }

    public String getInStrucTions() {
        return inStrucTions;
    }

    public void setInStrucTions(String inStructions) {
        this.inStrucTions = inStructions;
    }

    public void setexCnName(String exCnName) {
        this.exCnName = exCnName;
    }

    @Override
    public String toString() {
        return "CtrainABTestName{" +
                "id=" + id +
                ", exNum='" + exNum + '\'' +
                ", exCnName='" + exCnName + '\'' +
                ", inStructions='" + inStrucTions + '\'' +
                '}';
    }
}
