package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
	private final List<ForumUser> forumUserList = new ArrayList<>();

	public Forum() {

		forumUserList.add(new ForumUser(15447, "Jackie Chan", 'M', LocalDate.of(1954, 4,
				7), 455));
		forumUserList.add(new ForumUser(15738, "Cynthia Rothrock", 'F', LocalDate.of(1957, 3,
				8), 256));
		forumUserList.add(new ForumUser(16286, "Michelle Yeoh", 'F', LocalDate.of(1962, 8,
				6), 226));
		forumUserList.add(new ForumUser(163727, "Donnie Yen", 'M', LocalDate.of(1963, 7,
				27), 423));
		forumUserList.add(new ForumUser(163426, "Jet Li", 'M', LocalDate.of(1963, 4,
				26), 321));
		forumUserList.add(new ForumUser(183212, "Iko Uwais", 'M', LocalDate.of(1983, 2,
				12), 54));
		forumUserList.add(new ForumUser(19126, "Chun Li", 'F', LocalDate.of(1991, 2,
				6), 138));
		forumUserList.add(new ForumUser(212825, "Rurouni Kenshin", 'M', LocalDate.of(2012, 8,
				25), 98));
	}

	public List<ForumUser> getUserList() {
		return new ArrayList<>(forumUserList);
	}
}