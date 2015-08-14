package com.zhongrun.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = true)
@Table(name = "t_sys_loginperson")
public class SysLoginPersonBean implements Serializable {
    private static final long serialVersionUID = 7517080513591583073L;
    
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="person_id")
    private String person_id;
    @Column(name="login_name")
    private String login_name;
    @Column(name="login_pwd")
    private String login_pwd;
    @Column(name="b_use")
    private int b_use;
    @Column(name="identity_id")
    private int identity_id;
    @Column(name="bureau_id")
    private int bureau_id;
    @Column(name="real_name")
    private String real_name;
    
    public String getPerson_id() {
        return person_id;
    }
    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }
    public String getLogin_name() {
        return login_name;
    }
    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }
    public String getLogin_pwd() {
        return login_pwd;
    }
    public void setLogin_pwd(String login_pwd) {
        this.login_pwd = login_pwd;
    }
    public int getB_use() {
        return b_use;
    }
    public void setB_use(int b_use) {
        this.b_use = b_use;
    }
    public int getIdentity_id() {
        return identity_id;
    }
    public void setIdentity_id(int identity_id) {
        this.identity_id = identity_id;
    }
    public int getBureau_id() {
        return bureau_id;
    }
    public void setBureau_id(int bureau_id) {
        this.bureau_id = bureau_id;
    }
    public String getReal_name() {
        return real_name;
    }
    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public SysLoginPersonBean() {

    }

    public SysLoginPersonBean(String person_id, String login_name, 
            String login_pwd, int b_use, int identity_id, int bureau_id, String real_name) {
        this.person_id = person_id;
        this.login_name = login_name;
        this.login_pwd = login_pwd;
        this.b_use = b_use;
        this.identity_id = identity_id;
        this.bureau_id = bureau_id;
        this.real_name = real_name;
    }
}
