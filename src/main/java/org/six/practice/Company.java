package org.six.practice;

/**
 * Created by yanglu on 3/20/17.
 */
public class Company {
    private int companyAge;
    private String companyName;
    private String companyAddress;

    public Company(String companyName,int companyAge,String companyAddress){
        this.companyName = companyName;
        this.companyAge = companyAge;
        this.companyAddress = companyAddress;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setAge(int companyAge){
        this.companyAge = companyAge;
    }

    public int getCompanyAge(){
        return companyAge;
    }


}

