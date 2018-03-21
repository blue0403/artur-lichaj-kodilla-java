package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    //Number of users = 0
    public void testCalculateAdvStatisticsNr1(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUsersNames = new ArrayList<>();
        int numberOfPosts = 100;
        int numberOfComments = 500;
        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUser = forumStatistics.getPostsPerUser();
        double averageNumberOfCommentsPerUser = forumStatistics.getCommentsPerUser();
        double averageNumberOfCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(0, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(5, averageNumberOfCommentsPerPost, 0);
    }
    @Test
    //Number of users = 100
    public void testCalculateAdvStatisticsNr2(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUsersNames = new ArrayList<>();
        int tryCounter = 0;
        for (int n=0; n < 100; n++){
            tryCounter++;
            listOfUsersNames.add("Name of user #" + tryCounter);
        }
        int numberOfPosts = 2000;
        int numberOfComments = 9000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUser = forumStatistics.getPostsPerUser();
        double averageNumberOfCommentsPerUser = forumStatistics.getCommentsPerUser();
        double averageNumberOfCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(20, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(90, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(4, averageNumberOfCommentsPerPost, 5);
    }
    @Test
    //Number of comments = 0
    public void testCalculateAdvStatisticsNr3(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUsersNames = new ArrayList<>();
        int tryCounter = 0;
        for (int n=0; n < 10; n++){
            tryCounter++;
            listOfUsersNames.add("Name of user #" + tryCounter);
        }
        int numberOfPosts = 1000;
        int numberOfComments = 0;
        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUser = forumStatistics.getPostsPerUser();
        double averageNumberOfCommentsPerUser = forumStatistics.getCommentsPerUser();
        double averageNumberOfCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(100, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(0, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(0, averageNumberOfCommentsPerPost, 0);
    }
    @Test
    //Number of comments < Number of posts
    public void testCalculateAdvStatisticsNr4(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUsersNames = new ArrayList<>();
        int tryCounter = 0;
        for (int n=0; n < 20; n++){
            tryCounter++;
            listOfUsersNames.add("Name of user #" + tryCounter);
        }
        int numberOfPosts = 600;
        int numberOfComments = 400;
        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUser = forumStatistics.getPostsPerUser();
        double averageNumberOfCommentsPerUser = forumStatistics.getCommentsPerUser();
        double averageNumberOfCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(30, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(20, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(1, averageNumberOfCommentsPerPost, 5);
    }
    @Test
    //Number of comments > Number of posts
    public void testCalculateAdvStatisticsNr5(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUsersNames = new ArrayList<>();
        int tryCounter = 0;
        for (int n=0; n < 40; n++){
            tryCounter++;
            listOfUsersNames.add("Name of user #" + tryCounter);
        }
        int numberOfPosts = 800;
        int numberOfComments = 4000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUser = forumStatistics.getPostsPerUser();
        double averageNumberOfCommentsPerUser = forumStatistics.getCommentsPerUser();
        double averageNumberOfCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(20, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(100, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(5, averageNumberOfCommentsPerPost, 0);
    }
    @Test
    //Number of posts = 0
    public void testCalculateAdvStatisticsNr6(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUsersNames = new ArrayList<>();
        int tryCounter = 0;
        for (int n=0; n < 5; n++){
            tryCounter++;
            listOfUsersNames.add("Name of user #" + tryCounter);
        }
        int numberOfPosts = 0;
        int numberOfComments = 40;
        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUser = forumStatistics.getPostsPerUser();
        double averageNumberOfCommentsPerUser = forumStatistics.getCommentsPerUser();
        double averageNumberOfCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(8, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(0, averageNumberOfCommentsPerPost, 0);
    }
    @Test
    //Number of posts = 1000
    public void testCalculateAdvStatisticsNr7(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listOfUsersNames = new ArrayList<>();
        int tryCounter = 0;
        for (int n=0; n < 50; n++){
            tryCounter++;
            listOfUsersNames.add("Name of user #" + tryCounter);
        }
        int numberOfPosts = 1000;
        int numberOfComments = 6000;
        when(statisticsMock.usersNames()).thenReturn(listOfUsersNames);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfPostsPerUser = forumStatistics.getPostsPerUser();
        double averageNumberOfCommentsPerUser = forumStatistics.getCommentsPerUser();
        double averageNumberOfCommentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(20, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(120, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(6, averageNumberOfCommentsPerPost, 0);
    }
}
