package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {
	int usersNumber;
	int postsNumber;
	int commentsNumber;
	double averagePostsPerUser;
	double averageCommentsPerUser;
	double averageCommentsPerPost;
	Statistics statistics;

	public ForumStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public void calculateAdvStatistics(Statistics statistics) {
		usersNumber = statistics.usersNames().size();
		postsNumber = statistics.postsCount();
		commentsNumber = statistics.commentsCount();

		averagePostsPerUser = (usersNumber == 0) ? 0 : (double) postsNumber / usersNumber;
		averageCommentsPerUser = (usersNumber == 0) ? 0 : (double) commentsNumber / usersNumber;
		averageCommentsPerPost = (postsNumber == 0) ? 0: (double) commentsNumber / postsNumber;
	}

	public void showStatistics() {
		System.out.println("\n# Forum statistics #" +
				"\nNumber of users: " + usersNumber +
				"\nNumber of posts: " + postsNumber +
				"\nNumber of comments: " + commentsNumber +
				"\nAverage # of posts per user: " + averagePostsPerUser +
				"\nAverage # of comments per user: " + averageCommentsPerUser +
				"\nAverage # of comments per post: " + averageCommentsPerPost + "\n");
	}
}