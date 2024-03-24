package com.sst.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "StaffDetails") //If class name and table name is same then no need to use @Table.
@SuppressWarnings("serial")
public class StaffEntity implements Serializable{
	
	@Id //One column must need @Id to generate PrimaryKey in database 
	@Column(name = "sId")//If variable/property name is same as column name of database is same then no need to use @Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="staff_reg_seq")//This is use to generate autoIncrement of number for column
	private Integer sId;
	
	@Column(name = "sName", length = 20)//If length not declare then by default will take 255
	private String sName;
	
	@Column(name = "sDept", length = 20)
	private String sDept;
	
	@Column(name = "sSubject", length = 20)
	private String sSubject;
	
	@Column(name = "sSalary")
	private Float sSalary;
}
