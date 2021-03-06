package cn.trasen.tsrelease.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class TbProduct {
    private Integer pkid;

    /**
     * 父节点
     */
    private Integer parent;

    /**
     * 节点名称
     */
    private String name;

    /**
     * 产品或者模块(pro,mod)
     */
    private String type;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 部门id
     */
    private String depId;

    /**
     * 部门名称
     */
    private String depName;

    /**
     * 更新时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 操作人
     */
    private String operator;

    private Integer isVaild;

}