package com.ruoyi.common.domain;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ruoyi.common.domain.sys.SysDept;
import com.ruoyi.common.domain.sys.SysMenu;

/**
 * Treeselect树结构实体类
 *
 * @author ruoyi
 */
public class TreeSelectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 节点ID
     */
    private Long id;

    /**
     * 节点名称
     */
    private String label;

    /**
     * 子节点
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TreeSelectEntity> children;

    public TreeSelectEntity() {

    }

    public TreeSelectEntity(SysDept dept) {
        this.id = dept.getDeptId();
        this.label = dept.getDeptName();
        this.children = dept.getChildren().stream().map(TreeSelectEntity::new).collect(Collectors.toList());
    }

    public TreeSelectEntity(SysMenu menu) {
        this.id = menu.getMenuId();
        this.label = menu.getMenuName();
        this.children = menu.getChildren().stream().map(TreeSelectEntity::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<TreeSelectEntity> getChildren() {
        return children;
    }

    public void setChildren(List<TreeSelectEntity> children) {
        this.children = children;
    }
}
