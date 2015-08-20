import java.io.Serializable;

/**
 * Created by WYJ on 2015-08-18.
 */
public class SubscribeReq implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;

    private int subReqID;

    private String userName;

    private String productName;

    private String phoneNumber;

    private String address;

    public int getSubReqID() {
        return subReqID;
    }

    public String getUserName() {
        return userName;
    }

    public String getProductName() {
        return productName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSubReqID(int subReqID) {
        this.subReqID = subReqID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SubscribeReq{" +
                "subReqID=" + subReqID +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
