package com.example.hotrestart.entity;

/**
 * @program: hotrestart
 * @description: Brand
 * @author: richen
 * @create: 2019-03-14 15:30
 **/

public class Brand {
    /**
     * id : 5237
     * name : 睿行M70
     * pic : http://cdn.sosocar.cn/upload/images/series/20170426/vmai5900512c8bc7a!300x225.png
     * prices : 6.05-6.64万
     * ename : ruixing-m70
     */

    private int id;
    private String name;
    private String pic;
    private String prices;
    private String ename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
