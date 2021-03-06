package com.hhp227.application.chat;

import com.hhp227.application.user.User;

import java.io.Serializable;

public class Message implements Serializable {
	private int id;
	private String message, time;
	private User user;

	public Message() {
	}

	public Message(int id, String message, String time, User user) {
		this.id = id;
		this.message = message;
		this.time = time;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
