import java.io.Serializable;

/**
 * Created by WYJ on 2015-08-18.
 */
public class SubscribeResp implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;

    private int subReqID;

    private int respCode;

    private String desc;

    public int getSubReqID() {
        return subReqID;
    }

    public int getRespCode() {
        return respCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setSubReqID(int subReqID) {
        this.subReqID = subReqID;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SubscribeResp{" +
                "subReqID=" + subReqID +
                ", respCode=" + respCode +
                ", desc='" + desc + '\'' +
                '}';
    }
}
