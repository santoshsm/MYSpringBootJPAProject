package com.example.PolMgr.model;


import static javax.persistence.AccessType.PROPERTY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(PROPERTY)
@Table(name = "T_PERSON")
@NamedStoredProcedureQuery(name="getName",
							procedureName="getName",
							parameters={
									@StoredProcedureParameter(mode=ParameterMode.IN,name="persn",type=Integer.class),
									@StoredProcedureParameter(mode=ParameterMode.OUT,name="vname",type=String.class)
							})
public class Person implements Serializable
{
	private static final long		serialVersionUID	= 1L;
	private Long					persnId;
	private String					persnFirstName;
	private String					persnLastName;
	private Date 					startDate;
	private Date 					endDate;
	
	public Person()
	{}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="persnid")
	public Long getPersnId()
	{
		return persnId;
	}

	public void setPersnId(Long id)
	{
		this.persnId = id;
	}

	@Column(name="persnfirstname")
	public String getPersnFirstName()
	{
		return persnFirstName;
	}

	public void setPersnFirstName(String firstName)
	{
		this.persnFirstName = firstName;
	}

	@Column(name="persnlastname")
	public String getPersnLastName()
	{
		return persnLastName;
	}

	public void setPersnLastName(String lastName)
	{
		this.persnLastName = lastName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="startdate")
	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="enddate")
	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}
}
