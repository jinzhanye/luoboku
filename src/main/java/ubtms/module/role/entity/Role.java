package ubtms.module.role.entity;

import ubtms.module.school.entity.School;
import ubtms.module.user.entity.User;

import java.util.List;

public class Role {
    private Integer id;

    private String roleName;

    private Integer schoolId;

    private Byte state;

    private List<Menu> menus;

    private List<User> users;

    private School school;

    public Role() {
    }

    public Role(Integer id) {
        this.id = id;
    }

    public Role(Integer id, String roleName, Integer schoolId, Byte state, List<Menu> menus, List<User> users, School school) {
        this.id = id;
        this.roleName = roleName;
        this.schoolId = schoolId;
        this.state = state;
        this.menus = menus;
        this.users = users;
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Role(String roleName, Integer schoolId, Byte state) {
        this.state = state;
        this.schoolId = schoolId;
        this.roleName = roleName;
    }

    public Role(Integer id, String roleName, Integer schoolId, List<Menu> menus, List<User> users) {
        this.id = id;
        this.roleName = roleName;
        this.schoolId = schoolId;
        this.menus = menus;
        this.users = users;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setMenus(List<Menu> menus) {

        this.menus = menus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }


    @Override
    public String toString() {
        return "Role{" +
                "state=" + state +
                ", schoolId=" + schoolId +
                ", roleName='" + roleName + '\'' +
                ", id=" + id +
                '}';
    }
}