package wqz.service.bean;

import java.io.Serializable;

/**
 * @Author: qizhi.wang
 * @Email: qizhi.wang@rograndec.com
 * @CreateDate: 2019/1/5
 * @Version: 1.0
 */
public class Address implements Serializable {
    private int id;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

