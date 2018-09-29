package com.sheldon.dynamictable.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "migrate_pass")
    private String migratePass;

    @Column(name = "twitter_id")
    private String twitterId;

    @Column(name = "birthday")
    private String birthday;

    /**
     * 1:android 2:ios
     */
    private Integer os;

    /**
     * 0:deleted 1:in use
     */
    private Integer flag;

    @Column(name = "create_time")
    private String createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return device_id
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? "" : deviceId.trim();
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? "" : userId.trim();
    }


    /**
     * @return migrate_pass
     */
    public String getMigratePass() {
        return migratePass;
    }

    /**
     * @param migratePass
     */
    public void setMigratePass(String migratePass) {
        this.migratePass = migratePass == null ? "" : migratePass.trim();
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    /**
     * @return birthday
     * */
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? "" : birthday.trim();
    }

    /**
     * 获取1:android 2:ios
     *
     * @return os - 1:android 2:ios
     */
    public Integer getOs() {
        return os;
    }

    /**
     * 设置1:android 2:ios
     *
     * @param os 1:android 2:ios
     */
    public void setOs(Integer os) {
        this.os = os;
    }

    /**
     * 获取0:deleted 1:in use
     *
     * @return flag - 0:deleted 1:in use
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置0:deleted 1:in use
     *
     * @param flag 0:deleted 1:in use
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? "" : createTime.trim();
    }
}