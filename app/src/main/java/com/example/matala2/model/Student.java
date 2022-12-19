package com.example.matala2.model;

public class Student {
   public String name;
    public String id;
    public String avatarUtl;
    public Boolean cb;

    public Student(String name, String id, String avatarUtl, Boolean cb) {
        this.name = name;
        this.id = id;
        this.avatarUtl = avatarUtl;
        this.cb = cb;
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
        return avatarUtl;
    }

    public void setAvatarUtl(String avatarUtl) {
        this.avatarUtl = avatarUtl;
    }

    public Boolean getCb() {
        return cb;
    }

    public void setCb(Boolean cb) {
        this.cb = cb;
    }
}
