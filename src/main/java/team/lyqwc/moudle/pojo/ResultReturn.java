package team.lyqwc.moudle.pojo;

import java.io.Serializable;


public class ResultReturn implements Serializable {
    //属性
    private String code;//http的状态码，用于 确定网络状态
    
    private String msg;//描述信息
    
    private Object data;//查询的结果
    
    //空参构造  alter+insert
    
    public ResultReturn() {
    }
    
    //两参构造
    public ResultReturn(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    
    //全参构造
    
    public ResultReturn(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    //getter/setter
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        String sb = "ResultReturn{" + "code='" + code + '\'' +
                            ", msg='" + msg + '\'' +
                            ", data=" + data +
                            '}';
        return sb;
    }
}
