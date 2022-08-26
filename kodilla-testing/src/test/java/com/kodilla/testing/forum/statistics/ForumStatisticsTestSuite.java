package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

	@Mock
	private static Statistics statisticsMock;

	private List<String> generateForumData(int users) {
		List<String> usersList = new ArrayList<>();
		for (int n = 1; n <= users; n++) {
			usersList.add(new String("user " + n));
		}
		return usersList;
	}

	@Test
	void testCalculateAdvStatisticsFor0Posts() {
		//Given
		List<String> forumUsers = generateForumData(5);
		ForumStatistics statistics = new ForumStatistics(statisticsMock);
		when(statisticsMock.postsCount()).thenReturn(0);

		//When
		statistics.calculateAdvStatistics(statisticsMock);
		double actualAveragePostsPerUser = statistics.averagePostsPerUser;
		double actualAverageCommentsPerUser = statistics.averageCommentsPerUser;
		double actualAverageCommentsPerPost = statistics.averageCommentsPerPost;
		statistics.showStatistics();

		//Then
		assertEquals(0, actualAveragePostsPerUser);
		assertEquals(0, actualAverageCommentsPerUser);
		assertEquals(0, actualAverageCommentsPerPost);
	}

	@Test
	void testCalculateAdvStatisticsFor1000Posts() {
		//Given
		ForumStatistics statistics = new ForumStatistics(statisticsMock);
		when(statisticsMock.usersNames()).thenReturn(generateForumData(500));
		when(statisticsMock.postsCount()).thenReturn(1000);
		when(statisticsMock.commentsCount()).thenReturn(1000);

		//When
		statistics.calculateAdvStatistics(statisticsMock);
		double actualAveragePostsPerUser = statistics.averagePostsPerUser;
		double actualAverageCommentsPerUser = statistics.averageCommentsPerUser;
		double actualAverageCommentsPerPost = statistics.averageCommentsPerPost;
		statistics.showStatistics();

		//Then
		assertEquals(2, actualAveragePostsPerUser);
		assertEquals(2, actualAverageCommentsPerUser);
		assertEquals(1, actualAverageCommentsPerPost);
	}

	@Test
	void testCalculateAdvStatisticsFor0Comments() {
		//Given
		ForumStatistics statistics = new ForumStatistics(statisticsMock);
		when(statisticsMock.usersNames()).thenReturn(generateForumData(5));
		when(statisticsMock.postsCount()).thenReturn(10);
		when(statisticsMock.commentsCount()).thenReturn(0);

		//When
		statistics.calculateAdvStatistics(statisticsMock);
		double actualAveragePostsPerUser = statistics.averagePostsPerUser;
		double actualAverageCommentsPerUser = statistics.averageCommentsPerUser;
		double actualAverageCommentsPerPost = statistics.averageCommentsPerPost;
		statistics.showStatistics();

		//Then
		assertEquals(2, actualAveragePostsPerUser);
		assertEquals(0, actualAverageCommentsPerUser);
		assertEquals(0, actualAverageCommentsPerPost);
	}

	@Test
	void testCalculateAdvStatisticsWhenNumberOfCommentsIsLowerThanPosts() {
		//Given
		ForumStatistics statistics = new ForumStatistics(statisticsMock);
		when(statisticsMock.usersNames()).thenReturn(generateForumData(5));
		when(statisticsMock.postsCount()).thenReturn(10);
		when(statisticsMock.commentsCount()).thenReturn(5);

		//When
		statistics.calculateAdvStatistics(statisticsMock);
		double actualAveragePostsPerUser = statistics.averagePostsPerUser;
		double actualAverageCommentsPerUser = statistics.averageCommentsPerUser;
		double actualAverageCommentsPerPost = statistics.averageCommentsPerPost;
		statistics.showStatistics();

		//Then
		assertEquals(2, actualAveragePostsPerUser);
		assertEquals(1, actualAverageCommentsPerUser);
		assertEquals(0.5, actualAverageCommentsPerPost);
	}

	@Test
	void testCalculateAdvStatisticsWhenNumberOfCommentsIsHigherThanPosts() {
		//Given
		ForumStatistics statistics = new ForumStatistics(statisticsMock);
		when(statisticsMock.usersNames()).thenReturn(generateForumData(5));
		when(statisticsMock.postsCount()).thenReturn(5);
		when(statisticsMock.commentsCount()).thenReturn(15);

		//When
		statistics.calculateAdvStatistics(statisticsMock);
		double actualAveragePostsPerUser = statistics.averagePostsPerUser;
		double actualAverageCommentsPerUser = statistics.averageCommentsPerUser;
		double actualAverageCommentsPerPost = statistics.averageCommentsPerPost;
		statistics.showStatistics();

		//Then
		assertEquals(1, actualAveragePostsPerUser);
		assertEquals(3, actualAverageCommentsPerUser);
		assertEquals(3, actualAverageCommentsPerPost);
	}

	@Test
	void testCalculateAdvStatisticsWhenNumberOfUsersIs0() {
		//Given
		ForumStatistics statistics = new ForumStatistics(statisticsMock);
		when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

		//When
		statistics.calculateAdvStatistics(statisticsMock);
		double actualAveragePostsPerUser = statistics.averagePostsPerUser;
		double actualAverageCommentsPerUser = statistics.averageCommentsPerUser;
		double actualAverageCommentsPerPost = statistics.averageCommentsPerPost;
		statistics.showStatistics();

		//Then
		assertEquals(0, actualAveragePostsPerUser);
		assertEquals(0, actualAverageCommentsPerUser);
		assertEquals(0, actualAverageCommentsPerPost);
	}

	@Test
	void testCalculateAdvStatisticsWhenNumberOfUsersIs100() {
		//Given
		ForumStatistics statistics = new ForumStatistics(statisticsMock);
		when(statisticsMock.usersNames()).thenReturn(generateForumData(100));
		when(statisticsMock.postsCount()).thenReturn(10);
		when(statisticsMock.commentsCount()).thenReturn(10);

		//When
		statistics.calculateAdvStatistics(statisticsMock);
		double actualAveragePostsPerUser = statistics.averagePostsPerUser;
		double actualAverageCommentsPerUser = statistics.averageCommentsPerUser;
		double actualAverageCommentsPerPost = statistics.averageCommentsPerPost;
		statistics.showStatistics();

		//Then
		assertEquals(0.1, actualAveragePostsPerUser);
		assertEquals(0.1, actualAverageCommentsPerUser);
		assertEquals(1, actualAverageCommentsPerPost);
	}
}