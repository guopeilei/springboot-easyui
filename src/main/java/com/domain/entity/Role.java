package com.domain.entity;

public class Role {
    private int roleId;
    private String roleName;
    private int authortyId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getAuthortyId() {
        return authortyId;
    }

    public void setAuthortyId(int authortyId) {
        this.authortyId = authortyId;
    }
}
