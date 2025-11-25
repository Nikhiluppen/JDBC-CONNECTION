package com.telusko;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
package com.telusko;

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;

    private String aname;
    private String tech;

    public Alien() {}

    public Alien(String aname, String tech) {
        this.aname = aname;
        this.tech = tech;
    }

    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }
    public String getAname() { return aname; }
    public void setAname(String aname) { this.aname = aname; }
    public String getTech() { return tech; }
    public void setTech(String tech) { this.tech = tech; }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
package com.telusko;

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;

    private String aname;
    private String tech;

    public Alien() {}

    public Alien(String aname, String tech) {
        this.aname = aname;
        this.tech = tech;
    }

    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }
    public String getAname() { return aname; }
    public void setAname(String aname) { this.aname = aname; }
    public String getTech() { return tech; }
    public void setTech(String tech) { this.tech = tech; }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
package com.telusko;

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;

    private String aname;
    private String tech;

    public Alien() {}

    public Alien(String aname, String tech) {
        this.aname = aname;
        this.tech = tech;
    }

    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }
    public String getAname() { return aname; }
    public void setAname(String aname) { this.aname = aname; }
    public String getTech() { return tech; }
    public void setTech(String tech) { this.tech = tech; }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
package com.telusko;

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;

    private String aname;
    private String tech;

    public Alien() {}

    public Alien(String aname, String tech) {
        this.aname = aname;
        this.tech = tech;
    }

    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }
    public String getAname() { return aname; }
    public void setAname(String aname) { this.aname = aname; }
    public String getTech() { return tech; }
    public void setTech(String tech) { this.tech = tech; }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
package com.telusko;

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;

    private String aname;
    private String tech;

    public Alien() {}

    public Alien(String aname, String tech) {
        this.aname = aname;
        this.tech = tech;
    }

    public int getAid() { return aid; }
    public void setAid(int aid) { this.aid = aid; }
    public String getAname() { return aname; }
    public void setAname(String aname) { this.aname = aname; }
    public String getTech() { return tech; }
    public void setTech(String tech) { this.tech = tech; }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
package com.telusko;

import jakarta.persistence.*;

