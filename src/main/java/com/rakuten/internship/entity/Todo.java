package com.rakuten.internship.entity;

/**
 * このクラスは、タスク管理の対象となるTodoのエンティティーです。
 * エンティティーとして使えるように、コードを記入してください。
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Todo {
    private static final String Generationtype = null;
	// TODO 必要なコードを記入してください。
    // test
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;
    private String title;
    private String description;
    
    public Integer getNo(){
        return no;
    }
    public void setNo(Integer no){
        this.no = no;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    
}