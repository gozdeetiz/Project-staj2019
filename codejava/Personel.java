package net.codejava;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personel")
public class Personel {
	
	@Column(name="idpersonel")
	private long idpersonel;	
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="soyad")
	private String soyad;
	
	@Column(name="gorev")
	private String gorev;
	
	@Column(name="yas")
	private int yas;
	
	@Column(name="isegiristarihi")
	private String isegiristarihi;
	
	@Column(name="istencikistarihi")
	private String istencikistarihi;
	
	@Column(name="projeler")
	private String projeler;
	
	@Column(name="ozgecmis")
	private String ozgecmis;
	
	@Column(name="sertifika")
	private String sertifika;
	
	@Column(name="email")
	private String email;
	
	protected Personel() {
		
	}
	
	public Personel(long idpersonel,String ad,String soyad,String gorev,int yas,String isegiristarihi,String istencikistarihi,String projeler,String ozgecmis,String sertifika, String email) {
		this.idpersonel=idpersonel;
		this.ad=ad;
		this.soyad=soyad;
		this.gorev=gorev;
		this.yas=yas;
		this.isegiristarihi=isegiristarihi;
		this.istencikistarihi=istencikistarihi;
		this.projeler=projeler;
		this.ozgecmis=ozgecmis;
		this.sertifika=sertifika;
		this.email=email;
		
	}

	@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public long getIdpersonel() {
		return idpersonel;
	}
	public void setIdpersonel(long idpersonel) {
		this.idpersonel = idpersonel;
	}	

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public String getIsegiristarihi() {
		return isegiristarihi;
	}

	public void setIsegiristarihi(String isegiristarihi) {
		this.isegiristarihi = isegiristarihi;
	}	

	public String getIstencikistarihi() {
		return istencikistarihi;
	}

	public void setIstencikistarihi(String istencikistarihi) {
		this.istencikistarihi = istencikistarihi;
	}

	public String getProjeler() {
		return projeler;
	}

	public void setProjeler(String projeler) {
		this.projeler = projeler;
	}

	public String getOzgecmis() {
		return ozgecmis;
	}

	public void setOzgecmis(String ozgecmis) {
		this.ozgecmis = ozgecmis;
	}

	public String getSertifika() {
		return sertifika;
	}

	public void setSertifika(String sertifika) {
		this.sertifika = sertifika;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	


	
	

}
