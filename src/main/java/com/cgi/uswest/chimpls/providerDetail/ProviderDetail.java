package com.cgi.uswest.chimpls.providerDetail;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class ProviderDetail {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	private String id_provider_org;
    private String nm_prvd;
    private String tx_license;
	
    public String getId_provider_org() {
		return id_provider_org;
	}
	public void setId_provider_org(String id_provider_org) {
		this.id_provider_org = id_provider_org;
	}
	public String getNm_prvd() {
		return nm_prvd;
	}
	public void setNm_prvd(String nm_prvd) {
		this.nm_prvd = nm_prvd;
	}
	public String getTx_license() {
		return tx_license;
	}
	public void setTx_license(String tx_license) {
		this.tx_license = tx_license;
	}
}
