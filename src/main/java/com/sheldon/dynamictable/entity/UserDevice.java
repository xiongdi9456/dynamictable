package com.sheldon.dynamictable.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class UserDevice {
    @Id
    @Column(name = "ud_device_id")
    private String udDeviceId;

    @Column(name = "ud_user_id")
    private String udUserId;

    /**
     * 1.guest 2.migrate 3.twitter
     */
    @Column(name = "ud_logintype")
    private Integer udLogintype;

    /**
     * @return ud_device_id
     */
    public String getUdDeviceId() {
        return udDeviceId;
    }

    /**
     * @param udDeviceId
     */
    public void setUdDeviceId(String udDeviceId) {
        this.udDeviceId = udDeviceId == null ? null : udDeviceId.trim();
    }

    /**
     * @return ud_user_id
     */
    public String getUdUserId() {
        return udUserId;
    }

    /**
     * @param udUserId
     */
    public void setUdUserId(String udUserId) {
        this.udUserId = udUserId == null ? null : udUserId.trim();
    }

    /**
     * 获取1.guest 2.migrate 3.twitter
     *
     * @return ud_logintype - 1.guest 2.migrate 3.twitter
     */
    public Integer getUdLogintype() {
        return udLogintype;
    }

    /**
     * 设置1.guest 2.migrate 3.twitter
     *
     * @param udLogintype 1.guest 2.migrate 3.twitter
     */
    public void setUdLogintype(Integer udLogintype) {
        this.udLogintype = udLogintype;
    }
}