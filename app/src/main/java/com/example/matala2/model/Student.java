package com.example.matala2.model;

public class Student {
   public String name;
    public String id;
    public String avatarUrl;
    public String phone;
    public String address;
    public Boolean cb;


    public Student(String name, String id, String phone, String address, String avatarUrl, Boolean cb) {
        this.name = name;
        this.id = id;
        this.avatarUrl = avatarUrl;
        this.cb = cb;
        this.phone= phone;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatarUtl() {
        return avatarUrl;
    }

    public void setAvatarUtl(String avatarUtl) {
        this.avatarUrl = avatarUtl;
    }

    public Boolean getCb() {
        return cb;
    }

    public void setCb(Boolean cb) {
        this.cb = cb;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
