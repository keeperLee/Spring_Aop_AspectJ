package com.jerry.aspectJ.demo2;

public class CustomerDaoImpl implements CustomerDao{
    @Override
    public void save() {
        System.out.println("保存用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void findOne() {
        System.out.println("查找单个用户");
    }

    @Override
    public void findAll() {
        System.out.println("查找所有用户");
    }
}
