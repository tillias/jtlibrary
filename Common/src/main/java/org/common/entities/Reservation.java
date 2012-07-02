package org.common.entities;

import java.util.Date;

public class Reservation {

    public Book getBook() {
	return book;
    }

    public void setBook(Book book) {
	this.book = book;
    }

    public User getPerson() {
	return person;
    }

    public void setPerson(User person) {
	this.person = person;
    }

    public Date getReservationDate() {
	return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
	this.reservationDate = reservationDate;
    }

    public int getDuration() {
	return duration;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

    private Book book;
    private User person;
    private Date reservationDate;
    private int duration;
}
