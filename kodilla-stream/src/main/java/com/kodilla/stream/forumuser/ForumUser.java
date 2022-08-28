package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
	int userID;
	String userName;
	char sex;
	LocalDate birthDate;
	int publishedPosts;

	public ForumUser(int userID, String userName, char sex, LocalDate birthDate, int publishedPosts) {
		this.userID = userID;
		this.userName = userName;
		this.sex = sex;
		this.birthDate = birthDate;
		this.publishedPosts = publishedPosts;
	}

	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public char getSex() {
		return sex;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public int getPublishedPosts() {
		return publishedPosts;
	}

	@Override
	public String toString() {
		return "ForumUser{" +
				"userID=" + userID +
				", userName='" + userName + '\'' +
				", sex=" + sex +
				", birthDate=" + birthDate +
				", publishedPosts=" + publishedPosts +
				'}';
	}
}
