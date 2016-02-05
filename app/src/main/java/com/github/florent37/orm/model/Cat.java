package com.github.florent37.orm.model;

import fr.xebia.android.freezer.annotations.Ignore;
import fr.xebia.android.freezer.annotations.Model;

import java.util.Date;
import java.util.List;

/**
 * Created by florentchampigny on 21/01/2016.
 */
@Model
public class Cat {

    String shortName;
    Date date;

    String notIgnored;
    @Ignore String ignoreThis;

    public Cat() {
    }

    public Cat(String shortName) {
        this.shortName = shortName;
    }

    public Cat(String shortName, Date date) {
        this.shortName = shortName;
        this.date = date;
    }

    public String getShortName() {
        return shortName;
    }

    public Date getDate() {
        return date;
    }
}
