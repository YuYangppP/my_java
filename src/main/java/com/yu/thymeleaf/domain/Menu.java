package com.yu.thymeleaf.domain;

/**
 * @author yuyang
 * @version 1.0.0
 * @ClassName Menu.java
 * @Description TODO
 * @Date 2019/12/22 10:57
 */
public class Menu {
    private Integer id;
    private Integer parentId;
    private String menuName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

}
