package edu.harvard.i2b2.plugin.pb.datavo;

// Generated Oct 10, 2006 5:52:18 PM by Hibernate Tools 3.1.0.beta5

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * QtQueryResultInstance generated by hbm2java
 */
public class QtQueryResultInstance implements java.io.Serializable {

	// Fields

	private String resultInstanceId = null;
	private QtQueryStatusType qtQueryStatusType = null;
	private QtQueryResultType qtQueryResultType = null;
	private QtQueryInstance qtQueryInstance = null;
	private String description = null;

	private Integer setSize = null;
	private Date startDate = null;
	private Date endDate = null;
	private String message = null;
	private Set<QtXmlResult> qtXmlResults = new HashSet<QtXmlResult>(0);

	private String deleteFlag = null;
	private String obfuscateMethod = null;

	// Constructors

	/** default constructor */
	public QtQueryResultInstance() {
	}

	/** minimal constructor */
	public QtQueryResultInstance(String resultInstanceId,
			QtQueryStatusType qtQueryStatusType,
			QtQueryResultType qtQueryResultType, Date startDate) {
		this.resultInstanceId = resultInstanceId;
		this.qtQueryStatusType = qtQueryStatusType;
		this.qtQueryResultType = qtQueryResultType;
		this.startDate = startDate;
	}

	/** full constructor */
	public QtQueryResultInstance(String resultInstanceId,
			QtQueryStatusType qtQueryStatusType,
			QtQueryResultType qtQueryResultType,
			QtQueryInstance qtQueryInstance, Integer setSize, Date startDate,
			Date endDate, Set<QtXmlResult> qtXmlResults) {
		this.resultInstanceId = resultInstanceId;
		this.qtQueryStatusType = qtQueryStatusType;
		this.qtQueryResultType = qtQueryResultType;
		this.qtQueryInstance = qtQueryInstance;
		this.setSize = setSize;
		this.startDate = startDate;
		this.endDate = endDate;
		this.qtXmlResults = qtXmlResults;

	}

	// Property accessors
	public String getResultInstanceId() {
		return this.resultInstanceId;
	}

	public void setResultInstanceId(String resultInstanceId) {
		this.resultInstanceId = resultInstanceId;
	}

	public QtQueryStatusType getQtQueryStatusType() {
		return this.qtQueryStatusType;
	}

	public void setQtQueryStatusType(QtQueryStatusType qtQueryStatusType) {
		this.qtQueryStatusType = qtQueryStatusType;
	}

	public QtQueryResultType getQtQueryResultType() {
		return this.qtQueryResultType;
	}

	public void setQtQueryResultType(QtQueryResultType qtQueryResultType) {
		this.qtQueryResultType = qtQueryResultType;
	}

	public QtQueryInstance getQtQueryInstance() {
		return this.qtQueryInstance;
	}

	public void setQtQueryInstance(QtQueryInstance qtQueryInstance) {
		this.qtQueryInstance = qtQueryInstance;
	}

	public Integer getSetSize() {
		return this.setSize;
	}

	public void setSetSize(Integer setSize) {
		this.setSize = setSize;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Set<QtXmlResult> getQtXmlResults() {
		return this.qtXmlResults;
	}

	public void setQtXmlResults(Set<QtXmlResult> qtXmlResults) {
		this.qtXmlResults = qtXmlResults;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObfuscateMethod() {
		return obfuscateMethod;
	}

	public void setObfuscateMethod(String obfuscateMethod) {
		this.obfuscateMethod = obfuscateMethod;
	}

}
