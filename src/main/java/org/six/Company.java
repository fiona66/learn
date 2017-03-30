package org.six;

/**
 * Created by yanglu on 3/28/17.
 */
public class Company {
    private String companyName;
    private int companyAge;
    private String companyAddress;

    // 构造方法(有参数)
    public Company(String cName, int cAge, String cAddress){
        this.companyName = cName;
        this.companyAge = cAge;
        this.companyAddress = cAddress;
    }

    //添加companyName属性的get类
    public String getCompanyName() {
        return companyName;
    }

    //添加companyName属性的set类
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //添加companyAge属性的get类
    public int getCompanyAge() {
        return companyAge;
    }

    //添加companyAge属性的set类
    public void companyAddress(int companyAge) {
        this.companyAge = companyAge;
    }

    //添加companyAddress属性的get类
    public String getCompanyAddress() {
        return companyAddress;
    }

    //添加companyName属性的get类
    public void setCompanyAge(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public boolean hasSentOfferToSix(){
        if(!companyName.equals("哔哩哔哩")){
            return true;
        } return false;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyAge=" + companyAge +
                ", companyAddress='" + companyAddress + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Company yiguo = new Company("易果生鲜", 11, "上海长宁金钟路");
        System.out.println(yiguo);
    }
}

