package org.six.practice;

/**
 * Created by yanglu on 3/20/17.
 */
public class Company {
    private int companyAge;
    private String companyName;
    private String companyAddress;

    public Company(String companyName, int companyAge, String companyAddress) {
        this.companyName = companyName;
        this.companyAge = companyAge;
        this.companyAddress = companyAddress;
//        System.out.println("公司名称:"+companyName+"\n"+"公司成立年限:"+companyAge+"\n"+"公司地址是:"+companyAddress);
    }

    public boolean hasSentOfferToSix(){
        boolean offer;
        if(this.companyName != "哔哩哔哩"){
            offer = true;
        }else{
            offer = false;
        }
        return offer;
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

    public void setAge(int companyAge) {
        this.companyAge = companyAge;
    }

    public int getCompanyAge() {
        return companyAge;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyAge=" + companyAge +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                '}';
    }


    public static void main(String[] args) {

    }

}




