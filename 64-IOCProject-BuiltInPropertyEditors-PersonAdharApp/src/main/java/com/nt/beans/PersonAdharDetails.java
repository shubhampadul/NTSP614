package com.nt.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class PersonAdharDetails {
	private long uid;
	private String name;
	private Date dob;
	private byte age;
	private File photo;
	private String[] verifiers;
	private URL linkedInUrl;
	private boolean isSingle;
	private char gender;
	private Class favoriteJavaClass;
	private double income;
	private Locale currentLocale;
	private Currency currency;
	private char[] initals;
	
	public PersonAdharDetails() {
		System.out.println("PersonAdharDetails no param consturctor");
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public String[] getVerifiers() {
		return verifiers;
	}

	public void setVerifiers(String[] verifiers) {
		this.verifiers = verifiers;
	}

	public URL getLinkedInUrl() {
		return linkedInUrl;
	}

	public void setLinkedInUrl(URL linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}

	public boolean isSingle() {
		return isSingle;
	}

	public void setSingle(boolean isSingle) {
		this.isSingle = isSingle;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Class getFavoriteJavaClass() {
		return favoriteJavaClass;
	}

	public void setFavoriteJavaClass(Class favoriteJavaClass) {
		this.favoriteJavaClass = favoriteJavaClass;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public Locale getCurrentLocale() {
		return currentLocale;
	}

	public void setCurrentLocale(Locale currentLocale) {
		this.currentLocale = currentLocale;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public char[] getInitals() {
		return initals;
	}

	public void setInitals(char[] initals) {
		this.initals = initals;
	}

	@Override
	public String toString() {
		return "PersonAdharDetails [uid=" + uid + ", name=" + name + ", dob=" + dob + ", age=" + age + ", photo="
				+ photo + ", verifiers=" + Arrays.toString(verifiers) + ", linkedInUrl=" + linkedInUrl + ", isSingle="
				+ isSingle + ", gender=" + gender + ", favoriteJavaClass=" + favoriteJavaClass + ", income=" + income
				+ ", currentLocale=" + currentLocale + ", currency=" + currency + ", initals="
				+ Arrays.toString(initals) + "]";
	}
	
	
}
