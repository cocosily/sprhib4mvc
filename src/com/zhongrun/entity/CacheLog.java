package com.zhongrun.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = true)
@Table(name = "t_cache_log")
public class CacheLog implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 717288216187174213L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "prefix")
    private String prefix;
    @Column(name = "cache_key")
    private String cache_key;
    @Column(name = "add_time")
    private Timestamp add_time;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getCache_key() {
        return cache_key;
    }

    public void setCache_key(String cache_key) {
        this.cache_key = cache_key;
    }

    public Timestamp getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Timestamp add_time) {
        this.add_time = add_time;
    }

    public CacheLog() {
        super();
    }

    public CacheLog(BigInteger id, String prefix, String cache_key,
                    Timestamp add_time) {
        super();
        this.id = id;
        this.prefix = prefix;
        this.cache_key = cache_key;
        this.add_time = add_time;
    }

}
